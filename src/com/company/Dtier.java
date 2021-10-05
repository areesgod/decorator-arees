package com.company;

public class Dtier extends Car{
    Car car;
    public Dtier(Car car){this.car = car;}

    @Override
    public String getDescription() {
        return this.car.getDescription() + " D-tier";
    }

    @Override
    public double cost() {
        return 10000D + this.car.cost();
    }
}
