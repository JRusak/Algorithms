package org.example.AlgorithmsRoadmap.Stack;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    /*
    You are given an array of strings tokens that represents
    an arithmetic expression in a Reverse Polish Notation.

    Evaluate the expression. Return an integer that represents
    the value of the expression.

    Note that:
    The valid operators are '+', '-', '*', and '/'.
    Each operand may be an integer or another expression.
    The division between two integers always truncates toward zero.
    There will not be any division by zero.
    The input represents a valid arithmetic expression in a reverse polish notation.
    The answer and all the intermediate calculations can be represented in a 32-bit integer.


    Constraints:
    1 <= tokens.length <= 10^4
    tokens[i] is either an operator: "+", "-", "*", or "/", or an integer in the range [-200, 200].
     */
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token: tokens) {
            if ("+-*/".contains(token)) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+" -> stack.push(a + b);
                    case "-" -> stack.push(a - b);
                    case "*" -> stack.push(a * b);
                    case "/" -> stack.push(a / b);
                }
            } else
                stack.push(Integer.valueOf(token));
        }

        return stack.pop();
    }
}
