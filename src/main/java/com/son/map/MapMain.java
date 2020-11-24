package com.son.map;

import lombok.val;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
//        val map = new HashMap<String, String>();
//        // ifAbsent means is key  has relate value then new value will not replace old value;
//        map.putIfAbsent("name", "hello");
//        System.out.println(map.get("name"));
//        map.put("name", "hello1");
//        map.putIfAbsent("name", "hello2");
//        System.out.println(map.get("name"));
        /*******************************************************************************************************************/
        val map = new HashMap<String, String>();
        map.put("hello", "world!");
        val newMap = new HashMap(map);
//        System.out.println(newMap.get("hello"));
    }
}
