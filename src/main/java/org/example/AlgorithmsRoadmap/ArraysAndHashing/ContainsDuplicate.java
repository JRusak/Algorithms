package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import java.util.HashSet;

public class ContainsDuplicate {
    /*
    Given an integer array nums, return true if any value appears at
    least twice in the array, and return false if every element is distinct.


    Constraints:
    1 <= nums.length <= 10^5
    -10^9 <= nums[i] <= 10^9
    */
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> res = new HashSet<>();
        for (int n : nums) {
            if (res.contains(n))
                return true;
            res.add(n);
        }
        return false;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: nums = [1,2,3,1]
        Output: true
        */
        int[] nums_1 = {1, 2, 3, 1};
        System.out.println(containsDuplicate(nums_1));

        /*
        Example 2:

        Input: nums = [1,2,3,4]
        Output: false
         */
        int[] nums_2 = {1, 2, 3, 4};
        System.out.println(containsDuplicate(nums_2));

        /*
        Example 3:

        Input: nums = [1,1,1,3,3,4,3,2,4,2]
        Output: true
        */
        int[] nums_3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(containsDuplicate(nums_3));
    }
}
