package org.example.AlgorithmsRoadmap.Stack;

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
}
