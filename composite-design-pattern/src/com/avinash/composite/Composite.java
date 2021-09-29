package com.avinash.composite;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component{

    private String name;

    List<Component> componentList= new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addComponent(Component component)
    {
        componentList.add(component);
    }

    @Override
    public void showPrice() {
     System.out.println(name);

     for(Component c:componentList)
     {
         c.showPrice();
     }
    }
}
