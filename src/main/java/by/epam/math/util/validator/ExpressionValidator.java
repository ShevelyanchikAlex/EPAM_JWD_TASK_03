package by.epam.math.util.validator;

/**
 * ExpressionValidator interface.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface ExpressionValidator {
    /**
     * Checks the expression for correctness by any parameters
     *
     * @param expression {@link String} containing the expression
     * @return true if the expression contains valid parameters, otherwise false
     */
    boolean isValid(String expression);
}
