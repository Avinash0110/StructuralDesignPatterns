package com.avinash.decorator;

public class DecoratorPattern {

    public static void main(String[] args) {


        Bike basicBike=new BasicBike();
        basicBike.assembleBike();

        System.out.println("------------------------");

        Bike sportBike=new SportsBike(new BasicBike());
        sportBike.assembleBike();

        System.out.println("------------------------");

        Bike luxuryBike=new LuxuryBike(new SportsBike(new BasicBike()));
        luxuryBike.assembleBike();
    }
}
