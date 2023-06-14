package org.example.AlgorithmsRoadmap.ArraysAndHashing;

import org.example.TestClass;

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

    public static void main(String[] args) {
        /*
        Example 1:

        Input: board =
        [["5","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]
        Output: true
        */
        char[][] input1 = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        boolean output1 = true;
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(isValidSudokuD(input1)));

        /*
        Example 2:

        Input: board =
        [["8","3",".",".","7",".",".",".","."]
        ,["6",".",".","1","9","5",".",".","."]
        ,[".","9","8",".",".",".",".","6","."]
        ,["8",".",".",".","6",".",".",".","3"]
        ,["4",".",".","8",".","3",".",".","1"]
        ,["7",".",".",".","2",".",".",".","6"]
        ,[".","6",".",".",".",".","2","8","."]
        ,[".",".",".","4","1","9",".",".","5"]
        ,[".",".",".",".","8",".",".","7","9"]]
        Output: false
        Explanation: Same as Example 1, except with the 5 in
        the top left corner being modified to 8. Since there
        are two 8's in the top left 3x3 sub-box, it is invalid.
         */
        char[][] input2 = {
                {'8', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'},
        };
        boolean output2 = false;
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(isValidSudoku(input2)));
    }
}
