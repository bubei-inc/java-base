package com.son.copy;

import com.son.stream.Student;

public class ShallowCopy {
    public static void main(String[] args) {
        Student student = new Student("james", 12);
        Student std1 = student;
        System.out.println(student);
        System.out.println(std1);
        student.setAge(15);
        System.out.println(student);
        System.out.println(std1);
        // student change and then std1 change,两者使用同一个引用

    }
}
