package com.son.parallel.service;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.concurrent.CountDownLatch;

@Data
@AllArgsConstructor
public class TaskRunnable implements Runnable {
    private int time;
    private CountDownLatch countDownLatch;
    @Override
    public void run() {
        if (time == 1) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        countDownLatch.countDown();
        System.out.println(Thread.currentThread().getName());
    }
}
