package com.son.classloader;

public class ClassRefSon  extends  ClassRefDad{

    public ClassRefSon() {
        System.out.println("default constructor son ========");
    }

    static {
        System.out.println("Son init");
    }
    public static String get() {
        return  "hello";

    }
}

