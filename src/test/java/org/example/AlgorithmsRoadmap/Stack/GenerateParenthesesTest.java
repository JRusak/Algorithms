package org.example.AlgorithmsRoadmap.Stack;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class GenerateParenthesesTest {

    @Test
    void generateParenthesis_3Pairs_6Combinations() {
        int input = 3;
        List<String> output = new ArrayList<>() {{
            add("((()))");
            add("(()())");
            add("(())()");
            add("()(())");
            add("()()()");
        }};

        assertTrue(
                output.containsAll(
                        GenerateParentheses.generateParenthesis(input)
                )
        );
        assertTrue(
                output.containsAll(
                        GenerateParentheses.generateParenthesisB(input)
                )
        );
    }

    @Test
    void generateParenthesis_1Pair_1Combination() {
        int input = 1;
        List<String> output = new ArrayList<>() {{
            add("()");
        }};

        assertTrue(
                output.containsAll(
                        GenerateParentheses.generateParenthesis(input)
                )
        );
        assertTrue(
                output.containsAll(
                        GenerateParentheses.generateParenthesisB(input)
                )
        );
    }
}
