package com.son.MapListList;

import com.son.base.HashMap.HashMapT;
import lombok.val;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MapListMainTest {
    public static void main(String[] args) {
        val map = new HashMap<String, List<String>>();
        val list = new ArrayList<String>();
        list.add("james");
        list.add("hello");
        map.put("name",list);
        map.get("name").add("world");
        map.get("name").forEach(System.out::println);
    }
}
