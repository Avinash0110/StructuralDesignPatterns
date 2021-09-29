package com.avinash.facade;

public class Order {

    private Food burger;
    private Food pizza;
    private Food biryani;

    public Order()
    {
        burger=new Burger();
        pizza=new Pizza();
        biryani=new Biryani();
    }

    public void orderBurger()
    {
        burger.order();
    }
    public void orderPizza()
    {
        pizza.order();
    }
    public void orderBiryani()
    {
        biryani.order();
    }
}
