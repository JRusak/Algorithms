package org.example.AlgorithmsRoadmap.Stack;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class DailyTemperaturesTest {

    private void assertAllDailyTemperatureMethods(int[] input, int[] expected) {
        assertArrayEquals(
            DailyTemperatures.dailyTemperatures(input),
            expected
        );
        assertArrayEquals(
            DailyTemperatures.dailyTemperaturesFaster(input),
            expected
        );
        assertArrayEquals(
            DailyTemperatures.dailyTemperaturesDynamic(input),
            expected
        );
    }
    
    @Test
    void dailyTemperatures_emptyArray_emptyOutput() {
        int[] input = {};
        int[] expected = {};

        assertAllDailyTemperatureMethods(input, expected);
    }

    @Test
    void dailyTemperatures_increasingTemperatures_allOnesExceptLastOutput() {
        int[] input = {1,2,3,4,5,6,7,8};
        int[] expected = {1,1,1,1,1,1,1,0};

        assertAllDailyTemperatureMethods(input, expected);
    }

    @Test
    void dailyTemperatures_decreasingTemperatures_allZeroOutput() {
        int[] input = {9,8,7,6,5,3};
        int[] expected = {0,0,0,0,0,0};

        assertAllDailyTemperatureMethods(input, expected);
    }

    @Test
    void dailyTemperatures_example1_correctOutput() {
        int[] input = {73,74,75,71,69,72,76,73};
        int[] expected = {1,1,4,2,1,1,0,0};

        assertAllDailyTemperatureMethods(input, expected);
    }

    @Test
    void dailyTemperatures_example2_correctOutput() {
        int[] input = {30,40,50,60};
        int[] expected = {1,1,1,0};

        assertAllDailyTemperatureMethods(input, expected);
    }

    @Test
    void dailyTemperatures_example3_correctOutput() {
        int[] input = {30,60,90};
        int[] expected = {1,1,0};

        assertAllDailyTemperatureMethods(input, expected);
    }
    
    @Test
    void dailyTemperatures_example4_correctOutput() {
        int[] input = {89,62,70,58,47,47,46,76,100,70};
        int[] expected = {8,1,5,4,3,2,1,1,0,0};

        assertAllDailyTemperatureMethods(input, expected);
    }
}
