package org.example.AlgorithmsRoadmap.ArraysAndHashing;

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

        for (int i = 0; i < k && !map.isEmpty(); i++) {
            int key = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
            result[i] = key;
            map.remove(key);
        }

        return result;
    }

    @SuppressWarnings("unchecked")
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
        for (int i = nums.length; i >= 0 && index != k; i--)
            if (bucket[i] != null)
                for (int n : bucket[i]) {
                    result[index++] = n;
                    if (index == k)
                        break;
                }

        return result;
    }
}
