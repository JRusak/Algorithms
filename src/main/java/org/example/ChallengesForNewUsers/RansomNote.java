package org.example.ChallengesForNewUsers;

import org.example.TestClass;

public class RansomNote {
    /*
    Given two strings ransomNote and magazine,
    return true if ransomNote can be constructed
    by using the letters from magazine and false
    otherwise.

    Each letter in magazine can only be used once
    in ransomNote.


    Constraints:
    1 <= ransomNote.length, magazine.length <= 10^5
    ransomNote and magazine consist of lowercase English letters.
     */

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;

        int[] letters = new int[26];

        for (char c: magazine.toCharArray())
            letters[c - 'a']++;

        for (char c: ransomNote.toCharArray()) {
            if (letters[c - 'a'] == 0) return false;
            letters[c - 'a']--;
        }

        return true;
    }

    public static boolean canConstructBest(String ransomNote, String magazine) {
        int[] arr = new int[26];

        for(char c : ransomNote.toCharArray()){
            int index = magazine.indexOf(c, arr[c - 'a']);
            if(index == -1) return false;
            arr[c - 'a'] = index + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: ransomNote = "a", magazine = "b"
        Output: false
        */
        String ransomNote1 = "a", magazine1 = "b";
        boolean output1 = false;
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(canConstruct(ransomNote1, magazine1)));
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(canConstructBest(ransomNote1, magazine1)));

        /*
        Example 2:

        Input: ransomNote = "aa", magazine = "ab"
        Output: false
        */
        String ransomNote2 = "aa", magazine2 = "ab";
        boolean output2 = false;
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(canConstruct(ransomNote2, magazine2)));
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(canConstructBest(ransomNote2, magazine2)));

        /*
        Example 3:

        Input: ransomNote = "aa", magazine = "aab"
        Output: true
         */
        String ransomNote3 = "aa", magazine3 = "aab";
        boolean output3 = true;
        TestClass.showOutput(3, String.valueOf(output3), String.valueOf(canConstruct(ransomNote3, magazine3)));
        TestClass.showOutput(3, String.valueOf(output3), String.valueOf(canConstructBest(ransomNote3, magazine3)));
    }
}
