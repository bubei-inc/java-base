package com.son.typeErasure;

import java.util.List;

public class TypeErasure {
    public static void main(String[] args) {

    }

    // 类型擦除之后这个类为一个method 并没有试下重载
    private static void method(List<Integer> list) {
        System.out.println("method integer");
    }

    private static void method(List<String> list) {
        System.out.println("method integer");
    }
}
