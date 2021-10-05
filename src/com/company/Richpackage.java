package com.company;

public class Richpackage extends Options{
    Car car;
    public Richpackage(Car car){this.car = car;}

    @Override
    public String getDescription() {
        return this.car.getDescription() + " Rich package with all features available";
    }

    @Override
    public double cost() {
        return 20000D + this.car.cost();
    }
}
