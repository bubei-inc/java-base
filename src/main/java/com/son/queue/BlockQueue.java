package com.son.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockQueue {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(100);
        for (int i = 0; i < 10; i++) {
            queue.add(() -> {
                System.out.println("hello!");
            });
        }
        // 向队列中添加元素,如果立即可行，且小于队列容量MAX_SIZE,成功时返回true.
        queue.offer(() -> {
            System.out.println("world!");
        });
        // 获取并返回队列的头, 队列为空时，return null
        queue.poll().run();
        try {

            // 将指定元素放入队列中，但是会等待，如果当前队列满了。（阻塞）,直到有空间可以使用。
            queue.put(() -> {
                System.out.println("hello1!");
            });
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //take: 获取并移除此队列的头部，在元素变得可用之前一直等待 。queue的长度 == 0 的时候，一直阻塞
        queue.take().run();

        // 获取但不移除次队列的头, 如果队列为空则返回null
        queue.peek().run();
    }
}
