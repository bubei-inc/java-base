package com.son.parallel;


import com.son.parallel.service.TaskRunnable;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchService {
    public static void main(String[] args) {
//        CountDownLatch countDownLatch = new CountDownLatch(3);
//        for (int i = 0; i < 3; i++) {
//            new Thread(new TaskRunnable(i, countDownLatch)).start();
//        }
//        try {
//            countDownLatch.await();
//            System.out.println(countDownLatch.getCount());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("end");
        Map<String, String > map = new HashMap<>();
        System.out.println(map.size() ==0);
    }
}
