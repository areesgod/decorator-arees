package com.company;

public class Middlepackage extends Options{
    Car car;
    public Middlepackage(Car car){this.car = car;}

    @Override
    public String getDescription() {
        return this.car.getDescription() + " Middle package with wooden interior";
    }

    @Override
    public double cost() {
        return 10000D + this.car.cost();
    }
}
