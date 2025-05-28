package org.example.AlgorithmsRoadmap.TwoPointers;

public class ValidPalindrome {

    /*
     * A phrase is a palindrome if, after converting all 
     * uppercase letters into lowercase letters and removing 
     * all non-alphanumeric characters, it reads the same 
     * forward and backward. Alphanumeric characters include 
     * letters and numbers.
     * 
     * Given a string s, return true if it is a palindrome, 
     * or false otherwise.
     * 
     * Constraints:
     * 1 <= s.length <= 2 * 10^5
     * s consists only of printable ASCII characters.
     */

    public static boolean isPalindrome(String s) {
        s = s.replaceAll(
            "[^a-zA-Z0-9]",
            ""
            ).toLowerCase();
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i++) != s.charAt(j--)) {
                return false;
            } 
        }

        return true;
    }

    private static boolean isAlphaNum(char c) {
        return (c >= 'A' && c <= 'Z' ||
                c >= 'a' && c <= 'z' ||
                c >= '0' && c <= '9');
    }

    public static boolean isPalindromeOptimal(String s) {
        int l = 0, r = s.length() - 1;

        while (l < r) {
            while (l < r && !isAlphaNum(s.charAt(l))) {
                l++;
            }
            while (l < r && !isAlphaNum(s.charAt(r))) {
                r--;
            }
            if (Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) {
                return false;
            }
        }

        return true;
    }
}
