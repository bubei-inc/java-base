package com.son.map.putifabsent;

import lombok.val;

import java.util.HashMap;
import java.util.Map;

public class PutIfAbsent {
    public static void main(String[] args) {

        // PutIfAbsent 第一次返回 null, 之后一旦有值就不可以再更改。
        Map<String, String>  map = new HashMap<>();
        val name = map.putIfAbsent("hello", "name");
        val name2 = map.putIfAbsent("hello", "name");
        val name3 = map.putIfAbsent("hello", "name2");
        System.out.printf("name1: %s, name2: %s, name3: %s", name, name2, name3);
    }
}
