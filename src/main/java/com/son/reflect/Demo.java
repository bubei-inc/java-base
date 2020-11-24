package com.son.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        String str = "com.son.reflect.Wechat";

        Class cls = Class.forName(str);
        Object o = cls.newInstance();
        Method method = cls.getDeclaredMethod("payOnline");
        method.invoke(o);

    }
    // 利用反射实现以上机制
}
