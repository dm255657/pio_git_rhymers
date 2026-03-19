package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private int[] Numbers = new int[12];

    public int Total = -1;

    public void countIn(int in) {
        if (!isFull())
            Numbers[++Total] = in;
    }

    public boolean callCheck() {
        return Total == -1;
    }

    public boolean isFull() {
        return Total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return Numbers[Total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return Numbers[Total--];
    }

}
