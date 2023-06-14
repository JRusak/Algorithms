package org.example.AlgorithmsRoadmap.Stack;

import org.example.TestClass;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    /*
    Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
    determine if the input string is valid.

    An input string is valid if:
    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.
    Every close bracket has a corresponding open bracket of the same type.


    Constraints:
    1 <= s.length <= 10^4
    s consists of parentheses only '()[]{}'.
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        for (char c: s.toCharArray()) {
            if (map.containsKey(c))
                stack.push(c);
            else
                if (stack.empty() || map.get(stack.peek()) != c)
                    return false;
                else
                    stack.pop();
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: s = "()"
        Output: true
        */
        String input1 = "()";
        boolean output1 = true;
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(isValid(input1)));

        /*
        Example 2:

        Input: s = "()[]{}"
        Output: true
         */
        String input2 = "()[]{}";
        boolean output2 = true;
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(isValid(input2)));

        /*
        Example 3:

        Input: s = "(]"
        Output: false
         */
        String input3 = "(]";
        boolean output3 = false;
        TestClass.showOutput(3, String.valueOf(output3), String.valueOf(isValid(input3)));

        /*
        Example 4:

        Input: s = "]"
        Output: false
         */
        String input4 = "]";
        boolean output4 = false;
        TestClass.showOutput(4, String.valueOf(output4), String.valueOf(isValid(input4)));
    }
}
