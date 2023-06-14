package org.example.Nodes;

public class BracketsNode {
    public StringBuilder parentheses;
    public int openingUsed;
    public int closingUsed;

    public BracketsNode(String parentheses, int openingUsed, int closingUsed) {
        this.parentheses = new StringBuilder(parentheses);
        this.openingUsed = openingUsed;
        this.closingUsed = closingUsed;
    }
}
