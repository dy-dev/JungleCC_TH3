package com.arcreane.animal;

import com.arcreane.animal.senses.Vision;
import com.arcreane.base.Coords;
import com.arcreane.base.Ecosystem;
import com.arcreane.base.JungleObject;
import com.arcreane.resources.WaterSpot;

public class Animal extends JungleObject {
    protected int m_iAge;
    protected int m_iSpeed;
    protected int m_iVigor;

    protected int m_iWaterToDrink;

    protected Vision m_Vision;

    Animal(Coords p_Coords){
        System.out.println("Je suis un animal");
        m_Coords = p_Coords;
    }

     Animal(Vision v){

    }

    protected void drink(){
        WaterSpot waterSpot = Ecosystem.getInstance().getWaterSpot();
        waterSpot.m_iWaterQuantity -= m_iWaterToDrink;
        System.out.println("Je suis un animal et je bois");
    }
}
