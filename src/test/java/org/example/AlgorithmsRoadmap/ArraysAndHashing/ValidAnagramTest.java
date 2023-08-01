package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidAnagramTest {

    @Test
    void isAnagram_correctAnagram_True() {
        String s = "anagram";
        String t = "nagaram";

        assertTrue(ValidAnagram.isAnagram(s, t));
    }

    @Test
    void isAnagram_incorrectAnagram_False() {
        String s = "rat";
        String t = "car";

        assertFalse(ValidAnagram.isAnagram(s, t));
    }
}
