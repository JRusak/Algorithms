package AlgorithmsRoadmapTests.ArraysAndHashingTests;

import org.example.AlgorithmsRoadmap.ArraysAndHashing.ProductOfArrayExceptSelf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOfArrayExceptSelfTests {

    @Test
    void productExceptSelf_PositiveNums_Products() {
        int[] nums = {1, 2, 3, 4};
        int[] products = {24, 12, 8, 6};

        assertEquals(
                products,
                ProductOfArrayExceptSelf
                        .productExceptSelf(nums)
        );

        assertEquals(
                products,
                ProductOfArrayExceptSelf
                        .productExceptSelfOther(nums)
        );
    }

    @Test
    void productExceptSelf_Integers_Products() {
        int[] nums = {-1, 1, 0, -3, 3};
        int[] products = {0, 0, 9, 0, 0};

        assertEquals(
                products,
                ProductOfArrayExceptSelf
                        .productExceptSelf(nums)
        );

        assertEquals(
                products,
                ProductOfArrayExceptSelf
                        .productExceptSelfOther(nums)
        );
    }
}
