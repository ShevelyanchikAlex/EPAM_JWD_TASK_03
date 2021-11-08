package by.epam.math.util.operator;

/**
 * Division class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class Division extends Operator {
    /**
     * Parameterless {@link Division} constructor
     */
    public Division() {
        super(1, (a, b) -> (a / b), '/');
    }
}
