package com.company;

public abstract class Car {
    String description = "Unknown Car";
    public Car(){

    }

    public String getDescription() {
        return this.description;
    }
    public abstract double cost();
}
