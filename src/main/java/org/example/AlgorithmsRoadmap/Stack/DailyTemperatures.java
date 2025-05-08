package org.example.AlgorithmsRoadmap.Stack;

import java.util.Stack;

public class DailyTemperatures {

    /*
     * Given an array of integers temperatures represents
     * the daily temperatures, return an array answer such
     * that answer[i] is the number of days you have to
     * wait after the ith day to get a warmer temperature.
     * If there is no future day for which this is possible,
     * keep answer[i] == 0 instead.
     * 
     * 
     * Constraints:
     * 1 <= temperatures.length <= 10^5
     * 30 <= temperatures[i] <= 100
     */

    private static class TempTuple {
        public int value;
        public int position;

        public TempTuple(int value, int position) {
            this.value = value;
            this.position = position;
        }
    }
    
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<TempTuple> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        if (temperatures.length == 0) {
            return result;
        }

        for (int i = temperatures.length - 1; i >= 0; i--) {
            while (!stack.empty() && stack.peek().value <= temperatures[i]) {
                stack.pop();
            }

            if (!stack.empty()) {
                result[i] = stack.peek().position - i;
            }

            stack.push(new TempTuple(temperatures[i], i));
        }

        return result;
    }

    public static int[] dailyTemperaturesFaster(int[] temperatures) {
        Stack<int []> stack = new Stack<>();
        int[] result = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            int t = temperatures[i];

            while (!stack.empty() && t > stack.peek()[0]) {
                int[] pair = stack.pop();
                result[pair[1]] = i - pair[1];
            }

            stack.push(new int[]{t, i});
        }

        return result;
    }

    public static int[] dailyTemperaturesDynamic(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        for (int i = n - 2; i >= 0; i--) {
            int j = i + 1;
            while (j < n && temperatures[j] <= temperatures[i]) {
                if (result[j] == 0) {
                    j = n;
                    break;
                }

                j += result[j];
            }

            if (j < n) {
                result[i] = j - i;
            }
        }

        return result;
    }
}
