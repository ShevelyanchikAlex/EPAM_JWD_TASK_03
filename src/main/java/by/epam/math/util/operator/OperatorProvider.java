package by.epam.math.util.operator;

import java.util.HashMap;
import java.util.Map;

/**
 * OperatorProvider class.
 * Allows interacting with operators. Gets them themselves
 * and their sign priority by operation's sign.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class OperatorProvider {
    /**
     * {@link HashMap<>} with Operators where the keys are their signs
     */
    private static final Map<Character, Operator> operatorMap = new HashMap<>() {
        {
            put('+', new Addition());
            put('-', new Subtraction());
            put('*', new Multiplication());
            put('/', new Division());
            put('(', new OpenParenthesis());
            put(')', new CloseParenthesis());
        }
    };

    /**
     * Gets Operator by operation's sign
     *
     * @param operationSign {@link Character} operation's sign
     * @return {@link Operator}
     */
    public static Operator getOperatorByOperationSign(char operationSign) {
        return operatorMap.get(operationSign);
    }

    /**
     * Gets operator's priority
     *
     * @param operationSign {@link Character} operation's sign
     * @return {@link Operator}
     */
    public static int getPriorityByOperationSign(char operationSign) {
        int priority = -1;

        if (operatorMap.get(operationSign) != null) {
            priority = operatorMap.get(operationSign).getPriority();
        }
        return priority;
    }

    /**
     * Private constructor to close the ability of instantiating {@link OperatorProvider}
     */
    private OperatorProvider() {
    }
}
