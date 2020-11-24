package com.son.thisclass;

import lombok.val;
import sun.jvm.hotspot.memory.TenuredGeneration;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestMain {
    public static void main(String[] args) {
        int sum = 0;
        val map = new HashMap<String, Integer>();
        map.put("pro-1", 20);
        map.put("pro-2", 30);
        map.put("pro-3", 50);
        sum = 80 + 20;
        int proOne = 0;
        int proSec = 0;
        int proThr = 0;

        for (int i = 1; i <= 100; i++) {
//            int previousTotal = 0;
//            int previous = 0;
//            int random = (int) (Math.random() * sum);
//            val mapKeys = map.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
//            int current = 0;
//            for (String key : mapKeys) {
//                int now = map.get(key);
//                previousTotal += now;
//                if (check(previousTotal, previous, random)) {
//                    if ("pro-1".equals(key)) {
//                        proOne++;
//                        break;
//                    }
//                    if ("pro-2".equals(key)) {
//                        proSec++;
//                        break;
//                    }
//                    if ("pro-3".equals(key)) {
//                        proThr ++;
//                        break;
//                    }
//                     previous = previousTotal;
//                }
//
//            }
            int current = 0;
            int random = (int) (Math.random() * sum);
            for (val entry : map.entrySet()) {
                current += entry.getValue();
                if (random < current) {
                    if ("pro-1".equals(entry.getKey())) {
                        proOne++;
                        break;
                    }
                    if ("pro-2".equals(entry.getKey())) {
                        proSec++;
                        break;
                    }
                    if ("pro-3".equals(entry.getKey())) {
                        proThr++;
                        break;
                    }
                }
            }
        }
        System.out.println(proOne + ", " + proSec + ", " + proThr);
    }


    public static boolean check(Integer now, Integer previous, Integer random) {
        boolean one = true;
        boolean sec = true;
        if (previous != 0) {
            if (previous > random) {
                one = false;
            }
        }
        if (random > now) {
            sec = false;
        }
        return one && sec;
    }
}
