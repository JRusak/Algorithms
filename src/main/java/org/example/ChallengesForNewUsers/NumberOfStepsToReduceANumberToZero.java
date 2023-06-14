package org.example.ChallengesForNewUsers;

import org.example.TestClass;

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

    public static void main(String[] args) {
        /*
        Example 1:

        Input: num = 14
        Output: 6
        Explanation:
        Step 1) 14 is even; divide by 2 and obtain 7.
        Step 2) 7 is odd; subtract 1 and obtain 6.
        Step 3) 6 is even; divide by 2 and obtain 3.
        Step 4) 3 is odd; subtract 1 and obtain 2.
        Step 5) 2 is even; divide by 2 and obtain 1.
        Step 6) 1 is odd; subtract 1 and obtain 0.
        */
        int input1 = 14;
        int output1 = 6;
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(numberOfSteps(input1)));

        /*
        Example 2:

        Input: num = 8
        Output: 4
        Explanation:
        Step 1) 8 is even; divide by 2 and obtain 4.
        Step 2) 4 is even; divide by 2 and obtain 2.
        Step 3) 2 is even; divide by 2 and obtain 1.
        Step 4) 1 is odd; subtract 1 and obtain 0.
        */
        int input2 = 8;
        int output2 = 4;
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(numberOfSteps(input2)));

        /*
        Example 3:

        Input: num = 123
        Output: 12
         */
        int input3 = 123;
        int output3 = 12;
        TestClass.showOutput(3, String.valueOf(output3), String.valueOf(numberOfSteps(input3)));
    }
}
