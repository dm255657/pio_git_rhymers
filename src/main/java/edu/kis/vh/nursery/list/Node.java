package edu.kis.vh.nursery.list;

/**
 * Klasa reprezentująca węzeł listy dwukierunkowej.
 */
public final class Node {

    /** Wartość przechowywana w węźle. */
    public int value;

    /** Wskaźnik na poprzedni element. */
    public Node prev;

    /** Wskaźnik na następny element. */
    public Node next;

    /**
     * Tworzy nowy węzeł z konkretną liczbą.
     * @param i wartość do zapisu
     */
    public Node(int i) {
        value = i;
    }

    /**
     * @return poprzedni węzeł w kolejce
     */
    public Node getPrev() {
        return prev;
    }

}