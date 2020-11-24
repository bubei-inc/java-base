package com.son.copy;

import com.son.stream.Student;

public class DeepCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("james", 12);
        Student student1 = (Student)student.clone();
        System.out.println(student);
        System.out.println(student1);
        student.setAge(14);
        System.out.println(student);
        System.out.println(student1);
    }
}
