package com.son.generic;

// 泛型类,<T>, <T, E>
public class GenericClass<T>{
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }


    // 泛型方法

    public <T> T getMethodName(T t ) {
        return  t;
    }
}
