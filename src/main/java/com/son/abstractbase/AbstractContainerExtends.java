package com.son.abstractbase;

public abstract class AbstractContainerExtends extends AbstractContainer{
    @Override
    public void write(String value) {
        System.out.println(String.format("-------> %s", value));
    }
}
