package com.son.parallel;


import com.son.parallel.service.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class FutureParallel {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(3);
//        ThreadPoolExecutor executor  = (ThreadPoolExecutor) Executors.newFixedThreadPool(2);
//        List<Future<Integer>> futures = new ArrayList<>();
//        Future<Integer> future1 = executor.submit(new Task(100, 200));
//        Future<Integer> future2 = executor.submit(new Task(10, 200));
//        List<List<Integer>> lists = new ArrayList<>();
//        List<Integer> list1 = new ArrayList<>();
//        list1.add(1);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(2);
//        lists.add(list1);
//        lists.add(list2);
//
//        int rel = lists.parallelStream().reduce(1, (a,b)->a + b.get(0), (x,y)->x+y);
//        System.out.println(rel); // return 5 instead of 4
    }
}
