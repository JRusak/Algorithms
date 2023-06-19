package AlgorithmsRoadmapTests.ArraysAndHashingTests;

import org.example.AlgorithmsRoadmap.ArraysAndHashing.EncodeAndDecodeStrings;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class EncodeAndDecodeStringsTests {

    @Test
    void encode_Strings_EncodedStrings() {
        String[] strings = {
                "lint", "code", "love", "you"
        };
        String code = "4#lint4#code4#love3#you";

        assertEquals(
                code,
                EncodeAndDecodeStrings
                        .encode(strings)
        );
    }

    @Test
    void encode_NoStrings_EmptyCode() {
        String[] strings = {};
        String code = "";

        assertEquals(
                code,
                EncodeAndDecodeStrings
                        .encode(strings)
        );
    }

    @Test
    void encode_SingleString_EncodedString() {
        String[] strings = {"lint"};
        String code = "4#lint";

        assertEquals(
                code,
                EncodeAndDecodeStrings
                        .encode(strings)
        );
    }

    @Test
    void decode_EmptyCode_NoStrings() {
        String code = "";
        String[] strings = new String[]{};

        assertArrayEquals(
                strings,
                EncodeAndDecodeStrings
                        .decode(code)
        );
    }

    @Test
    void decode_EncodedStrings_Strings() {
        String code = "4#lint4#code4#love3#you";
        String[] strings = {
                "lint", "code", "love", "you"
        };

        assertArrayEquals(
                strings,
                EncodeAndDecodeStrings
                        .decode(code)
        );
    }
}
