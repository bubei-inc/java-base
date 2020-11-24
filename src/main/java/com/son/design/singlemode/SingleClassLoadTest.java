package com.son.design.singlemode;

import lombok.val;

public class SingleClassLoadTest {
    public static int count2 = 2;
    private static SingleClassLoadTest singleClassLoadTest = new SingleClassLoadTest();
    public static int count1 ;
    static {
        System.out.println(count1);
        System.out.println(count2);
    }


    public SingleClassLoadTest() {
        System.out.println("constructor ------");
        count1++;
        count2++;
        System.out.println("count1: " + count1 + " ,count2: " + count2);
    }


    public static SingleClassLoadTest getInstance() {
        System.out.println("test");
        return singleClassLoadTest;
    }

    public static void main(String[] args) {
//         val single = SingleClassLoadTest.getInstance();
//
//        System.out.println("count1: " + single.count1);
//        System.out.println("count2: " + single.count2);

    }
}
