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
}
