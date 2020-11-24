package com.son.stream;

import lombok.val;

import java.util.ArrayList;

public class ParallelStream {
    public static void main(String[] args) {
        val list = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        val count = list.parallelStream().parallel().count();

        System.out.println(count);

    }
}
