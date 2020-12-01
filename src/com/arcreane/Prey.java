package com.arcreane;

public class Prey {
    private Coords m_Coords;
    private int m_iWaterToDrink;

    public Prey() {
        m_iWaterToDrink = 1;
    }

    public void step() {
        drink();
    }

    private void drink() {
        WaterSpot waterSpot = Ecosystem.getInstance().getWaterSpot();
        waterSpot.m_iWaterQuantity -= m_iWaterToDrink;
    }
}
