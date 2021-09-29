package com.avinash.facade;

public class Pizza implements Food{

    @Override
    public void order() {
        System.out.println("Pizza is ordered");
    }
}
