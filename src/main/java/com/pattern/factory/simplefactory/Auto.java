package com.pattern.factory.simplefactory;

public class Auto implements Car {
    private String type;

    public Auto() {

    }

    public Auto(String type) {
        this.type = type;
    }

    @Override
    public void drive() {
        System.out.println("drive Auto -  " + type + " !");
    }
}
