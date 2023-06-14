package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import org.example.TestClass;

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
    The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
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

    public static void main(String[] args) {
        /*
        Example 1:

        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
        */
        int[] input1 = {1, 2, 3, 4};
        int[] output1 = {24, 12, 8, 6};
        TestClass.showOutput(1, Arrays.toString(output1), Arrays.toString(productExceptSelf(input1)));

        /*
        Example 2:

        Input: nums = [-1,1,0,-3,3]
        Output: [0,0,9,0,0]
         */
        int[] input2 = {-1, 1, 0, -3, 3};
        int[] output2 = {0, 0, 9, 0, 0};
        TestClass.showOutput(2, Arrays.toString(output2), Arrays.toString(productExceptSelfOther(input2)));
    }
}
