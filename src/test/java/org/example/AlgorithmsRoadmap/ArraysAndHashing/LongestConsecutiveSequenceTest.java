package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestConsecutiveSequenceTest {

    @Test
    void longestConsecutive_Nums_4() {
        /*
        Explanation: The longest consecutive elements
        sequence is [1, 2, 3, 4]. Therefore its length
        is 4.
         */
        int[] nums = {100, 4, 200, 1, 3, 2};
        int output = 4;

        assertEquals(
                output,
                LongestConsecutiveSequence
                        .longestConsecutive(nums)
        );

        assertEquals(
                output,
                LongestConsecutiveSequence
                        .longestConsecutiveBest(nums)
        );
    }

    @Test
    void longestConsecutive_Nums_9() {
        int[] nums = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int output = 9;

        assertEquals(
                output,
                LongestConsecutiveSequence
                        .longestConsecutive(nums)
        );

        assertEquals(
                output,
                LongestConsecutiveSequence
                        .longestConsecutiveBest(nums)
        );
    }

    @Test
    void longestConsecutive_Nums_3() {
        int[] nums = {1, 2, 0, 1};
        int output = 3;

        assertEquals(
                output,
                LongestConsecutiveSequence
                        .longestConsecutive(nums)
        );

        assertEquals(
                output,
                LongestConsecutiveSequence
                        .longestConsecutiveBest(nums)
        );
    }
}
