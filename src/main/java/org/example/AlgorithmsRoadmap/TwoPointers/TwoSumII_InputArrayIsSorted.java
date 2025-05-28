package org.example.AlgorithmsRoadmap.TwoPointers;

public class TwoSumII_InputArrayIsSorted {

    /*
     * Given a 1-indexed array of integers numbers that 
     * is already sorted in non-decreasing order, find 
     * two numbers such that they add up to a specific 
     * target number. Let these two numbers be numbers[index1] 
     * and numbers[index2] where 
     * 1 <= index1 < index2 <= numbers.length.
     * 
     * Return the indices of the two numbers, 
     * index1 and index2, added by one as an integer 
     * array [index1, index2] of length 2.
     * 
     * The tests are generated such that there is exactly 
     * one solution. You may not use the same element twice.
     * 
     * Your solution must use only constant extra space.
     */
    
    public static int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        int sum = numbers[l] + numbers[r];
        while (l < r) {
            sum = numbers[l] + numbers[r];
            if (sum > target) {
                r--;
            } else if (sum < target) {
                l++;
            } else {
                return new int[]{l + 1, r + 1};
            }
        }

        return new int[0];
    }
}
