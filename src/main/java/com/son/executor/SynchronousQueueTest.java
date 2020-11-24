package com.son.executor;

import java.util.concurrent.*;

public class SynchronousQueueTest {
    // SynchronousQueue A 线程put ,需要等待B 线程take完成之后才可以结束阻塞, 反之， a.take()此时容器中没有存在相关的数据， take会阻塞，直到B.put();
    public static void main(String[] args) {
        SynchronousQueue<String> synchronousQueue = new SynchronousQueue<>();
        boolean isok = synchronousQueue.offer("hello");
        System.out.println(isok);
        synchronousQueue.offer("hell2");
        new Thread(() -> {
            try {
                System.out.println("start to take");
                System.out.println(synchronousQueue.take());
//            System.out.println(synchronousQueue.poll());
//            System.out.println(synchronousQueue.peek());
                System.out.println("end take");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("start to put");

                synchronousQueue.put("hello222");
//            synchronousQueue.offer("hello222");
                System.out.println("end put");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

    }
}
