package org.example.AlgorithmsRoadmap.Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CarFleetTest {

    private void assertCarFleetMethods(int target, int[] position, int[] speed, int expected) {
        assertEquals(
            expected,
            CarFleet.carFleet(target, position, speed)
        );
        assertEquals(
            expected,
            CarFleet.carFleetBucketSort(target, position, speed)
        );
    }
    
    @Test
    void carFleet_emptyArrays_zero() {
        int target = 0;
        int[] position = {};
        int[] speed = {};
        int expected = 0;

        assertCarFleetMethods(target, position, speed, expected);
    }

    @Test
    void carFleet_example1_3() {
        int target = 12;
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        int expected = 3;

        assertCarFleetMethods(target, position, speed, expected);
    }

    @Test
    void carFleet_example2_1() {
        int target = 10;
        int[] position = {3};
        int[] speed = {3};
        int expected = 1;

        assertCarFleetMethods(target, position, speed, expected);
    }

    @Test
    void carFleet_example3_1() {
        int target = 100;
        int[] position = {0,2,4};
        int[] speed = {4,2,1};
        int expected = 1;

        assertCarFleetMethods(target, position, speed, expected);
    }

    @Test
    void carFleet_example4_2() {
        int target = 10;
        int[] position = {6,8};
        int[] speed = {3,2};
        int expected = 2;

        assertCarFleetMethods(target, position, speed, expected);
    }
}
