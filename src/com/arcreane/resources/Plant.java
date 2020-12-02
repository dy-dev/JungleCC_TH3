package com.arcreane.resources;

import com.arcreane.base.Coords;

public class Plant extends Resource{

    public void grow(){

    }

    @Override
    public void step() {
        System.out.println("Je suis une plante et je step");
    }
}
