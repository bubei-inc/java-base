package com.son.string;

public class StringRes {
    public static void main(String[] args) {
        String res = new String("hello");
        String hello = new String(new char[]{'h', 'h'});
        System.out.println(res.codePointAt(2));
        System.out.println(hello);
    }
}
