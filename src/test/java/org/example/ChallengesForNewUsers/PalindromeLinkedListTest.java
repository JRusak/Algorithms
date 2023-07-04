package org.example.ChallengesForNewUsers;

import org.example.Nodes.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTest {

    @Test
    void isPalindrome_PalindromeLinkedListEvenLength_True() {
        int[] input = {1, 2, 2, 1};
        ListNode head = ListNode.fillList(input);

        assertTrue(
                PalindromeLinkedList
                        .isPalindromeNaive(head)
        );
        assertTrue(
                PalindromeLinkedList
                        .isPalindromeOptimized(head)
        );
    }

    @Test
    void isPalindrome_PalindromeLinkedListOddLength_True() {
        int[] input = {1, 2, 3, 2, 1};
        ListNode head = ListNode.fillList(input);

        assertTrue(
                PalindromeLinkedList
                        .isPalindromeNaive(head)
        );
        assertTrue(
                PalindromeLinkedList
                        .isPalindromeOptimized(head)
        );
    }

    @Test
    void isPalindrome_NotPalindromeLinkedListEvenLength_False() {
        int[] input = {1, 2};
        ListNode head = ListNode.fillList(input);

        assertFalse(
                PalindromeLinkedList
                        .isPalindromeNaive(head)
        );
        assertFalse(
                PalindromeLinkedList
                        .isPalindromeOptimized(head)
        );
    }

    @Test
    void isPalindrome_NotPalindromeLinkedListOddLength_False() {
        int[] input = {1, 2, 3};
        ListNode head = ListNode.fillList(input);

        assertFalse(
                PalindromeLinkedList
                        .isPalindromeNaive(head)
        );
        assertFalse(
                PalindromeLinkedList
                        .isPalindromeOptimized(head)
        );
    }
}
