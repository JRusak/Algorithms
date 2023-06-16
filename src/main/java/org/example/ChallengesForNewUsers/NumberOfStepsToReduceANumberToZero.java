package org.example.ChallengesForNewUsers;

public class NumberOfStepsToReduceANumberToZero {
    /*
    Given an integer num, return the number of steps
    to reduce it to zero.

    In one step, if the current number is even, you
    have to divide it by 2, otherwise, you have to
    subtract 1 from it.


    Constraints:
    0 <= num <= 10^6
     */
    public static int numberOfSteps(int num) {
        int steps = 0;

        while (num != 0) {
            if (num % 2 == 0)
                num /= 2;
            else
                num -= 1;

            steps++;
        }

        return steps;
    }
}
