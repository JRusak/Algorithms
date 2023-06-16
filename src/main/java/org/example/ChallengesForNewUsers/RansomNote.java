package org.example.ChallengesForNewUsers;

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
}
