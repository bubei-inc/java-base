package com.son.classloader;

public class ClassProjectMain {

    public static void main(String[] args) throws ClassNotFoundException {
        // test for Class.forName()
//        Class.forName("com.son.classloader.ClassProject");

        ClassLoader.getSystemClassLoader().loadClass("java.lang.SSt");
    }
}
