package com.pattern.factory.simplefactory;

public class AutoFactory  extends  CarFactory{
    @Override
    public Car createCar(String type) {
        return new Auto(type);
    }
}
