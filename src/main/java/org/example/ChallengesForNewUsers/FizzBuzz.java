package org.example.ChallengesForNewUsers;

import org.example.TestClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FizzBuzz {
    /*
    Given an integer n, return a string array answer (1-indexed) where:

    answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
    answer[i] == "Fizz" if i is divisible by 3.
    answer[i] == "Buzz" if i is divisible by 5.
    answer[i] == i (as a string) if none of the above conditions are true.


    Constraints:
    1 <= n <= 10^5
     */
    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++){
            if (i % 15 == 0)
                list.add("FizzBuzz");
            else if (i % 3 == 0)
                list.add("Fizz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else
                list.add(Integer.toString(i));
        }

        return list;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: n = 3
        Output: ["1","2","Fizz"]
         */
        int input1 = 3;
        List<String> output1 = List.of("1", "2", "Fizz");

        TestClass.showOutput(1, output1.toString(), fizzBuzz(input1).toString());

        /*
        Example 2:

        Input: n = 5
        Output: ["1","2","Fizz","4","Buzz"]
         */
        int input2 = 5;
        List<String> output2 = List.of("1", "2", "Fizz", "4", "Buzz");

        TestClass.showOutput(2, output2.toString(), fizzBuzz(input2).toString());

        /*
        Example 3:

        Input: n = 15
        Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
         */
        int input3 = 15;
        List<String> output3 = List.of("1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz");

        TestClass.showOutput(3, output3.toString(), fizzBuzz(input3).toString());
    }
}
