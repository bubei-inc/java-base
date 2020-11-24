package com.pattern.factory.simplefactory;

public class Benz implements Car {
    private String type;

    public Benz() {}

    public Benz(String type) {
        this.type = type;
    }
    @Override
    public void drive() {
        System.out.println("drive benz - ,"+ type +"!");
    }
}
