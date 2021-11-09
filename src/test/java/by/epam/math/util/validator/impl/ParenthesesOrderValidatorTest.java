package by.epam.math.util.validator.impl;

import by.epam.math.util.validator.ExpressionValidator;
import org.junit.Assert;
import org.junit.Test;

/**
 * ParenthesesOrderValidatorTest class.
 * Testing the correct performance of methods
 * of the ParenthesesOrderValidatorTest class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ParenthesesOrderValidatorTest {

    @Test
    public void testIsValid() {
        String expression = "(2+2)* (3  + 10)";

        ExpressionValidator expressionValidator = new ParenthesesOrderValidator();
        Assert.assertTrue(expressionValidator.isValid(expression));
    }

    @Test
    public void testIsInvalid() {
        String expression = "(2+2)))* (3  + 10)";

        ExpressionValidator expressionValidator = new ParenthesesOrderValidator();
        Assert.assertFalse(expressionValidator.isValid(expression));
    }
}