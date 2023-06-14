package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import org.example.TestClass;

import java.util.*;

public class LongestConsecutiveSequence {
    /*
    Given an unsorted array of integers nums, return the
    length of the longest consecutive elements sequence.

    You must write an algorithm that runs in O(n) time.


    Constraints:
    0 <= nums.length <= 10^5
    -10^9 <= nums[i] <= 10^9
     */

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxLength = 0;

        for (int n: nums)
            set.add(n);

        for (int n: nums) {
            if (!set.contains(n))
                continue;

            int length = 1;
            set.remove(n);

            int tempSmaller = n - 1;
            int tempHigher = n + 1;

            while (set.contains(tempSmaller)) {
                length++;
                set.remove(tempSmaller--);
            }

            while (set.contains(tempHigher)) {
                length++;
                set.remove(tempHigher++);
            }

            if (length > maxLength)
                maxLength = length;
        }

        return maxLength;
    }

    public static int longestConsecutiveBest(int[] nums) {
        if (nums.length == 0) return 0;

        Arrays.sort(nums);
        int maxLength = 1;
        int length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                continue;

            if (nums[i] == nums[i - 1] + 1)
                length++;
            else {
                maxLength = Math.max(maxLength, length);
                length = 1;
            }
        }

        return Math.max(maxLength, length);
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: nums = [100,4,200,1,3,2]
        Output: 4
        Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
        */
        int[] input1 = {100, 4, 200, 1, 3, 2};
        int output1 = 4;
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(longestConsecutiveBest(input1)));

        /*
        Example 2:

        Input: nums = [0,3,7,2,5,8,4,6,0,1]
        Output: 9
         */
        int[] input2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int output2 = 9;
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(longestConsecutive(input2)));

        /*
        Example 3:

        Input: nums = [1,2,0,1]
        Output: 3
         */
        int[] input3 = {1, 2, 0, 1};
        int output3 = 3;
        TestClass.showOutput(3, String.valueOf(output3), String.valueOf(longestConsecutive(input3)));
    }
}
