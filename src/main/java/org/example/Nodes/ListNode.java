package org.example.Nodes;

import java.util.ArrayList;
import java.util.List;

public class ListNode {
    public Integer val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode fillList(int[] nums) {
        ListNode node = new ListNode();
        ListNode currentNode = node, lastNode = node;

        for (int n : nums) {
            if (currentNode == null) {
                currentNode = new ListNode(n);
                lastNode.next = currentNode;
            } else
                currentNode.val = n;

            lastNode = currentNode;
            currentNode = currentNode.next;
        }

        return node;
    }

    public void addNodes(int[] nums) {
        this.next = fillList(nums);
    }

    public int[] values() {
        List<Integer> result = new ArrayList<>();

        ListNode node = this;
        while (node != null) {
            if (node.val != null)
                result.add(node.val);
            node = node.next;
        }

        return result.stream().mapToInt(i -> i).toArray();
    }
}
