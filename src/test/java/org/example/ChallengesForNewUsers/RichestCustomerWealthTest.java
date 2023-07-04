package org.example.ChallengesForNewUsers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RichestCustomerWealthTest {

    @Test
    void maximumWealth_TwoAccountsSameWealth_6() {
        /*
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest
        with a wealth of 6 each, so return 6.
        */
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };
        int output = 6;

        assertEquals(
                output,
                RichestCustomerWealth
                        .maximumWealth(accounts)
        );
    }

    @Test
    void maximumWealth_ThreeAccountsDifferentWealth_10() {
        /*
        Explanation:
        1st customer has wealth = 6
        2nd customer has wealth = 10
        3rd customer has wealth = 8
        The 2nd customer is the richest with a wealth of 10.
        */
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int output = 10;

        assertEquals(
                output,
                RichestCustomerWealth
                        .maximumWealth(accounts)
        );
    }

    @Test
    void maximumWealth_ThreeAccountsSameWealth_6() {
        /*
        Explanation:
        1st customer has wealth = 1 + 2 + 3 = 6
        2nd customer has wealth = 3 + 2 + 1 = 6
        Both customers are considered the richest
        with a wealth of 6 each, so return 6.
        */
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        int output = 17;

        assertEquals(
                output,
                RichestCustomerWealth
                        .maximumWealth(accounts)
        );
    }
}
