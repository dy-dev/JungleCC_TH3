package com.arcreane.animal;

import com.arcreane.base.Coords;
import com.arcreane.base.Ecosystem;
import com.arcreane.resources.WaterSpot;

public class Prey extends Animal{
    private int m_iWaterToDrink;

    public Prey() {
        super(new Coords());
        System.out.println("Je suis une proie");
        m_iWaterToDrink = 1;
    }

    public Coords getCoords() {
        return m_Coords;
    }

    public void setCoords(Coords p_Coords) {
        m_Coords = p_Coords;
    }

    @Override
    public void step() {
        super.step();
        System.out.println("Je suis une proie et je fais mon step");
    }

}
