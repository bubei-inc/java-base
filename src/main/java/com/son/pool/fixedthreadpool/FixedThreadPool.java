package com.son.pool.fixedthreadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {

        // 首先会创建线程，coresize达到上限之后， 直接加入队列， 队列full , 开启新的线程，threads >= maxsize, reject,直到 maxsize ,当 poolsize> coresize , time > keepalive , 回收线程 -> coreszie, 当thread > maxsize , 则进入到 queue中。
        ExecutorService executorService  = Executors.newFixedThreadPool(1);
        executorService.submit(() -> {
            try {
                Thread.sleep(100000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("1");
        });
        executorService.submit(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2");
        });

    }
}
