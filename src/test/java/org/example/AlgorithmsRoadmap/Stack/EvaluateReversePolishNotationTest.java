package org.example.AlgorithmsRoadmap.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationTest {

    @Test
    void evalRPN_addWithMul_number() {
        // Explanation: ((2 + 1) * 3) = 9
        String[] tokens = {"2", "1", "+", "3", "*"};
        int output = 9;
        assertEquals(output,
                EvaluateReversePolishNotation.evalRPN(tokens)
        );
    }

    @Test
    void evalRPN_addWithDiv_number() {
        // Explanation: (4 + (13 / 5)) = 6
        String[] tokens = {"4", "13", "5", "/", "+"};
        int output = 6;
        assertEquals(output,
                EvaluateReversePolishNotation.evalRPN(tokens)
        );
    }

    @Test
    void evalRPN_manyOperatorsAndLevels_number() {
        /*
        Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
                = ((10 * (6 / (12 * -11))) + 17) + 5
                = ((10 * (6 / -132)) + 17) + 5
                = ((10 * 0) + 17) + 5
                = (0 + 17) + 5
                = 17 + 5
                = 22
        */
        String[] tokens = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "-"};
        int output = 12;
        assertEquals(output,
                EvaluateReversePolishNotation.evalRPN(tokens)
        );
    }
}
