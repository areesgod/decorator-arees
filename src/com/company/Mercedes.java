package com.company;

public class Mercedes extends Car{
    public Mercedes() {this.description = "Mercedes";}

    @Override
    public double cost() {
        return 25000D;
    }
}
