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
        ListNode head = null, lastNode = null;

        for (int n : nums) {
            if (lastNode == null) {
                head = new ListNode(n);
                lastNode = head;
            } else {
                lastNode.next = new ListNode(n);
                lastNode = lastNode.next;
            }
        }

        return head;
    }

    public void addNodes(int[] nums) {
        this.next = fillList(nums);
    }

    public int[] getValues() {
        List<Integer> result = new ArrayList<>();

        ListNode node = this;
        while (node != null) {
            if (node.val != null)
                result.add(node.val);
            node = node.next;
        }

        return result.stream()
                .mapToInt(i -> i).toArray();
    }
}
