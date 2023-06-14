package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import org.example.TestClass;

import java.util.*;

public class TopKFrequentElements {
    /*
    Given an integer array nums and an integer k,
    return the k most frequent elements. You may
    return the answer in any order.


    Constraints:
    1 <= nums.length <= 10^5
    -10^4 <= nums[i] <= 10^4
    k is in the range [1, the number of unique elements in the array].
    It is guaranteed that the answer is unique.
     */

    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int n: nums) {
            if (map.containsKey(n))
                map.put(n, map.get(n) + 1);
            else
                map.put(n, 1);
        }

        for (int i = 0; i < k; i++) {
            int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            result[i] = key;
            map.remove(key);
        }

        return result;
    }

    public static int[] topKFrequentOptimized(int[] nums, int k) {
        int[] result = new int[k];
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        Map<Integer, Integer> map = new HashMap<>();

        for (int n: nums) map.merge(n, 1, Integer::sum);

        for (int key: map.keySet()) {
            int freq = map.get(key);
            if (bucket[freq] == null)
                bucket[freq] = new ArrayList<>();
            bucket[freq].add(key);
        }

        int index = 0;
        for (int i = nums.length; i >= 0; i--)
            if (bucket[i] != null)
                for (int n: bucket[i]) {
                    result[index++] = n;
                    if (index == k)
                        return result;
                }

        return result;
    }


    public static void main(String[] args) {
        /*
        Example 1:

        Input: nums = [1,1,1,2,2,3], k = 2
        Output: [1,2]
         */
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2;
        int[] output1 = {1,2};
        TestClass.showOutput(1, Arrays.toString(output1), Arrays.toString(topKFrequent(nums1, k1)));
        TestClass.showOutput(1, Arrays.toString(output1), Arrays.toString(topKFrequentOptimized(nums1, k1)));

        /*
        Example 2:

        Input: nums = [1], k = 1
        Output: [1]
         */
        int[] nums2 = {1};
        int k2 = 1;
        int[] output2 = {1};
        TestClass.showOutput(2, Arrays.toString(output2), Arrays.toString(topKFrequent(nums2, k2)));
        TestClass.showOutput(2, Arrays.toString(output2), Arrays.toString(topKFrequentOptimized(nums2, k2)));

        /*
        Example 3:

        Input: nums = [1,2], k = 2
        Output: [1,2]
         */
        int[] nums3 = {1,2};
        int k3 = 2;
        int[] output3 = {1,2};
        TestClass.showOutput(3, Arrays.toString(output3), Arrays.toString(topKFrequent(nums3, k3)));
        TestClass.showOutput(3, Arrays.toString(output3), Arrays.toString(topKFrequentOptimized(nums3, k3)));
    }
}
