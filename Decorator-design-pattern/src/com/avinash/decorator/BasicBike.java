package com.avinash.decorator;

public class BasicBike implements Bike{
    @Override
    public void assembleBike() {
        System.out.println("Basic bike");
    }
}
