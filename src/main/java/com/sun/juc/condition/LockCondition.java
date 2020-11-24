package com.sun.juc.condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class LockCondition {
    private static Condition condition;
    public static int count;
    public static ReentrantLock lock = new ReentrantLock(false);
    public static void main(String[] args) {
        condition = lock.newCondition();
        new Thread(() -> {
            try {
                await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() -> {
            try {
                signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }

    public static void await() throws InterruptedException {
        lock.lock();
        while (true) {
            if (count == 3) {
                condition.await();
                break;
            }
            count++;
            System.out.println(count);

        }
        System.out.println("end ---->");
        lock.unlock();
    }


    public static void signal() throws InterruptedException {
        while (true) {
            System.out.println("#####[" +count + "]#####");
            if (count == 3) {
                System.out.println("Wait 3 sec!!!");
                Thread.sleep(3000);
                condition.signal();
                break;
            }
        }
    }

}
