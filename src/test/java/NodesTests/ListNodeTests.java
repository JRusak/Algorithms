package NodesTests;

import org.example.Nodes.ListNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ListNodeTests {

    @Test
    public void createEmptyListNode() {
        ListNode listNode = new ListNode();

        assertNull(listNode.val);
        assertNull(listNode.next);
    }

    @Test
    public void createListNodeWithValue() {
        ListNode listNode = new ListNode(3);
        assertEquals(
                3,
                listNode.val.intValue()
        );
        assertNull(listNode.next);
    }

    @Test
    public void createListNodeWithValueAndNext() {
        ListNode listNode1 = new ListNode(3);
        assertEquals(
                3,
                listNode1.val.intValue()
        );
        assertNull(listNode1.next);

        ListNode listNode2 = new ListNode(5, listNode1);
        assertEquals(
                5,
                listNode2.val.intValue()
        );
        assertEquals(
                listNode1,
                listNode2.next
        );
    }

    @Test
    public void getListNodeFilledWithNums() {
        int[] nums = {1, 2, 3};
        ListNode node = ListNode.fillList(nums);

        for (int n : nums) {
            assertEquals(
                    n,
                    node.val.intValue()
            );
            node = node.next;
        }
        assertNull(node);
    }

    @Test
    public void addNewListNodesToOldListNode() {
        ListNode oldListNode = new ListNode(5);
        int[] nums = {1, 2, 3};
        oldListNode.addNodes(nums);

        assertEquals(
                5,
                oldListNode.val.intValue()
        );
        ListNode node = oldListNode.next;
        for (int n : nums) {
            assertEquals(
                    n,
                    node.val.intValue()
            );
            node = node.next;
        }
        assertNull(node);
    }

    @Test
    public void getListNodesValues() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode node = ListNode.fillList(nums);

        assertEquals(
                Arrays.toString(nums),
                Arrays.toString(node.values())
        );
    }

    @Test
    public void getListNodeValues() {
        ListNode node = new ListNode();

        assertEquals(
                Arrays.toString(new int[]{}),
                Arrays.toString(node.values())
        );
    }
}
