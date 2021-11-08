package by.epam.math.util.operator;

/**
 * Multiplication class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Multiplication extends Operator {
    /**
     * Parameterless {@link Multiplication} constructor
     */
    public Multiplication() {
        super(1, (a, b) -> (a * b), '*');
    }
}
