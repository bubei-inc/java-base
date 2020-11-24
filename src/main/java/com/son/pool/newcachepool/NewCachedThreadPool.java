package com.son.pool.newcachepool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class NewCachedThreadPool {
    // cacheThreadPool， corePoolSize = 0 , max = Integer.MAX 使用synchronousQueue 是因为 synchronousQueue.offer()=false ，故而可以直接执行addWorker的操作，但是必然会导致内存溢出，在thread
    // 足够多的情况下面。使用场景：1. 耗时较短的任务。 2. 任务处理速度 > 任务提交速度 ,这样才能保证不会不断创建新的进程,避免内存被占满。
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Future f = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            return "new f1";
        });
        Future f2 = executorService.submit(() -> {
            System.out.println(Thread.currentThread().getName());
            return "new f2";
        });
        try {
            System.out.println(f.get());
            System.out.println(f2.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
