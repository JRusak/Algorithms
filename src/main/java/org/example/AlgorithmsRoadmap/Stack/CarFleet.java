package org.example.AlgorithmsRoadmap.Stack;

import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CarFleet {
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
