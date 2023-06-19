package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import java.util.ArrayList;
import java.util.List;

public class EncodeAndDecodeStrings {
    /*
    Design an algorithm to encode a list of strings to a string.
    The encoded string is then sent over the network and is decoded
    back to the original list of strings.

    Please implement encode and decode.
     */
    public static String encode(String[] strings) {
        StringBuilder result = new StringBuilder();

        for (String s: strings) {
            result.append(s.length()).append("#").append(s);
        }

        return result.toString();
    }

    public static String[] decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (s.charAt(j) != '#') {
                j++;
            }

            int wordLength = Integer.parseInt(s, i, j, 10);
            i = j + 1 + wordLength;
            result.add(s.substring(j + 1, i));
        }

        return result.toArray(new String[0]);
    }
}
