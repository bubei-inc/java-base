package com.son.clazzb;

import com.son.clazza.ClazzA;

public class ClazzB {
    public static void test () {
        ClazzA a = new ClazzA();
        System.out.println(a.getHello());
    }

    public static void main(String[] args) {
        test();
    }
}
