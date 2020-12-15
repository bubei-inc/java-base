package com.son.reflect;


import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
//        Class cls = Class.forName("com.son.reflect.TestDemo");
//        Object o = cls.newInstance();
//        Method method = cls.getDeclaredMethod("test");
//        method.setAccessible(true);
//        method.invoke(o);
        System.out.println(new StringBuffer().length());
//        System.out.println(method.toGenericString());
    }
}
