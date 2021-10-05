package com.company;

public class BMW extends Car{
    public BMW(){this.description = "BMW";}

    @Override
    public double cost() {
        return 30000D;
    }
}
