package com.son.generic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class GenericTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("test");

        try {
            Method method = list.getClass().getDeclaredMethod("add", Object.class);
            method.invoke(list, 123);
            method.invoke(list, 12.0f);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
