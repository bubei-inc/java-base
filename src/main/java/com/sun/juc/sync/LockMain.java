package com.sun.juc.sync;

import java.util.concurrent.locks.ReentrantLock;

public class LockMain {
    private static final ReentrantLock LOCK = new ReentrantLock();

    public static void main(String[] args) {
        new Thread(() -> {
            LOCK.lock();
            print(Thread.currentThread().getName());
            LOCK.unlock();
        }).start();

        new Thread(() -> {
            if (LOCK.isLocked()) {
                try {
                    LOCK.lockInterruptibly();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                LOCK.lock();
                print(Thread.currentThread().getName());
                LOCK.unlock();
            }
        }).start();

    }

    private static void print(String threadName) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName);
    }

}
