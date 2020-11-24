package com.test;

import com.son.stream.Student;

public class StringTest {
    public static void main(String[] args) {
//        String test = new String("a") + new String("b");
//        test.intern();
//        System.out.println(test);
        Student s = new Student();
        s.setName("sout");
        System.out.println(s.hashCode());
        s.setName("s");
        System.out.println(s.hashCode());
    }
}
