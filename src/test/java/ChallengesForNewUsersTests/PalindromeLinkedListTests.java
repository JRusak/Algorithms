package ChallengesForNewUsersTests;

import org.example.ChallengesForNewUsers.PalindromeLinkedList;
import org.example.Nodes.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeLinkedListTests {

    @Test
    void linkedListIsAPalindromeEvenLength() {
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
    void linkedListIsAPalindromeOddLength() {
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
    void linkedListIsNotAPalindromeEvenLength() {
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
    void linkedListIsNotAPalindromeOddLength() {
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
