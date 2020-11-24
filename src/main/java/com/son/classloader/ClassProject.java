package com.son.classloader;

public class ClassProject {
    private String projectName;

    static {
        System.out.println("this is Classloader ------- static");

    }
    public ClassProject() {
        System.out.println("Classloader init -----------------------------------------------------------------------------------------------------");
    }

}
