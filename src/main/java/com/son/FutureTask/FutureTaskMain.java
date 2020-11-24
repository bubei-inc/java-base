package com.son.FutureTask;


import java.util.concurrent.*;

import static java.util.concurrent.TimeUnit.*;

public class FutureTaskMain {
    public static void main(String[] args) {
        int coreSize = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = new ThreadPoolExecutor(coreSize,
                coreSize, 1,
                SECONDS,
                new LinkedBlockingQueue<>(25)
        );

       Future<String> future =  executorService.submit(() -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           System.out.println(Thread.currentThread().getName());
            return "hello world";
        });

        try {
            // 查看是否阻塞
            System.out.println(Thread.currentThread().getName());
            System.out.println(future.get());
            System.out.println("finish");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
