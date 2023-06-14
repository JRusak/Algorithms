package org.example;
// Java code below

import java.util.HashSet;

public class TestClass {

    public static void showOutput(int exampleNumber, String expected, String actual) {
        String s = "Example " + exampleNumber + ":\n" +
                "Expected: " + expected + '\n' +
                "Actual: " + actual + '\n';
        System.out.println(s);
    }

    static public void main(String[] args) {
        HashSet<Integer> s = new HashSet<>();
    }
}
