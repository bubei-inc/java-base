package com.pattern.factory.simplefactory;

public class BenzFactoy extends CarFactory {

    public BenzFactoy() {
    }

    @Override
    public Car createCar(String type) {
        return new Benz(type);
    }
}
