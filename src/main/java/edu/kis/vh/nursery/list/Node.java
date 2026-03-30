package edu.kis.vh.nursery.list;

public final class Node {

    public int value;
    private Node prev;
    private Node next;

    public Node(int i) {
        value = i;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }
}
