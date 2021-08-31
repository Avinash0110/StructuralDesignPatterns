package com.avinash.adapterpattern;

public class AdapterDesignPattern {
    public static void main(String[] args) {


    Pencil pencil=new PencilAdapter();
    pencil.draw("drawing with pencil");


    DrawShapes drawShapes=new DrawShapes();
    drawShapes.setPencil(pencil);
    drawShapes.drawShapes("draw all shapes having 4 sides");

}
}
