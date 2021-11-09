package by.epam.math.util.calculator.impl;

import by.epam.math.util.calculator.Calculator;
import by.epam.math.util.calculator.CalculatorException;
import by.epam.math.util.operator.OpenParenthesis;
import by.epam.math.util.operator.Operator;
import by.epam.math.util.operator.OperatorProvider;
import by.epam.math.util.validator.ExpressionValidator;
import by.epam.math.util.validator.impl.ParenthesesOrderValidator;

import java.util.LinkedList;

/**
 * ExpressionCalculator class.
 * Implements Calculator.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ExpressionCalculator implements Calculator {
    /**
     * Constant containing the exception message
     */
    private static final String WRONG_PARENTHESES_ORDER_MSG = "Wrong order of open and closed parentheses!";
    /**
     * ExpressionValidator object to check input expression for validity
     */
    private static final ExpressionValidator parenthesesOrderValidator = new ParenthesesOrderValidator();

    /**
     * {@inheritDoc}
     */
    @Override
    public double calculate(String expression) throws CalculatorException {
        if (!parenthesesOrderValidator.isValid(expression)) {
            throw new CalculatorException(WRONG_PARENTHESES_ORDER_MSG);
        }

        LinkedList<Double> numbers = new LinkedList<>();
        LinkedList<Operator> operators = new LinkedList<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentElement = expression.charAt(i);

            if (isEmptyChar(currentElement)) {
                continue;
            }

            if (currentElement == '(') {
                operators.add(new OpenParenthesis());
            } else if (currentElement == ')') {
                while (operators.getLast().getOperationSign() != '(') {
                    numbers.add(calculatePartExpression(operators, numbers));
                }
                operators.removeLast();
            } else if (OperatorProvider.getOperatorByOperationSign(currentElement) != null) {
                while (!operators.isEmpty() && operators.getLast().getPriority() >= OperatorProvider.getPriorityByOperationSign(currentElement)) {
                    numbers.add(calculatePartExpression(operators, numbers));
                }
                operators.add(OperatorProvider.getOperatorByOperationSign(currentElement));
            } else {
                StringBuilder num = new StringBuilder();
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num.append(expression.charAt(i++));
                }
                i--;
                numbers.add(Double.parseDouble(num.toString()));
            }
        }

        while (!operators.isEmpty()) {
            numbers.add(calculatePartExpression(operators, numbers));
        }
        return numbers.removeLast();
    }

    /**
     * Checks a character for emptiness
     *
     * @param c current character
     * @return true if current character is empty, otherwise false
     */
    private static boolean isEmptyChar(char c) {
        return c == ' ';
    }


    /**
     * Calculates a simple expression
     *
     * @param operators {@link LinkedList<Operator>} list with operators
     * @param numbers   {@link LinkedList<Double>} list with numbers
     * @return {@link Double} result of calculations
     */
    private static double calculatePartExpression(LinkedList<Operator> operators, LinkedList<Double> numbers) {
        Operator operator = operators.removeLast();
        return operator.calculate(numbers.removeLast(), numbers.removeLast());
    }


    /**
     * Private constructor to close the ability of instantiating {@link ExpressionCalculator}
     */
    public ExpressionCalculator() {
    }

}
