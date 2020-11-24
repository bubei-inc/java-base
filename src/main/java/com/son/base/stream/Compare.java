package com.son.base.stream;

import lombok.val;

import java.util.ArrayList;

public class Compare {

    public static void main(String[] args) {
        val arrays = new ArrayList<Double>();
        for (int i = 0; i < 100; i++) {
            arrays.add(Math.random() * 100);
        }
        val ars = arrays.stream().sorted((o1, o2) -> {
            return o1.compareTo(o2);
        });
       ars.forEach(System.out::println);
    }
}
