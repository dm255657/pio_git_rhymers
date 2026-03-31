package edu.kis.vh.nursery.list;

public final class Node {

    public int value;
    public Node prev;
    public Node next;

    public Node(int i) {
        value = i;
    }

    public Node getPrev() {
        return prev;
    }

}
