package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import java.util.HashSet;
import java.util.Set;

public class ValidSudoku {
    /*
    Determine if a 9 x 9 Sudoku board is valid. Only the filled
    cells need to be validated according to the following rules:

    Each row must contain the digits 1-9 without repetition.
    Each column must contain the digits 1-9 without repetition.
    Each of the nine 3 x 3 sub-boxes of the grid must contain
    the digits 1-9 without repetition.

    Note:
    A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    Only the filled cells need to be validated according to the mentioned rules.


    Constraints:
    board.length == 9
    board[i].length == 9
    board[i][j] is a digit 1-9 or '.'.
     */

    @SuppressWarnings("unchecked")
    public static boolean isValidSudoku(char[][] board) {
        Set<Character> rowSet;
        Set<Character> colSet;
        Set<Character>[][] subBoxes = new HashSet[3][3];

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                subBoxes[i][j] = new HashSet<>();

        for (int row = 0; row < board.length; row++) {
            rowSet = new HashSet<>();
            colSet = new HashSet<>();
            for (int col = 0; col < board[0].length; col++) {
                char r = board[row][col];
                char c = board[col][row];
                if (r != '.') {
                    if (rowSet.contains(r))
                        return false;
                    else
                        rowSet.add(r);

                    if (subBoxes[row / 3][col / 3].contains(r))
                        return false;
                    else
                        subBoxes[row / 3][col / 3].add(r);
                }

                if (c != '.')
                    if (colSet.contains(c))
                        return false;
                    else
                        colSet.add(c);
            }
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    public static boolean isValidSudokuD(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[][] subBoxes = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++) {
                subBoxes[i][j] = new HashSet<>();
            }

        for (int row = 0; row < board.length; row++)
            for (int col = 0; col < board[0].length; col++) {
                char c = board[row][col];
                if (c == '.')
                    continue;

                if (rows[row].contains(c) ||cols[col].contains(c) || subBoxes[row / 3][col / 3].contains(c))
                    return false;

                rows[row].add(c);
                cols[col].add(c);
                subBoxes[row / 3][col / 3].add(c);
            }

        return true;
    }
}
