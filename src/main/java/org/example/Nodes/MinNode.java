package org.example.Nodes;

public class MinNode {
    public int val;
    public int min;
    public MinNode next;

    public MinNode(int val, int min, MinNode next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}
