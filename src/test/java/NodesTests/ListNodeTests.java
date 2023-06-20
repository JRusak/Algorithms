package NodesTests;

import org.example.Nodes.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListNodeTests {

    @Test
    void createEmptyListNode() {
        ListNode listNode = new ListNode();

        assertNull(listNode.val);
        assertNull(listNode.next);
    }

    @Test
    void createListNodeWithValue() {
        ListNode listNode = new ListNode(3);
        assertEquals(
                3,
                listNode.val.intValue()
        );
        assertNull(listNode.next);
    }

    @Test
    void createListNodeWithValueAndNext() {
        ListNode listNode1 = new ListNode(3);
        assertEquals(
                3,
                listNode1.val.intValue()
        );
        assertNull(listNode1.next);

        ListNode listNode2 = new ListNode(
                5,
                listNode1
        );
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
    void fillList_NumsList_HeadListNode() {
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
    void fillList_EmptyNumsList_Null() {
        int[] nums = {};
        ListNode node = ListNode.fillList(nums);

        assertNull(node);
    }

    @Test
    void addNodes_OldNodeNewNums_NewNodesAddedToOldOne() {
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
    void addNodes_OldNodeEmptyNums_OldNode() {
        ListNode oldListNode = new ListNode(5);
        int[] nums = {};
        oldListNode.addNodes(nums);

        assertEquals(
                5,
                oldListNode.val.intValue()
        );
        ListNode node = oldListNode.next;
        assertNull(node);
    }

    @Test
    void getValues_ListNode_ValuesFromNodeToTheEndOfTheList() {
        int[] nums = {1, 2, 3, 4, 5};
        ListNode node = ListNode.fillList(nums);

        assertArrayEquals(
                nums,
                node.getValues()
        );
    }

    @Test
    void getValues_EmptyListNode_EmptyNumsList() {
        ListNode node = new ListNode();

        assertArrayEquals(
                new int[]{},
                node.getValues()
        );
    }
}
