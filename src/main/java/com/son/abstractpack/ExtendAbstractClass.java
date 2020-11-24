package com.son.abstractpack;

public class ExtendAbstractClass  extends AbstractClass{

    public ExtendAbstractClass(String name) {
        super(name);
        System.out.println("name : " + name) ;
    }
    public ExtendAbstractClass() {
    }

    @Override
    public void speak() {
        System.out.println("hello word!");
    }
}
