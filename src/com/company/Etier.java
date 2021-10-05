package com.company;

public class Etier extends Options{
    Car car;
    public Etier(Car car){this.car = car;}

    @Override
    public String getDescription() {
        return this.car.getDescription() + " E-tier";
    }

    @Override
    public double cost() {
        return 20000D + this.car.cost();
    }
}
