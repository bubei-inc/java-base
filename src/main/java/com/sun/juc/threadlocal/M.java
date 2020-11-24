package com.sun.juc.threadlocal;

public class M {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalized");
    }
}
