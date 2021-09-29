package com.avinash.facade;

public class FacadeDemo {
    public static void main(String[] args) {


        Order order = new Order();

        order.orderBurger();
        order.orderBiryani();
        order.orderPizza();
    }
}
