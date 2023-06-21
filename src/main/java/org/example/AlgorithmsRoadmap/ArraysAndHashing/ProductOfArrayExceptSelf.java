package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    /*
    Given an integer array nums, return an array answer
    such that answer[i] is equal to the product of all
    the elements of nums except nums[i].

    The product of any prefix or suffix of nums is
    guaranteed to fit in a 32-bit integer.

    You must write an algorithm that runs in O(n)
    time and without using the division operation.


    Constraints:
    2 <= nums.length <= 10^5
    -30 <= nums[i] <= 30
    The product of any prefix or suffix of nums is
    guaranteed to fit in a 32-bit integer.
     */

    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        Arrays.fill(result, 1);

        int n = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] *= n;
            n *= nums[i];
        }

        n = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            result[i] *= n;
            n *= nums[i];
        }

        return result;
    }

    public static int[] productExceptSelfOther(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;

        for (int i = 0; i < nums.length - 1; i++)
            result[i + 1] = result[i] * nums[i];

        for (int i = nums.length - 2; i >= 0; i--) {
            result[i] *= nums[i + 1];
            nums[i] *= nums[i + 1];
        }

        return result;
    }
}
