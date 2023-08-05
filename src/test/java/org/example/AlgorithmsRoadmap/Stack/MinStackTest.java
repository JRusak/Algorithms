package org.example.AlgorithmsRoadmap.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinStackTest {
    @Test
    void minStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(
                -3,
                minStack.getMin()
        );
        minStack.pop();
        assertEquals(
                0,
                minStack.top()
        );
        assertEquals(
                -2,
                minStack.getMin()
        );
    }

    @Test
    void minStackB() {
        MinStackB minStackB = new MinStackB();
        minStackB.push(-2);
        minStackB.push(-0);
        minStackB.push(-3);

        assertEquals(
                -3,
                minStackB.getMin()
        );
        minStackB.pop();
        assertEquals(
                0,
                minStackB.top()
        );
        assertEquals(
                -2,
                minStackB.getMin()
        );
    }
}
