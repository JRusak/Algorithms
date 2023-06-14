package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    /*
    Given an array of integers nums and an integer target, return
    indices of the two numbers such that they add up to target.

    You may assume that each input would have exactly one solution,
    and you may not use the same element twice.

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

    public static void main(String[] args) {
        /*
        Example 1:

        Input: nums = [2,7,11,15], target = 9
        Output: [0,1]
        Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        */
        int[] nums_1 = {2,7,11,15};
        int target_1 = 9;
        System.out.println(Arrays.toString(twoSumBruteForce(nums_1, target_1)));
        System.out.println(Arrays.toString(twoSumOptimized(nums_1, target_1)));

        /*
        Example 2:

        Input: nums = [3,2,4], target = 6
        Output: [1,2]
        */
        int[] nums_2 = {3,2,4};
        int target_2 = 6;
        System.out.println(Arrays.toString(twoSumBruteForce(nums_2, target_2)));
        System.out.println(Arrays.toString(twoSumOptimized(nums_2, target_2)));

        /*
        Example 3:

        Input: nums = [3,3], target = 6
        Output: [0,1]
        */
        int[] nums_3 = {3,3};
        int target_3 = 6;
        System.out.println(Arrays.toString(twoSumBruteForce(nums_3, target_3)));
        System.out.println(Arrays.toString(twoSumOptimized(nums_3, target_3)));
    }
}
