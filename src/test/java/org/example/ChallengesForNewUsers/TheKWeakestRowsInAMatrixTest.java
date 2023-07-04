package org.example.ChallengesForNewUsers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TheKWeakestRowsInAMatrixTest {

    @Test
    void kWeakestRows_DifferentNumberOfSoldiersInEachRow_Rows() {
        /*
        Explanation:
        The number of soldiers in each row is:
        - Row 0: 2
        - Row 1: 4
        - Row 2: 1
        - Row 3: 2
        - Row 4: 5
        The rows ordered from weakest to strongest are
        [2,0,3,1,4].
         */
        int[][] input = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        int[] output = {2, 0, 3};

        assertArrayEquals(
                output,
                TheKWeakestRowsInAMatrix
                        .kWeakestRows(
                                input,
                                k
                        )
        );

        assertArrayEquals(
                output,
                TheKWeakestRowsInAMatrix
                        .kWeakestRowsBetter(
                                input,
                                k
                        )
        );
    }

    @Test
    void kWeakestRows_SameNumberOfSoldiersInManyRows_Rows() {
        /*
        Explanation:
        The number of soldiers in each row is:
        - Row 0: 1
        - Row 1: 4
        - Row 2: 1
        - Row 3: 1
        The rows ordered from weakest to strongest
        are [0,2,3,1].
         */
        int[][] input = {
                {1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}
        };
        int k = 2;
        int[] output = {0, 2};

        assertArrayEquals(
                output,
                TheKWeakestRowsInAMatrix
                        .kWeakestRows(
                                input,
                                k
                        )
        );

        assertArrayEquals(
                output,
                TheKWeakestRowsInAMatrix
                        .kWeakestRowsBetter(
                                input,
                                k
                        )
        );
    }

    @Test
    void kWeakestRows_RowsFullOfSoldiers_Rows() {
        /*
        Explanation:
        The number of soldiers in each row is:
        - Row 0: 3
        - Row 1: 3
        - Row 2: 3
        - Row 3: 3
        The rows ordered from weakest to strongest
        are [0,1,2,3].
         */
        int[][] input = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
        };
        int k = 2;
        int[] output = {0, 1};

        assertArrayEquals(
                output,
                TheKWeakestRowsInAMatrix
                        .kWeakestRows(
                                input,
                                k
                        )
        );

        assertArrayEquals(
                output,
                TheKWeakestRowsInAMatrix
                        .kWeakestRowsBetter(
                                input,
                                k
                        )
        );
    }
}
