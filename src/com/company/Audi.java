package com.company;

public class Audi extends Car{
    public Audi(){this.description = "Audi";}

    @Override
    public double cost() {
        return 22500D;
    }
}
