package org.example.AlgorithmsRoadmap.TwoPointers;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumII_InputArrayIsSortedTest {
    
    private void assertTwoSumMethods(
        int[] numbers,
        int target, 
        int[] expected
    ) {
        assertArrayEquals(
            expected,
            TwoSumII_InputArrayIsSorted.twoSum(
                numbers, target
        )
            );
    }

    @Test
    void twoSum_example1_9() {
        int[] numbers = {2,7,11,15};
        int target = 9;
        int[] expected = {1,2};

        assertTwoSumMethods(numbers, target, expected);
    }

    @Test
    void twoSum_example2_6() {
        int[] numbers = {2,3,4};
        int target = 6;
        int[] expected = {1,3};

        assertTwoSumMethods(numbers, target, expected);
    }

    @Test
    void twoSum_example3_Negative1() {
        int[] numbers = {-1,0};
        int target = -1;
        int[] expected = {1,2};

        assertTwoSumMethods(numbers, target, expected);
    }
}
