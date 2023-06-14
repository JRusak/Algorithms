package org.example.ChallengesForNewUsers;

import org.example.TestClass;

public class RichestCustomerWealth {
    /*
    You are given an m x n integer grid accounts where
    accounts[i][j] is the amount of money the i-th
    customer has in the j-th bank. Return the wealth that
    the richest customer has.

    A customer's wealth is the amount of money they have
    in all their bank accounts. The richest customer
    is the customer that has the maximum wealth.


    Constraints:
    m == accounts.length
    n == accounts[i].length
    1 <= m, n <= 50
    1 <= accounts[i][j] <= 100
     */
    public static int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        int total_money;

        for (int[] i: accounts) {
            total_money = 0;
            for (int j : i)
                total_money += j;

            if (total_money > max_wealth) max_wealth = total_money;
        }

        return max_wealth;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: accounts = [[1,2,3],[3,2,1]]
        Output: 6
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest with a wealth of 6 each, so return 6.
        */
        int[][] accounts1 = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int output1 = 6;
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(maximumWealth(accounts1)));

        /*
        Example 2:

        Input: accounts = [[1,5],[7,3],[3,5]]
        Output: 10
        Explanation:
        1st customer has wealth = 6
        2nd customer has wealth = 10
        3rd customer has wealth = 8
        The 2nd customer is the richest with a wealth of 10.
        */
        int[][] accounts2 = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int output2 = 10;
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(maximumWealth(accounts2)));

        /*
        Example 3:

        Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
        Output: 17
         */
        int[][] accounts3 = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        int output3 = 17;
        TestClass.showOutput(3, String.valueOf(output3), String.valueOf(maximumWealth(accounts3)));
    }
}
