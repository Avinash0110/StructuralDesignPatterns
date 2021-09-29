package com.avinash.adapterpattern;

public class DrawShapes {

    private Pencil pencil;

    public Pencil getPencil() {
        return pencil;
    }

    public void setPencil(Pencil pencil) {
        this.pencil = pencil;
    }

    public void drawShapes(String str){
     pencil.draw(str);
    }
}
