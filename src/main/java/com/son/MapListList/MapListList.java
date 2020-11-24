package com.son.MapListList;

import com.sun.tools.javac.comp.Resolve;
import lombok.val;

import javax.swing.event.ListDataEvent;
import java.util.*;
import java.util.stream.Collectors;

public class MapListList {
    public static void main(String[] args) {
        val allList = new ArrayList<List<Double>>();
        for (int i = 7; i >= 0; i--) {
            val list = new ArrayList<Double>();
            for (int j = 0; j < i + 1; j++) {
                list.add(Integer.valueOf(j).doubleValue());
            }
            allList.add(list);
        }
        val revease = allList.stream().sorted(Comparator.comparing(x -> x.size())).collect(Collectors.toList());
        System.out.println(revease);
    }
}
