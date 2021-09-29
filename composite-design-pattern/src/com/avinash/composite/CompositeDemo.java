package com.avinash.composite;

public class CompositeDemo {

    /*  assembling a computer

                         computer

              cabinet             peripheral

     hard drive    motherBoard       mouse    keyboard

                  cpu      ram
     */

    public static void main(String[] args) {

        //leaf components
        Component hardDrive=new Leaf(1000,"HDD");
        Component cpu=new Leaf(2000,"CPU");
        Component ram=new Leaf(6000,"RAM");
        Component mouse=new Leaf(100,"MOUSE");
        Component keyboard=new Leaf(500,"KEYBOARD");

        // composite components

        Composite peri=new Composite("Peri");
        Composite cabinet=new Composite("cabinet");
        Composite motherBoard=new Composite("mother board");
        Composite computer=new Composite("computer");

        motherBoard.addComponent(cpu);
        motherBoard.addComponent(ram);

        peri.addComponent(mouse);
        peri.addComponent(keyboard);

        cabinet.addComponent(hardDrive);
        cabinet.addComponent(motherBoard);

        computer.addComponent(peri);
        computer.addComponent(cabinet);

        //leaf price
        ram.showPrice();
        mouse.showPrice();

        //composite object price

         computer.showPrice();




    }
}
