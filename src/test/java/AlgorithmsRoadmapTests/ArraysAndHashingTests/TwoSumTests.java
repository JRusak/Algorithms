package AlgorithmsRoadmapTests.ArraysAndHashingTests;

import org.example.AlgorithmsRoadmap.ArraysAndHashing.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSumTests {

    @Test
    void twoSum_4Nums_Indices() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] indices = {0, 1};

        assertArrayEquals(
                indices,
                TwoSum.twoSumBruteForce(
                        nums,
                        target
                )
        );
        assertArrayEquals(
                indices,
                TwoSum.twoSumOptimized(
                        nums,
                        target
                )
        );
    }

    @Test
    void twoSum_3Nums_Indices() {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] indices = {1, 2};

        assertArrayEquals(
                indices,
                TwoSum.twoSumBruteForce(
                        nums,
                        target
                )
        );
        assertArrayEquals(
                indices,
                TwoSum.twoSumOptimized(
                        nums,
                        target
                )
        );
    }

    @Test
    void twoSum_2Nums_Indices() {
        int[] nums = {3, 3};
        int target = 6;
        int[] indices = {0, 1};

        assertArrayEquals(
                indices,
                TwoSum.twoSumBruteForce(
                        nums,
                        target
                )
        );
        assertArrayEquals(
                indices,
                TwoSum.twoSumOptimized(
                        nums,
                        target
                )
        );
    }

    @Test
    void twoSum_EmptyNums_EmptyIndices() {
        int[] nums = {};
        int target = 6;
        int[] indices = {};

        assertArrayEquals(
                indices,
                TwoSum.twoSumBruteForce(
                        nums,
                        target
                )
        );
        assertArrayEquals(
                indices,
                TwoSum.twoSumOptimized(
                        nums,
                        target
                )
        );
    }
}
