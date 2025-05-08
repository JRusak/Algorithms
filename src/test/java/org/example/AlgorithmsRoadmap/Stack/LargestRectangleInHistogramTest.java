package org.example.AlgorithmsRoadmap.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LargestRectangleInHistogramTest {
    
    private void assertLargestRectangleAreaMethods(
        int[] heights,
        int maxArea
    ) {
        assertEquals(
            maxArea, 
            LargestRectangleInHistogram.largestRectangleArea(
                heights
            )
        );
        assertEquals(
            maxArea, 
            LargestRectangleInHistogram.largestRectangleAreaBetter(
                heights
            )
        );
        assertEquals(
            maxArea, 
            LargestRectangleInHistogram.largestRectangleAreaOptimal(
                heights
            )
        );
    }

    @Test
    void largestRectangleArea_example1_10() {
        int[] heights = {2,1,5,6,2,3};
        int maxArea = 10;
        assertLargestRectangleAreaMethods(heights, maxArea);
    }

    @Test
    void largestRectangleArea_example2_4() {
        int[] heights = {2,4};
        int maxArea = 4;
        assertLargestRectangleAreaMethods(heights, maxArea);
    }

    @Test
    void largestRectangleArea_example3_3() {
        int[] heights = {2,1,2};
        int maxArea = 3;
        assertLargestRectangleAreaMethods(heights, maxArea);
    }

    @Test
    void largestRectangleArea_emptyArray_0() {
        int[] heights = {};
        int maxArea = 0;
        assertLargestRectangleAreaMethods(heights, maxArea);
    }
}
