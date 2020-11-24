package com.son.stream;

import lombok.val;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class MapStream {
    private static final  Integer SIZE = 10;

    public static void main(String[] args) {
        val list = new ArrayList<Double>();
        for (int i = 0; i < SIZE ; i++) {
            list.add(Double.parseDouble(String.valueOf(i)));
        }
        val avg = list.stream().map(x -> {
            return x/list.size();
        }).collect(Collectors.toList());
        avg.stream().forEach(System.out::println);
    }
}
