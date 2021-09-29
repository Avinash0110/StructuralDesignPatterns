package com.avinash.decorator;

public class SportsBike extends DecoratorBike{

    public SportsBike(Bike bike) {
        super(bike);
    }

    @Override
    public void assembleBike() {
        super.assembleBike();
        System.out.println("Adding features of sports bike");
    }
}
