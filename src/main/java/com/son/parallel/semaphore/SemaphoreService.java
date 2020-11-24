package com.son.parallel.semaphore;

import java.util.concurrent.Semaphore;

public class SemaphoreService {
    public static void main(String[] args) {
        Semaphore  semaphore = new Semaphore(2);
        for (int i = 0; i < 3; i++) {
            try {
                semaphore.acquire();
                System.out.println("thread " + i);
                new Thread() {
                    @Override
                    public void run() {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }.start();
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}
