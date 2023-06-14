package org.example.ChallengesForNewUsers;

import org.example.Nodes.ListNode;
import org.example.TestClass;

import java.util.Arrays;

public class MiddleOfLinkedList {
    /*
    Given the head of a singly linked list,
    return the middle node of the linked list.

    If there are two middle nodes, return the
    second middle node.


    Constraints:
    The number of nodes in the list is in the range [1, 100].
    1 <= Node.val <= 100
     */
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        /*
        Example 1:

        Input: head = [1,2,3,4,5]
        Output: [3,4,5]
        Explanation: The middle node of the list is node 3.
        */
        int[] input1 = {1, 2, 3, 4, 5};
        ListNode head1 = new ListNode();
        head1.fillList(input1);
        int[] output1 = {3, 4, 5};

        TestClass.showOutput(
                1,
                Arrays.toString(output1),
                Arrays.toString(middleNode(head1).values())
        );

        /*
        Example 2:

        Input: head = [1,2,3,4,5,6]
        Output: [4,5,6]
        Explanation: Since the list has two middle nodes with
        values 3 and 4, we return the second one.
         */
        int[] input2 = {1, 2, 3, 4, 5, 6};
        ListNode head2 = new ListNode();
        head2.fillList(input2);
        int[] output2 = {4, 5, 6};

        TestClass.showOutput(
                2,
                Arrays.toString(output2),
                Arrays.toString(middleNode(head2).values())
        );
    }
}
