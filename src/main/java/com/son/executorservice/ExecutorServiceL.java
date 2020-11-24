package com.son.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceL {
    public static void main(String[] args) {
        Executors.newFixedThreadPool(3).submit(() -> {
            System.out.println("hello");
        });
    }
}
