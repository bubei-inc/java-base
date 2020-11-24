package com.sun.juc.aqs.arrayblockingqueue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQueueDemo {
    public static void main(String[] args) throws InterruptedException {
        // 队列需要传capacity

        // add() 元素是会调启相关的signal(),来通知阻塞的线程获取数据。
        // take() 如果当前的容器中没有相关的元素便会挂起当前的线程，知道有signal()调启相关的线程
        ArrayBlockingQueue<String> arrayBlockingQueue = new ArrayBlockingQueue<String>(100);
        arrayBlockingQueue.add("hello");
        arrayBlockingQueue.add("w");
        arrayBlockingQueue.add("o");
        arrayBlockingQueue.add("l");
        arrayBlockingQueue.add("r");
        arrayBlockingQueue.add("d");
        while (true) {
            String str;
            if ((str = arrayBlockingQueue.take()) == null) {
                break;
            }
            System.out.println(str);
        }


    }
}
