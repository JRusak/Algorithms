package org.example.AlgorithmsRoadmap.ArraysAndHashing;

public class ValidAnagram {
    /*
    Given two strings s and t, return true if t is an
    anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging
    the letters of a different word or phrase, typically
    using all the original letters exactly once.


    Constraints:
    1 <= s.length
    t.length <= 5 * 10^4
    s and t consist of lowercase English letters.
    */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] letters = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letters[s.charAt(i) - 'a']++;
            letters[t.charAt(i) - 'a']--;
        }

        for (int n : letters) if (n != 0) return false;

        return true;
    }
}
