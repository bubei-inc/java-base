package com.son.generic;

import lombok.val;

import java.lang.reflect.InvocationTargetException;

public class MainTest {
    public static void main(String[] args) {
        val methodClass = new GenericClass<String>();
        methodClass.setName("hello");
        try {
            val method = methodClass.getClass().getDeclaredMethod("setName", Object.class);
            method.invoke(methodClass, 1234);
            val method2 = methodClass.getClass().getDeclaredMethod("getName");
            System.out.println(method2.invoke(methodClass));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
