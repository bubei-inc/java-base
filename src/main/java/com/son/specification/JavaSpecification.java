package com.son.specification;

import lombok.val;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class JavaSpecification {
    public static void main(String[] args) {
        val list = new ArrayList<Integer>();
        for (int i = 0; i < 100 ; i++) {
            list.add(i+1);
        }

        val oddList = list.stream().filter(li -> {
           return  li % 2 == 0 ? true : false;
        }).collect(Collectors.toList());
        System.out.println(oddList);
    }
}
