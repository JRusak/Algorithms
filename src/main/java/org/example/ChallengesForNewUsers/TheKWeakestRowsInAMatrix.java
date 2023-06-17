package org.example.ChallengesForNewUsers;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class TheKWeakestRowsInAMatrix {
    /*
    You are given an m x n binary matrix mat of 1's
    (representing soldiers) and 0's (representing
    civilians). The soldiers are positioned in front
    of the civilians. That is, all the 1's will appear
    to the left of all the 0's in each row.

    A row i is weaker than a row j if one of the
    following is true:
    - The number of soldiers in row i is less than the
      number of soldiers in row j.
    - Both rows have the same number of soldiers and
      i < j.

    Return the indices of the k weakest rows in the
    matrix ordered from weakest to strongest.


    Constraints:
    m == mat.length
    n == mat[i].length
    2 <= n, m <= 100
    1 <= k <= m
    matrix[i][j] is either 0 or 1.
     */
    public static int[] kWeakestRows(int[][] mat, int k) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int i = 0; i < mat[0].length && k > 0; i++)
            for (int j = 0; j < mat.length && k > 0; j++) {
                if (mat[j][i] == 0 && !set.contains(j)) {
                    set.add(j);
                    k--;
                }
            }

        for (int j = 0; j < mat.length && k > 0; j++)
            if (!set.contains(j)) {
                set.add(j);
                k--;
            }

        return set.stream().mapToInt(i -> i).toArray();
    }

    public static int[] kWeakestRowsBetter(
            int[][] mat, int k) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] score = new int[rows];
        int j;
        for (int i = 0; i < rows; i++) {
            j = 0;
            for (; j < cols; j++) {
                if (mat[i][j] == 0) {
                    break;
                }
            }
            score[i] = j * rows + i;
        }

        Arrays.sort(score);
        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] % rows;
        }

        return Arrays.copyOfRange(score, 0, k);
    }
}
