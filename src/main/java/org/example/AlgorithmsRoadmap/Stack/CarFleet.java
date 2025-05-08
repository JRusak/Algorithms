package org.example.AlgorithmsRoadmap.Stack;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarFleet {

    /*
     * There are n cars at given miles away from the 
     * starting mile 0, traveling to reach the mile target.
     * You are given two integer array position and speed, 
     * both of length n, where position[i] is the starting 
     * mile of the ith car and speed[i] is the speed of the 
     * ith car in miles per hour. 
     * A car cannot pass another car, but it can catch up 
     * and then travel next to it at the speed of the slower 
     * car.
     * A car fleet is a car or cars driving next to each 
     * other. The speed of the car fleet is the minimum 
     * speed of any car in the fleet.
     * If a car catches up to a car fleet at the mile 
     * target, it will still be considered as part of 
     * the car fleet.
     * Return the number of car fleets that will arrive 
     * at the destination.
     * 
     * Constraints:
     * n == position.length == speed.length
     * 1 <= n <= 10^5
     * 0 < target <= 10^6
     * 0 <= position[i] < target
     * All the values of position are unique.
     * 0 < speed[i] <= 10^6
     */

    public static int carFleet(int target, int[] position, int[] speed) {
        List<int []> cars = IntStream.range(0, position.length)
            .mapToObj(i -> new int[] {position[i], speed[i]})
            .sorted((a, b) -> Integer.compare(b[0], a[0]))
            .collect(Collectors.toList());

        Stack<Float> stack = new Stack<>();
        for (int [] car : cars) {
            float timeToTarget = (float)(target - car[0]) / car[1];
            if (stack.empty() || stack.peek() < timeToTarget) {
                stack.push(timeToTarget);
            }
        }

        return stack.size();
    }

    public static int carFleetBucketSort(int target, int[] position, int[] speed) {
        float[] time = new float[target];
        for (int i = 0; i < position.length; i++) {
            time[position[i]] = (float)(target - position[i]) / speed[i];
        }

        int result = 0;
        float prevTimeToTarget = 0;
        for (int i = target - 1; i >= 0; i--) {
            float timeToTarget = time[i];
            if (prevTimeToTarget < timeToTarget) {
                result++;
                prevTimeToTarget = timeToTarget;
            }
        }

        return result;
    }

}
