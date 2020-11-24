package com.son.abstractpack;

import lombok.val;

public class AbstractMainTest {
    public static void main(String[] args) {
        // 抽象类不可以被实例化
        val test = new ExtendAbstractClass();
        test.speak();

        val test1 = new ExtendAbstractClass("jame");
        test1.sayHello();


    }
}
