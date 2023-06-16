package NodesTests;

import org.example.Nodes.MinNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MinNodeTests {

    @Test
    void createMinNode() {
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
