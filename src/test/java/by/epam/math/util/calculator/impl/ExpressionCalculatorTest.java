package by.epam.math.util.calculator.impl;

import by.epam.math.util.calculator.Calculator;
import by.epam.math.util.calculator.CalculatorException;
import org.junit.Assert;
import org.junit.Test;

/**
 * ExpressionCalculatorTest class.
 * Testing the correct performance of methods
 * of the ExpressionCalculatorTest class.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ExpressionCalculatorTest {

    @Test
    public void testCalculate() {
        String expression = "(2+2)* 3  + 10";
        double expectedResult = 22;

        Calculator calculator = new ExpressionCalculator();
        double realResult = 0;
        try {
            realResult = calculator.calculate(expression);
        } catch (CalculatorException e) {
            e.printStackTrace();
        }

        Assert.assertEquals(expectedResult, realResult, 0.0);
    }
}