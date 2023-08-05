package org.example.AlgorithmsRoadmap.Stack;

import org.example.Nodes.MinNode;

import java.util.Objects;
import java.util.Stack;

public class MinStack {
    /*
    Design a stack that supports push, pop, top, and retrieving
    the minimum element in constant time.

    Implement the MinStack class:

    MinStack() initializes the stack object.
    void push(int val) pushes the element val onto the stack.
    void pop() removes the element on the top of the stack.
    int top() gets the top element of the stack.
    int getMin() retrieves the minimum element in the stack.
    You must implement a solution with O(1) time complexity for each function.


    Constraints:

    -2^31 <= val <= 2^31 - 1
    Methods pop, top and getMin operations will always be called on non-empty stacks.
    At most 3 * 10^4 calls will be made to push, pop, top, and getMin.
     */

    private final Stack<Integer> stack;
    private final Stack<Integer> minStack;

    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int val) {
        boolean wasEmpty = stack.empty();
        stack.push(val);

        if (wasEmpty || val <= minStack.peek())
            minStack.push(val);
    }

    public void pop() {
        if (Objects.equals(stack.pop(), minStack.peek()))
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}



class MinStackB {

    private MinNode head;

    public MinStackB() {

    }

    //while pushing add the node to the front of the linked list
    //-2 <---- 0 <--- -3
    //while pushing we also keep track of minimum value at each
    //point a number is added -> to get minimum value when something is popped
    public void push(int val) {
        if (head == null) {
            head = new MinNode(val, val, null);
        } else {
            head = new MinNode(val, Math.min(val, head.min), head);
        }
    }

    //as front element is the top we simply move the head
    public void pop() {
        head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return head.min;
    }
}
