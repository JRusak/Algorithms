package NodesTests;


import org.example.Nodes.BracketsNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketsNodeTests {

    @Test
    public void createBracketsNode() {
        BracketsNode bracketsNode = new BracketsNode(
                "()()(",
                3,
                2
        );

        assertEquals(
                "()()(",
                bracketsNode.parentheses.toString()
        );
        assertEquals(
                3,
                bracketsNode.openingUsed
        );
        assertEquals(2,
                bracketsNode.closingUsed
        );
    }
}
