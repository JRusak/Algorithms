package org.example.ChallengesForNewUsers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void fizzBuzz_3_ThirdStringIsFizz() {
        int input = 3;
        List<String> output = List.of("1", "2", "Fizz");
        assertEquals(
                output,
                FizzBuzz.fizzBuzz(input)
        );
    }

    @Test
    void fizzBuzz_5_ThirdFizzFifthBuzz() {
        int input = 5;
        List<String> output = List.of(
                "1", "2", "Fizz", "4", "Buzz"
        );

        assertEquals(
                output,
                FizzBuzz.fizzBuzz(input)
        );
    }

    @Test
    void fizzBuzz_15_FifteenthFizzBuzz() {
        int input = 15;
        List<String> output = List.of(
                "1", "2", "Fizz", "4", "Buzz",
                "Fizz", "7", "8", "Fizz", "Buzz",
                "11", "Fizz", "13", "14", "FizzBuzz"
        );

        assertEquals(
                output,
                FizzBuzz.fizzBuzz(input)
        );
    }
}
