package org.example.ChallengesForNewUsers;

import org.example.Nodes.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;


public class PalindromeLinkedList {
    /*
    Given the head of a singly linked list, return
    true if it is a palindrome or false otherwise.


    Constraints:
    The number of nodes in the list is in the
    range[1, 10^5].
    0 <= Node.val <= 9
     */
    public static boolean isPalindromeNaive(
            ListNode head) {
        List<Integer> l1 = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            l1.add(current.val);
            current = current.next;
        }

        List<Integer> l2 = new ArrayList<>(
                List.copyOf(l1));
        Collections.reverse(l2);
        return l1.equals(l2);
    }

    public static boolean isPalindromeOptimized(
            ListNode head) {
        ListNode slow = head, fast = head, prev, temp;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        prev = slow;
        slow = slow.next;
        prev.next = null;
        while (slow != null) {
            temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        fast = head;
        slow = prev;
        while (slow != null) {
            if (!Objects.equals(fast.val, slow.val))
                return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
}
