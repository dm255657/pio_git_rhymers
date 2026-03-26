package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static final int NUMBERS_SIZE = 12;

    public static final int CALLCHECK_ERR_RETURN_VAL = -1;
    public static final int UNINITIALIZED_TOTAL = -1;

    private int[] NUMBERS = new int[NUMBERS_SIZE];

    public int total = UNINITIALIZED_TOTAL;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == UNINITIALIZED_TOTAL;
    }

    public boolean isFull() {
        return total == NUMBERS_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return CALLCHECK_ERR_RETURN_VAL;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return CALLCHECK_ERR_RETURN_VAL;
        return NUMBERS[total--];
    }

}
