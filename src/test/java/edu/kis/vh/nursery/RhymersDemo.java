package edu.kis.vh.nursery;

import edu.kis.vh.nursery.factory.DefaultRhymersFactory;
import edu.kis.vh.nursery.factory.Rhymersfactory;

final class RhymersDemo {

    public static final int NUMBERS_AMOUNT = 15;
    public static final int RHYMERS_COUNT = 3;

    public static void main(String[] args) {
        Rhymersfactory factory = new DefaultRhymersFactory();
        
        defaultCountingOutRhymer[] rhymers = { factory.GetStandardRhymer(), factory.GetFalseRhymer(),
                factory.GetFIFORhymer(), factory.GetHanoiRhymer()};
        
        for (int i = 1; i < NUMBERS_AMOUNT; i++)
            for (int j = 0; j < RHYMERS_COUNT; j++)
                rhymers[j].countIn(i);
        
        java.util.Random rn = new java.util.Random();
        for (int i = 1; i < NUMBERS_AMOUNT; i++)
            rhymers[RHYMERS_COUNT].countIn(rn.nextInt(20));
        
        for (int i = 0; i < rhymers.length; i++) {
            while (!rhymers[i].callCheck())
                System.out.print(rhymers[i].countOut() + "  ");
            System.out.println();
        }
        
        System.out.println("total rejected is "
                + ((HanoiRhymer) rhymers[RHYMERS_COUNT]).reportRejected());
        
    }
    
}