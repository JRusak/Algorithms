package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

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
}
