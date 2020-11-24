package com.son.executorservice;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadPoolExecutorS {
//    private static final int NCPU = Runtime.getRuntime().availableProcessors();
    private static final int NCPU = 2;
    private static final int KEEP_ALIVE = 60;

    public static void main(String[] args) {
        ExecutorService service = new ThreadPoolExecutor(NCPU, NCPU + 2, KEEP_ALIVE, TimeUnit.SECONDS, new ArrayBlockingQueue<>(10));
        int count = 0;
        for (int i = 0; i < 11; i++) {
            service.submit(() -> {
                try {
                    Thread.sleep(30000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("test !!!");
            });
            count ++;

        }
    }
}
