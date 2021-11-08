package by.epam.math.util.operation;

/**
 * Operation interface.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public interface Operation {
    /**
     * Serves to implement the calculation of the value of an expression
     *
     * @param a {@link Double} first parameter
     * @param b {@link Double} second parameter
     * @return {@link Double} result of calculations
     */
    double calculate(double a, double b);
}
