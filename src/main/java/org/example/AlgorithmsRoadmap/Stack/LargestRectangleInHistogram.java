package org.example.AlgorithmsRoadmap.Stack;

import java.util.Stack;

public class LargestRectangleInHistogram {

    /*
     * Given an array of integers heights representing 
     * the histogram's bar height where the width of 
     * each bar is 1, return the area of the largest 
     * rectangle in the histogram.
     * 
     * Constraints:
     * 1 <= heights.length <= 10^5
     * 0 <= heights[currentLevel] <= 10^4
     */

    private static class TempTuple {
        public int level;
        public int buildings;

        public TempTuple(int level, int buildings) {
            this.level = level;
            this.buildings = buildings;
        }
    }

    private static int getMaxArea(
        Stack<TempTuple> stack,
        int currentLevel,
        int maxArea
    ) {
        int buildingsOnNewLevel = 0;
        while (!stack.empty() && stack.peek().level > currentLevel) {
            TempTuple tup = stack.pop();
            maxArea = Math.max(maxArea, tup.level * (tup.buildings + buildingsOnNewLevel));
            buildingsOnNewLevel += tup.buildings;
        }

        if (!stack.empty() && stack.peek().level == currentLevel) {
            stack.peek().buildings += buildingsOnNewLevel + 1;
        } else {
            stack.add(new TempTuple(currentLevel, buildingsOnNewLevel + 1));
        }

        return maxArea;
    }

    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<TempTuple> stack = new Stack<>();
        int lastLevel = 0;

        for (int currentLevel : heights) {
            if (stack.empty() || currentLevel > lastLevel) {
                stack.add(new TempTuple(currentLevel, 1));
            } else if (currentLevel == lastLevel) {
                stack.peek().buildings += 1;
            } else {
                maxArea = getMaxArea(stack, currentLevel, maxArea);
            }

            lastLevel = currentLevel;
        }

        return getMaxArea(stack, 0, maxArea);
    }

    public static int largestRectangleAreaBetter(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>(); // pair: (index, height)

        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.empty() && stack.peek()[1] > heights[i]) {
                int[] top = stack.pop();
                int index = top[0];
                int height = top[1];
                maxArea = Math.max(maxArea, height * (i - index));
                start = index;
            }
            stack.push(new int[]{start, heights[i]});
        }

        for (int[] pair : stack) {
            int index = pair[0];
            int height = pair[1];
            maxArea = Math.max(maxArea, height * (heights.length - index));
        }

        return maxArea;
    }

    public static int largestRectangleAreaOptimal(int[] heights) {
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i <= n; i++) {
            while (!stack.empty() && (i == n || heights[stack.peek()] >= heights[i])) {
                int height = heights[stack.pop()];
                int width = stack.empty() ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }
}
