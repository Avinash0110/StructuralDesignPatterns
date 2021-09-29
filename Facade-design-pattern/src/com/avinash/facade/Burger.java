package com.avinash.facade;

public class Burger implements Food{
    @Override
    public void order() {
      System.out.println("Burger is ordered");
    }
}
