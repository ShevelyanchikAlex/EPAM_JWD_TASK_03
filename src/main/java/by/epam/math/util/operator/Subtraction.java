package by.epam.math.util.operator;

/**
 * Subtraction class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Subtraction extends Operator {
    /**
     * Parameterless {@link Subtraction} constructor
     */
    public Subtraction() {
        super(0, (a, b) -> (a - b), '-');
    }
}
