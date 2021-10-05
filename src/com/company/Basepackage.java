package com.company;

public class Basepackage extends Options{
    Car car;
    public Basepackage(Car car){this.car = car;}

    @Override
    public String getDescription() {
        return this.car.getDescription() + " Base package with minimal features";
    }

    @Override
    public double cost() {
        return 5000D + this.car.cost();
    }

}
