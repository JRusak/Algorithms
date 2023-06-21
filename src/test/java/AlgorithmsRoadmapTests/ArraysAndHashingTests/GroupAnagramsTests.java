package AlgorithmsRoadmapTests.ArraysAndHashingTests;

import org.example.AlgorithmsRoadmap.ArraysAndHashing.GroupAnagrams;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GroupAnagramsTests {

    @Test
    void groupAnagrams_ManyStrings_AnagramGroups() {
        String[] strs = {
                "eat", "tea", "tan", "ate", "nat", "bat"
        };
        List<List<String>> groups = List.of(
                List.of("eat", "tea", "ate"),
                List.of("tan", "nat"),
                List.of("bat")
        );

        assertEquals(
                groups,
                GroupAnagrams
                        .groupAnagramsFirstIdea(strs)
        );

        groups = List.of(
                List.of("eat", "tea", "ate"),
                List.of("bat"),
                List.of("tan", "nat")
        );

        assertEquals(
                groups,
                GroupAnagrams
                        .groupAnagramsOptimized(strs)
        );
    }

    @Test
    void groupAnagrams_EmptyStrings_EmptyList() {
        String[] strs = {};
        List<List<String>> groups = List.of();

        assertEquals(
                groups,
                GroupAnagrams
                        .groupAnagramsFirstIdea(strs)
        );

        assertEquals(
                groups,
                GroupAnagrams
                        .groupAnagramsOptimized(strs)
        );
    }

    @Test
    void groupAnagrams_SingleString_OneNestedListWithString() {
        String[] strs = {"a"};
        List<List<String>> groups = List.of(
                List.of("a")
        );

        assertEquals(
                groups,
                GroupAnagrams
                        .groupAnagramsFirstIdea(strs)
        );

        assertEquals(
                groups,
                GroupAnagrams
                        .groupAnagramsOptimized(strs)
        );
    }
}
