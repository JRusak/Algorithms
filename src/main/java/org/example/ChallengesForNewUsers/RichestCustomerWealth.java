package org.example.ChallengesForNewUsers;

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
}
