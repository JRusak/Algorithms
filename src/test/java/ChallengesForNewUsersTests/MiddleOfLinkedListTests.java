package ChallengesForNewUsersTests;

import org.example.ChallengesForNewUsers.MiddleOfLinkedList;
import org.example.Nodes.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MiddleOfLinkedListTests {

    @Test
    void middleNode_OddLengthLinkedList_MiddleNode() {
        /*
        Explanation: The middle node of the list
        is node 3.
         */
        int[] input = {1, 2, 3, 4, 5};
        int[] output = {3, 4, 5};
        ListNode head = ListNode.fillList(input);

        assertArrayEquals(
                output,
                MiddleOfLinkedList
                        .middleNode(head)
                        .getValues()
        );
    }

    @Test
    void middleNode_EvenLengthLinkedList_MiddleNodeNearEnd() {
        /*
        Explanation: Since the list has two middle
        nodes with values 3 and 4, we return the
        second one.
         */
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] output = {4, 5, 6};
        ListNode head = ListNode.fillList(input);

        assertArrayEquals(
                output,
                MiddleOfLinkedList
                        .middleNode(head)
                        .getValues()
        );
    }
}
