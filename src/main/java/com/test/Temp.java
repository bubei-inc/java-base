package com.test;


public class Temp {

    private int i;

    public Temp() {
    }

    public int getI() {
        return i;
    }


    private static final sun.misc.Unsafe U;
    private static final long BASEIOFFSET;

    static {
        try {
            U = sun.misc.Unsafe.getUnsafe();
            Class<?> k = Temp.class;
            BASEIOFFSET = U.objectFieldOffset(k.getDeclaredField("i"));
        } catch (Exception e) {
            throw new Error(e);
        }
    }

    public void add(int i) {
        if (U.compareAndSwapInt(i, BASEIOFFSET, 0, 1))  {
            System.out.println("success");
        }
        System.out.println("failed");
    }

}
