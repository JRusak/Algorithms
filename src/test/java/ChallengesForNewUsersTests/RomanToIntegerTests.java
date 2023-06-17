package ChallengesForNewUsersTests;

import org.example.ChallengesForNewUsers.RomanToInteger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanToIntegerTests {

    @Test
    void tripleI() {
        /*
        Explanation: III = 3.
         */
        String s = "III";
        int output = 3;

        assertEquals(
                output,
                RomanToInteger.romanToInt(s)
        );

        assertEquals(
                output,
                RomanToInteger
                        .romanToIntOptimized(s)
        );
    }

    @Test
    void simpleBiggerNumber() {
        /*
        Explanation: L = 50, V= 5, III = 3.
         */
        String s = "LVIII";
        int output = 58;

        assertEquals(
                output,
                RomanToInteger.romanToInt(s)
        );

        assertEquals(
                output,
                RomanToInteger
                        .romanToIntOptimized(s)
        );
    }

    @Test
    void bigNumberWithSubtractions() {
        /*
        Explanation: M = 1000, CM = 900, XC = 90 and
        IV = 4.
         */
        String s = "MCMXCIV";
        int output = 1994;

        assertEquals(
                output,
                RomanToInteger.romanToInt(s)
        );

        assertEquals(
                output,
                RomanToInteger
                        .romanToIntOptimized(s)
        );
    }

    @Test
    void anotherBigNumberWithSubtraction() {
        /*
        Explanation: M = 1000, D = 500, C = 100,
        XC = 90 and V = 5.
         */
        String s = "MDCXCV";
        int output = 1695;

        assertEquals(
                output,
                RomanToInteger.romanToInt(s)
        );

        assertEquals(
                output,
                RomanToInteger
                        .romanToIntOptimized(s)
        );
    }

    @Test
    void singleLetter() {
        /*
        Explanation: D = 500.
         */
        String s = "D";
        int output = 500;

        assertEquals(
                output,
                RomanToInteger.romanToInt(s)
        );

        assertEquals(
                output,
                RomanToInteger
                        .romanToIntOptimized(s)
        );
    }
}
