package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;

    private int[] NUMBERS = new int[NUMBERS_SIZE];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == NUMBERS_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
