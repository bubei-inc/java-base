package com.sun.juc.sync;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchMa {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Thread t1 = new Thread(() -> {
            System.out.println("hello ");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            countDownLatch.countDown();
        });
        t1.start();
        t1.start();
        Thread t2 = new Thread(() -> {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello 2 ");
        });
    }
}
