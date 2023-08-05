package org.example.AlgorithmsRoadmap.Stack;

import org.example.Nodes.BracketsNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParentheses {
    /*
    Given n pairs of parentheses, write a function to
    generate all combinations of well-formed parentheses.


    Constraints:
    1 <= n <= 8
     */
    public static List<String> generateParenthesis(int n) {
        List<String> combinations = new ArrayList<>();
        Stack<BracketsNode> stack = new Stack<>();

        stack.push(new BracketsNode("(", 1, 0));

        while (!stack.empty()) {
            BracketsNode node = stack.pop();
            String s = node.parentheses.toString();

            if (s.length() == n * 2) {
                combinations.add(s);
                continue;
            }

            if (node.openingUsed == node.closingUsed) {
                node.parentheses.append("(");
                node.openingUsed++;
                stack.push(node);
            } else if (node.openingUsed > node.closingUsed) {

                if (node.openingUsed < n) {
                    BracketsNode newNode = new BracketsNode(s, node.openingUsed, node.closingUsed);
                    newNode.parentheses.append("(");
                    newNode.openingUsed++;
                    stack.push(newNode);
                }

                node.parentheses.append(")");
                node.closingUsed++;
                stack.push(node);
            }
        }

        return combinations;
    }

    public static void backtrack(List<String> combinations, int openN, int closedN, String s, int n) {
        if (openN == closedN && closedN == n)
            combinations.add(s);

        if (openN < n)
            backtrack(combinations, openN + 1, closedN, s + "(", n);

        if (closedN < openN)
            backtrack(combinations, openN, closedN + 1, s + ")", n);
    }

    public static List<String> generateParenthesisB(int n) {
        List<String> combinations = new ArrayList<>();
        backtrack(combinations, 0, 0, "", n);
        return combinations;
    }
}
