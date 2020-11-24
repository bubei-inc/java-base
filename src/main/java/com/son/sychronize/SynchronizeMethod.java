package com.son.sychronize;

public class SynchronizeMethod {

    public void test() {
        synchronized (this) {
            System.out.println("hello");
        }
    }
}
