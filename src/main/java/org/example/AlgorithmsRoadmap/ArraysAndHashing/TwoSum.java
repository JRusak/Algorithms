package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import java.util.HashMap;

public class TwoSum {
    /*
    Given an array of integers nums and an integer
    target, return indices of the two numbers such
    that they add up to target.

    You may assume that each input would have exactly
    one solution, and you may not use the same element
    twice.

    You can return the answer in any order.


    Constraints:
    2 <= nums.length <= 10^4
    -10^9 <= nums[i] <= 10^9
    -10^9 <= target <= 10^9
    Only one valid answer exists.
    */
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++)
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target)
                    return new int[]{i, j};
            }

        return new int[]{};
    }

    public static int[] twoSumOptimized(int[] nums, int target) {
        HashMap<Integer, Integer> differences = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int currentValue = nums[i];
            int diff = target - currentValue;

            if (differences.containsKey(currentValue)) {
                return new int[]{differences.get(currentValue), i};
            }
            differences.put(diff, i);
        }

        return new int[]{};
    }
}
