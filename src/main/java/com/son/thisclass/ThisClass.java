package com.son.thisclass;

public class ThisClass {
    private String name = "test";

    public void run() {
        synchronized (new Object()) {
            System.out.println("father");
        }
    }

}
