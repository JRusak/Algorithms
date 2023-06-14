package org.example.AlgorithmsRoadmap.Stack;

import org.example.TestClass;

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

    public static void main(String[] args) {
        /*
        Example 1:

        Input: tokens = ["2","1","+","3","*"]
        Output: 9
        Explanation: ((2 + 1) * 3) = 9
        */
        String[] tokens1 = {"2", "1", "+", "3", "*"};
        int output1 = 9;
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(evalRPN(tokens1)));

        /*
        Example 2:

        Input: tokens = ["4","13","5","/","+"]
        Output: 6
        Explanation: (4 + (13 / 5)) = 6
        */
        String[] tokens2 = {"4", "13", "5", "/", "+"};
        int output2 = 6;
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(evalRPN(tokens2)));

        /*
        Example 3:

        Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
        Output: 22
        Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
        = ((10 * (6 / (12 * -11))) + 17) + 5
        = ((10 * (6 / -132)) + 17) + 5
        = ((10 * 0) + 17) + 5
        = (0 + 17) + 5
        = 17 + 5
        = 22
         */
        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        int output3 = 22;
        TestClass.showOutput(3, String.valueOf(output3), String.valueOf(evalRPN(tokens3)));
    }
}
