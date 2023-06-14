package org.example.Nodes;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public void fillList(int[] nums) {
        ListNode currentNode = this, lastNode = this;

        for (int n: nums) {
            if (currentNode == null) {
                currentNode = new ListNode(n);
                lastNode.next = currentNode;
            } else
                currentNode.val = n;

            lastNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public int[] values() {
        List<Integer> result = new ArrayList<>();

        ListNode node = this;
        while (node != null) {
            result.add(node.val);
            node = node.next;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
