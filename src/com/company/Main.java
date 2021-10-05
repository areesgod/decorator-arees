package com.company;

public class Main {

    public static void main(String[] args) {
	Car car = new Audi();
        car = new Dtier(car);
        car = new Middlepackage(car);
        System.out.println(car.getDescription() + " $" + car.cost());
    Car car1 = new Mercedes();
        car1 = new Ftier(car1);
        car1 = new Richpackage(car1);
        System.out.println(car1.getDescription() + " $" + car1.cost());

    }
}
