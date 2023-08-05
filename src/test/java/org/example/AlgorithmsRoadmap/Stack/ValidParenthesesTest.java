package org.example.AlgorithmsRoadmap.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidParenthesesTest {

    @Test
    void isValid_validSinglePair_true() {
        String input = "()";

        assertTrue(ValidParentheses.isValid(input));
    }

    @Test
    void isValid_validThreeDifferentPairs_true() {
        String input = "([]){}";

        assertTrue(ValidParentheses.isValid(input));
    }

    @Test
    void isValid_invalidPair_false() {
        String input = "(]";

        assertFalse(ValidParentheses.isValid(input));
    }

    @Test
    void isValid_invalidSingleParen_false() {
        String input = "]";

        assertFalse(ValidParentheses.isValid(input));
    }
}
