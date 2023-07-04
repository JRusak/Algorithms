package org.example.Nodes;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BracketsNodeTest {

    @Test
    void createBracketsNode() {
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
