package com.company;

public class Ftier extends Options {
    Car car;
    public Ftier(Car car){this.car = car;}

    @Override
    public String getDescription() {
        return this.car.getDescription() + " F-tier";
    }

    @Override
    public double cost() {
        return 40000D + this.car.cost();
    }
}
