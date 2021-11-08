package by.epam.math.util.operator;

/**
 * Addition class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Addition extends Operator {
    /**
     * Parameterless {@link Addition} constructor
     */
    public Addition() {
        super(0, Double::sum, '+');
    }
}
