package com.son.collection;

import lombok.val;

import java.util.concurrent.ConcurrentHashMap;

@SuppressWarnings("unused")
public class ConCurrentHashMap {

    public static void main(String[] args) {
        ConcurrentHashMap map = new ConcurrentHashMap();
        String hello = (String) map.put("hello", "hello");

       String name = (String) map.put("hello", "name");
        System.out.println(hello);
        System.out.println(name);
//        map.put("hello", "hello");
//
//        int i;
//        String name = "name";
//        int hashCode = name.hashCode();
//        int HASH_BITS = 0x7fffffff;
//        System.out.println((hashCode ^ (hashCode >>> 16)) & HASH_BITS );

    }
}
