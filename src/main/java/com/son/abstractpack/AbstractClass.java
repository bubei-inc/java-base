package com.son.abstractpack;


public abstract class AbstractClass {
    private String  name;

    public String getName() {
        return this.name;
    }
    //抽象类可以有构造函数
    public AbstractClass(String name) {
        System.out.println("name : " + name);
        this.name = name;
    }
    // 无参构造函数
    public AbstractClass() {

    }

    public abstract void speak();

    public void sayHello() {
        System.out.println("name is : " + name );
    }

}
