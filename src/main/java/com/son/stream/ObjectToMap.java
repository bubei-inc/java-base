package com.son.stream;

import lombok.val;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ObjectToMap {

    public static void main(String[] args) {

        val s1 = new Student("hello",12);
        val s2 = new Student("hello",12);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        Student d = new Student();
        Student s = new Student();
        String out  = "hello";
        String in = new String("hello");
        System.out.println("*****************************************************************************************************");
        System.out.println(out.hashCode());
        System.out.println(in.hashCode());
        System.out.println("*****************************************************************************************************");
        System.out.println(out.hashCode());
        d.setName(new String("hello"));
        s.setName(new String("hello"));
        System.out.println(d.hashCode());
        System.out.println(s.hashCode());

        // intern 使用说明
        String sub = new String("a") + new String("b");
        // before intern 加入常量池， ab = ab
        String sub1 = "ab";
        // After intern 此时常量池中已经有了相关的ab， intern 只会在其中重新建一个ab 引用  ab != ab
        sub.intern();
        System.out.println(sub == sub1);

        String t = "ab";
        String t1 = "c";
        String t2 = "abc";
        String t4 = "ab" + "c";
        String t3 = t + t1;
        System.out.println(t4 == t2);
        System.out.println(t2 == t3);
        // 为啥t4 == t2 => true t2 == t3 => false

        Set<Student> set = new HashSet<>();
        val student1 = new Student();
        val student3 = new Student();
        val student2 = new Student();
        student1.setName("hello");
        student1.setAge(11);
        student3.setName("james");
        student3.setAge(12);
        student2.setName("ll");
        student2.setAge(12);
        set.add(student1);
        set.add(student2);
        set.add(student3);
        student1.setAge(14);
        set.add(student1);
        System.out.println(set.size());
        boolean removed = set.remove(student1);
        System.out.println(set.toString());
    }
//    public static void main(String[] args) {
//        val s1 = new Student();
//        val s2 = new Student();
//        val s3 = new Student();
//        s1.setAge(12);
//        s2.setAge(11);
//        s3.setAge(12);
//        s1.setName("zhan");
//        s2.setName("zhan");
//        s3.setName("jiu");
//        val list = new ArrayList<Student>();
//        list.add(s1);
//        list.add(s2);
//        list.add(s3);
//        // 以相同的name 作为key， 不同的age 放到key -> value(list) 中， lamada如何实现
//        val stuMap = new HashMap<String, List<Integer>>();
//        Map<String, List<Integer>> map = list.stream().map(x -> {
//            if (stuMap.get(x.getName()) == null) {
//                stuMap.put(x.getName(), Arrays.asList(x.getAge()));
//                return stuMap;
//            }
//            stuMap.get(x.getName()).add(x.getAge());
//            return stuMap;
//        }).reduce();
//
//        System.out.println(map);

}
