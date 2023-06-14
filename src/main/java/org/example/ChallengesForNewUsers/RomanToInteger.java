package org.example.ChallengesForNewUsers;

import java.util.HashMap;

public class RomanToInteger {
    /*
    Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

    Symbol       Value
    I             1
    V             5
    X             10
    L             50
    C             100
    D             500
    M             1000
    For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

    Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

    I can be placed before V (5) and X (10) to make 4 and 9.
    X can be placed before L (50) and C (100) to make 40 and 90.
    C can be placed before D (500) and M (1000) to make 400 and 900.
    Given a roman numeral, convert it to an integer.


    Constraints:

    1 <= s.length <= 15
    s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
    It is guaranteed that s is a valid roman numeral in the range [1, 3999].
     */
    public static int romanToInt(String s) {
        HashMap<Character, Integer> normalMap = new HashMap<>() {{
            put('I', 1); put('V', 5); put('X', 10); put('L', 50);
            put('C', 100); put('D', 500); put('M', 1000);
        }};

        int subtractStringLength = 2;
        HashMap<String, Integer> subtractMap = new HashMap<>() {{
            put("IV", 4); put("IX", 9);
            put("XL", 40); put("XC", 90);
            put("CD", 400); put("CM", 900);
        }};

        int result = 0;

        if (s.length() < subtractStringLength) {
            for (char c : s.toCharArray())
                result += normalMap.get(c);
            return result;
        }

        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i <= s.length() - subtractStringLength) {
            for (int j = 0; j < subtractStringLength; j++) {
                sb.append(s.charAt(i + j));
            }

            Integer v = subtractMap.get(sb.toString());

            if (v == null && i == s.length() - subtractStringLength) {
                for(char c : sb.toString().toCharArray())
                    result += normalMap.get(c);
                break;
            } else if (v == null) {
                result += normalMap.get(s.charAt(i));
                i++;
            } else if (i == s.length() - subtractStringLength - 1) {
                result += v;
                for (char c : s.substring(i+subtractStringLength).toCharArray())
                    result += normalMap.get(c);
                break;
            } else {
                result += v;
                i += sb.length();
            }
            sb.setLength(0);
        }

        return result;
    }

    public static int romanToIntOptimized(String s) {

        int answer = 0, number = 0, prev = 0;

        for (int j = s.length() - 1; j >= 0; j--) {
            switch (s.charAt(j)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }
            if (number < prev) {
                answer -= number;
            }
            else {
                answer += number;
            }
            prev = number;
        }
        return answer;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: s = "III"
        Output: 3
        Explanation: III = 3.
         */
        String s_1 = "III";
        System.out.println(romanToInt(s_1));
        System.out.println(romanToIntOptimized(s_1));

        /*
        Example 2:

        Input: s = "LVIII"
        Output: 58
        Explanation: L = 50, V= 5, III = 3.
         */
        String s_2 = "LVIII";
        System.out.println(romanToInt(s_2));
        System.out.println(romanToIntOptimized(s_2));

        /*
        Example 3:

        Input: s = "MCMXCIV"
        Output: 1994
        Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
         */
        String s_3 = "MCMXCIV";
        System.out.println(romanToInt(s_3));
        System.out.println(romanToIntOptimized(s_3));

        /*
        Example 4:

        Input: s = "MDCXCV"
        Output: 1695
        Explanation: M = 1000, D = 500, C = 100, XC = 90 and V = 4.
         */
        String s_4 = "MDCXCV";
        System.out.println(romanToInt(s_4));
        System.out.println(romanToIntOptimized(s_4));

        /*
        Example 5:

        Input: s = "D"
        Output: 500
        Explanation: D = 500.
         */
        String s_5 = "D";
        System.out.println(romanToInt(s_5));
        System.out.println(romanToIntOptimized(s_5));
    }
}
