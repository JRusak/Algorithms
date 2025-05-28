package org.example.AlgorithmsRoadmap.TwoPointers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidPalindromeTest {
    
    private void assertValidPalindromeMethods(
        String s, 
        boolean expected
    ) {
        assertEquals(
            expected,
            ValidPalindrome.isPalindrome(s)
        );
        assertEquals(
            expected,
            ValidPalindrome.isPalindromeOptimal(s)
        );
    }

    @Test
    void isPalindrome_emptyString_True() {
        String s = "";

        assertValidPalindromeMethods(s, true);
    }

    @Test
    void isPalindrome_oneLetter_True() {
        String s = "a";

        assertValidPalindromeMethods(s, true);
    }

    @Test
    void isPalindrome_example1_True() {
        String s = "A man, a plan, a canal: Panama";

        assertValidPalindromeMethods(s, true);
    }

    @Test
    void isPalindrome_example2_False() {
        String s = "race a car";

        assertValidPalindromeMethods(s, false);
    }

    @Test
    void isPalindrome_example3_True() {
        String s = " ";

        assertValidPalindromeMethods(s, true);
    }
}
