package ChallengesForNewUsersTests;

import org.example.ChallengesForNewUsers.NumberOfStepsToReduceANumberToZero;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfStepsToReduceANumberToZeroTests {

    @Test
    void evenNumber() {
        /*
        Explanation:
        Step 1) 14 is even; divide by 2 and obtain 7.
        Step 2) 7 is odd; subtract 1 and obtain 6.
        Step 3) 6 is even; divide by 2 and obtain 3.
        Step 4) 3 is odd; subtract 1 and obtain 2.
        Step 5) 2 is even; divide by 2 and obtain 1.
        Step 6) 1 is odd; subtract 1 and obtain 0.
         */
        int input = 14;
        int output = 6;

        assertEquals(
                output,
                NumberOfStepsToReduceANumberToZero
                        .numberOfSteps(input)
        );
    }

    @Test
    void oddNumber() {
        int input = 123;
        int output = 12;

        assertEquals(
                output,
                NumberOfStepsToReduceANumberToZero
                        .numberOfSteps(input)
        );
    }

    @Test
    void zeroNumber() {
        int input = 0;
        int output = 0;

        assertEquals(
                output,
                NumberOfStepsToReduceANumberToZero
                        .numberOfSteps(input)
        );
    }
}
