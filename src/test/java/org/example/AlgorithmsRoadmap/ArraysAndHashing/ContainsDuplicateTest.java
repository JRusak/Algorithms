package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ContainsDuplicateTest {

    @Test
    void containsDuplicate_NumsWithDuplicate_True() {
        int[] nums = {1, 2, 3, 1};

        assertTrue(ContainsDuplicate
                .containsDuplicate(nums)
        );
    }

    @Test
    void containsDuplicate_NumsWithManyDuplicates_True() {
        int[] nums = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};

        assertTrue(ContainsDuplicate
                .containsDuplicate(nums)
        );
    }

    @Test
    void containsDuplicate_NumsWithoutDuplicate_True() {
        int[] nums = {1, 2, 3, 4};

        assertFalse(ContainsDuplicate
                .containsDuplicate(nums)
        );
    }
}
