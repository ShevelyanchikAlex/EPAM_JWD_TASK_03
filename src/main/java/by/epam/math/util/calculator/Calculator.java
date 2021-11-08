package by.epam.math.util.calculator;

/**
 * Calculator interface.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface Calculator {
    /**
     * Calculates the value of an expression.
     *
     * @param expression {@link String} containing the expression
     * @return {@link Double} result of calculations
     * @throws CalculatorException if order of open and closed parentheses is invalid
     */
    double calculate(String expression) throws CalculatorException;
}
