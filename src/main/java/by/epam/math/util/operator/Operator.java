package by.epam.math.util.operator;

import by.epam.math.util.operation.Operation;

/**
 * Operator abstract class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public abstract class Operator {
    /**
     * Priority of the operation
     */
    private final int priority;
    /**
     * The operation performed by operator
     */
    private final Operation operation;
    /**
     * Sign of operation
     */
    private final char operationSign;

    /**
     * {@link Operator} constructor with parameters
     *
     * @param priority      priority of the operation
     * @param operation     operation performed by operator
     * @param operationSign sign of operation
     */
    public Operator(int priority, Operation operation, char operationSign) {
        this.priority = priority;
        this.operation = operation;
        this.operationSign = operationSign;
    }

    /**
     * Gets priority of the operation
     *
     * @return {@link Integer}
     */
    public int getPriority() {
        return priority;
    }

    /**
     * Gets operation performed by operator
     *
     * @return {@link Operation}
     */
    public Operation getOperation() {
        return operation;
    }

    /**
     * Gets sign of operation
     *
     * @return {@link Character}
     */
    public char getOperationSign() {
        return operationSign;
    }

    /**
     * Calculates the value of an expression.
     *
     * @param a {@link Double} first parameter
     * @param b {@link Double} second parameter
     * @return {@link Double} result of calculations
     */
    public double calculate(double a, double b) {
        return operation.calculate(a, b);
    }
}
