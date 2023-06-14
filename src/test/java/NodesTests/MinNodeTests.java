package NodesTests;

import org.example.Nodes.MinNode;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNull;

public class MinNodeTests {

    @Test
    public void createMinNode() {
        MinNode minNode = new MinNode(4, 2, null);

        assertEquals(
                4,
                minNode.val
        );

        assertEquals(
                2,
                minNode.min
        );

        assertNull(minNode.next);
    }
}
