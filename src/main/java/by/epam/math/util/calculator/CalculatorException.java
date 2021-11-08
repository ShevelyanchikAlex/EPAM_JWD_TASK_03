package by.epam.math.util.calculator;

/**
 * CalculatorException class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class CalculatorException extends Exception {

    /**
     * Parameterless {@link CalculatorException} constructor
     */
    public CalculatorException() {
    }

    /**
     * {@link CalculatorException} constructor with parameter
     *
     * @param message message
     */
    public CalculatorException(String message) {
        super(message);
    }

    /**
     * {@link CalculatorException} constructor with parameters
     *
     * @param message message
     * @param cause   cause
     */
    public CalculatorException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * {@link CalculatorException} constructor with parameter
     *
     * @param cause cause
     */
    public CalculatorException(Throwable cause) {
        super(cause);
    }
}
