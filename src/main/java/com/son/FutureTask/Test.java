package com.son.FutureTask;

public class Test {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("hello");
        }).start();

        System.out.println(new StringBuffer().length());
    }
}
