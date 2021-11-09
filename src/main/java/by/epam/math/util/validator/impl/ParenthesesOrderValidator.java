package by.epam.math.util.validator.impl;

import by.epam.math.util.validator.ExpressionValidator;

import java.util.*;

/**
 * ParenthesesOrderValidator class.
 * Implements ExpressionValidator.
 *
 * @author Alex Shevelyanchik
 * @version 1.0
 */
public class ParenthesesOrderValidator implements ExpressionValidator {

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isValid(String expression) {
        LinkedList<Character> parentheses = new LinkedList<>();

        for (int i = 0; i < expression.length(); i++) {
            char elem = expression.charAt(i);
            if (elem == '(') {
                parentheses.add(elem);
            } else if (elem == ')') {
                if (parentheses.isEmpty() || parentheses.removeLast() != '(') {
                    return false;
                }
            }
        }
        return parentheses.isEmpty();
    }
}
