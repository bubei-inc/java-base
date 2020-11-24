package com.pattern.factory.simplefactory;

public class CarMain {
    /**
     * 在以下的carFactory中 定义了car工厂，不同种类的车继承这个工程来实现自己的工厂，创建自己品牌的车辆
     * 同时在下面的Car类中定义了汽车公用的一些行为能力这就是car的模板,不同的car实现模板来实现自己车的功能，同时可以在模板之上拓展自己car
     * 的能力，这就是模板方法。
     * @param args
     */
    public static void main(String[] args) {
        CarFactory benzFatory = new BenzFactoy();
        Car car = benzFatory.createCar("迈巴赫");
        car.drive();
        CarFactory autoFactory = new AutoFactory();
        Car autoCar = autoFactory.createCar("二手奥拓");
        autoCar.drive();
    }
}
