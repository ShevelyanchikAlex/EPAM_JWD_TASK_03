package by.epam.math.util;

import by.epam.math.util.calculator.impl.ExpressionCalculatorTest;
import by.epam.math.util.validator.impl.ParenthesesOrderValidatorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * TestSuite class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
@Suite.SuiteClasses({ExpressionCalculatorTest.class, ParenthesesOrderValidatorTest.class})
@RunWith(Suite.class)
public class TestSuite {
}
