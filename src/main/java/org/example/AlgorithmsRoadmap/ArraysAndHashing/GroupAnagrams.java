package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import java.util.*;

public class GroupAnagrams {
    /*
    Given an array of strings strs, group the anagrams together.
    You can return the answer in any order.

    An Anagram is a word or phrase formed by rearranging the
    letters of a different word or phrase, typically using all
    the original letters exactly once.

    Constraints:

    1 <= strs.length <= 10^4
    0 <= strs[i].length <= 100
    strs[i] consists of lowercase English letters.
    */

    public static boolean addAnagramToTheList(String s, List<List<String>> list) {
        for (List<String> l: list) {
            if (ValidAnagram.isAnagram(s, l.get(0))) {
                l.add(s);
                return true;
            }
        }
        return false;
    }
    public static List<List<String>> groupAnagramsFirstIdea(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for (String s: strs) {
            if (!addAnagramToTheList(s, result))
                result.add(new ArrayList<>() {{add(s);}});
        }
        return result;
    }

    public static List<List<String>> groupAnagramsOptimized(String[] strs) {
        List<List<String>> result = new ArrayList<>();

        if (strs.length == 0) return result;

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            int[] hash = new int[26];

            for (char c: s.toCharArray()) {
                hash[c - 'a']++;
            }

            String key = Arrays.toString(hash);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            map.get(key).add(s);
        }

        result.addAll(map.values());
        return result;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: strs = ["eat","tea","tan","ate","nat","bat"]
        Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
        */
        String[] strs1 = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagramsFirstIdea(strs1));
        System.out.println((groupAnagramsOptimized(strs1)));

        /*
        Example 2:

        Input: strs = [""]
        Output: [[""]]
        */
        String[] strs2 = {""};
        System.out.println(groupAnagramsFirstIdea(strs2));
        System.out.println(groupAnagramsOptimized(strs2));

        /*
        Example 3:

        Input: strs = ["a"]
        Output: [["a"]]
        */
        String[] strs3 = {"a"};
        System.out.println(groupAnagramsFirstIdea(strs3));
        System.out.println(groupAnagramsOptimized(strs3));
    }
}
