package com.son.stream;

import lombok.Data;

@Data
public class Student implements Cloneable {
    private String name;

    private int age;


    public Student() {
    }


    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
