package com.son.hashset;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetT {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // map 特性 一个map中的key值不会重复
        set.add("hello");
        set.add("hello");
        set.add("!");
        for (String str : set) {
            System.out.println(str);
        }
        TreeSet<String> treeSet = new TreeSet<>();

        treeSet.add("hello");
        treeSet.add("world");
        treeSet.add("!");
        for (String str : treeSet) {
            System.out.println(str);
        }

    }
}
