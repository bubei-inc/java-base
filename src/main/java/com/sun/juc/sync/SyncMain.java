package com.sun.juc.sync;

public class SyncMain {
    public static final Object LOCK = "";

    public static void main(String[] args) {
        new Thread(() -> {
            print(Thread.currentThread().getName());
        }).start();

        new Thread(() -> {
            print(Thread.currentThread().getName());
        }).start();
    }

    private static void print(String threadName) {
        synchronized (LOCK) {
            System.out.println(threadName);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
