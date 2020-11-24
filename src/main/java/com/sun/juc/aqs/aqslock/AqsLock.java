package com.sun.juc.aqs.aqslock;

import java.util.concurrent.locks.ReentrantLock;

public class AqsLock {
    private static ReentrantLock lock = new ReentrantLock(true);
    public static void main(String[] args) {
        new Thread(() -> {
            lock.lock();
            try {
                Thread.sleep(1000000);
                System.out.println(Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.unlock();
        }).start();



        new Thread(() -> {
            while(!lock.tryLock()) {
                try {
                    System.out.println("locked");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            lock.unlock();
        }).start();


        new Thread(() -> {
            lock.lock();
            System.out.println("hello");
            lock.unlock();
        }).start();
    }
}
