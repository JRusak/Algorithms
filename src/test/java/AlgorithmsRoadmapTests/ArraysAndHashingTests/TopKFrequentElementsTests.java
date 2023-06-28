package AlgorithmsRoadmapTests.ArraysAndHashingTests;

import org.example.AlgorithmsRoadmap.ArraysAndHashing.TopKFrequentElements;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TopKFrequentElementsTests {

    @Test
    void topKFrequent_SortedNums_Elements() {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        int[] output = {1, 2};

        assertArrayEquals(
                output,
                TopKFrequentElements.
                        topKFrequent(nums, k)
        );

        assertArrayEquals(
                output,
                TopKFrequentElements.
                        topKFrequentOptimized(nums, k)
        );
    }

    @Test
    void topKFrequent_SingleNum_Elements() {
        int[] nums = {1};
        int k = 1;
        int[] output = {1};

        assertArrayEquals(
                output,
                TopKFrequentElements.
                        topKFrequent(nums, k)
        );

        assertArrayEquals(
                output,
                TopKFrequentElements.
                        topKFrequentOptimized(nums, k)
        );
    }

    @Test
    void topKFrequent_DifferentNums_Elements() {
        int[] nums = {1, 4, 3, 2};
        int k = 3;
        int[] output = {1, 2, 3};

        assertArrayEquals(
                output,
                TopKFrequentElements.
                        topKFrequent(nums, k)
        );

        assertArrayEquals(
                output,
                TopKFrequentElements.
                        topKFrequentOptimized(nums, k)
        );
    }
}
