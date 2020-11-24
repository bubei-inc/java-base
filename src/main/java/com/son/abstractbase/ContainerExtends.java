package com.son.abstractbase;

public class ContainerExtends extends AbstractContainer {
    @Override
    public void write(String value) {
        System.out.println(value);
    }

    @Override
    public void say(String world) {
        System.out.println("you speak : " + world);
    }
}
