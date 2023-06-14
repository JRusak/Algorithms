package org.example.AlgorithmsRoadmap.ArraysAndHashing;

public class ValidAnagram {
    /*
    Given two strings s and t, return true if t is an
    anagram of s, and false otherwise.

    An Anagram is a word or phrase formed by rearranging
    the letters of a different word or phrase, typically
    using all the original letters exactly once.


    Constraints:
    1 <= s.length, t.length <= 5 * 10^4
    s and t consist of lowercase English letters.
    */
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] letts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            letts[s.charAt(i) - 'a']++;
            letts[t.charAt(i) - 'a']--;
        }

        for (int n : letts) if (n != 0) return false;

        return true;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: s = "anagram", t = "nagaram"
        Output: true
        */
        String s1 = "anagram", t1 = "nagaram";
        System.out.println(isAnagram(s1, t1));

        /*
        Example 2:

        Input: s = "rat", t = "car"
        Output: false
        */
        String s2 = "rat", t2 = "car";
        System.out.println(isAnagram(s2, t2));
    }
}
