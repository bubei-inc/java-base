package com.sun.juc.aqs.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockForAqs {
    volatile int count = 0;
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        for (int i = 0; i < 6; i++) {
            new Thread(() -> {
                // 获取不到锁的线程会被放到一个等待队列中，等待获取锁。FIFO(先进先) 线程会被阻塞，lock时尝试获取锁。(BLOCK)
                lock.lock();
                System.out.println(Thread.currentThread().getName());
                try {
                    Thread.sleep(20000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }).start();
        }
        System.out.println("hello");
    }
}
