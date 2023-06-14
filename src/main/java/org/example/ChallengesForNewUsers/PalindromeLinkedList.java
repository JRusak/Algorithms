package org.example.ChallengesForNewUsers;

import org.example.Nodes.ListNode;
import org.example.TestClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PalindromeLinkedList {
    /*
    Given the head of a singly linked list, return true if it is a
    palindrome or false otherwise.


    Constraints:
    The number of nodes in the list is in the range [1, 10^5].
    0 <= Node.val <= 9
     */
    public static boolean isPalindromeNaive(ListNode head) {
        List<Integer> l1 = new ArrayList<>();

        ListNode current = head;
        while (current != null) {
            l1.add(current.val);
            current = current.next;
        }

        List<Integer> l2 = new ArrayList<>(List.copyOf(l1));
        Collections.reverse(l2);
        return l1.equals(l2);
    }

    public static boolean isPalindromeOptimized(ListNode head) {
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
            if (fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: head = [1,2,2,1]
        Output: true
         */
        int[] input1 = {1,2,2,1};
        boolean output1 = true;

        ListNode head1 = new ListNode();
        head1.fillList(input1);

        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(isPalindromeNaive(head1)));
        TestClass.showOutput(1, String.valueOf(output1), String.valueOf(isPalindromeOptimized(head1)));

        /*
        Example 2:

        Input: head = [1,2]
        Output: false
         */
        int[] input2 = {1,2};
        boolean output2 = false;

        ListNode head2 = new ListNode();
        head2.fillList(input2);

        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(isPalindromeNaive(head2)));
        TestClass.showOutput(2, String.valueOf(output2), String.valueOf(isPalindromeOptimized(head2)));


    }
}
