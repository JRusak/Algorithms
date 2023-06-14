package NodesTests;

import org.example.Nodes.ListNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class ListNodeTests {

    @Test
    public void createEmptyListNode() {
        ListNode listNode = new ListNode();
        assertEquals(
                0,
                listNode.val
        );
        assertNull(listNode.next);
    }

    @Test
    public void createListNodeWithValue() {
        ListNode listNode = new ListNode(3);
        assertEquals(
                3,
                listNode.val
        );
        assertNull(listNode.next);
    }

    @Test
    public void createListNodeWithValueAndNext() {
        ListNode listNode1 = new ListNode(3);
        assertEquals(
                3,
                listNode1.val
        );
        assertNull(listNode1.next);

        ListNode listNode2 = new ListNode(5, listNode1);
        assertEquals(
                5,
                listNode2.val
        );
        assertEquals(
                listNode1,
                listNode2.next
        );
    }
}
