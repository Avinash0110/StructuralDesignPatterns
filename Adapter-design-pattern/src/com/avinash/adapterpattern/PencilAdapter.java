package com.avinash.adapterpattern;

import com.avinash.lidpencil.LidPencil;

public class PencilAdapter implements Pencil{

    LidPencil lidPencil=new LidPencil();

    @Override
    public void draw(String str) {
     lidPencil.mark(str);
    }
}
