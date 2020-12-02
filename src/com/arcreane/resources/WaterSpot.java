package com.arcreane.resources;

public class WaterSpot extends Resource {
    public int m_iWaterQuantity;

    public WaterSpot() {
        m_iWaterQuantity = 500;
    }

    @Override
    public void step() {
        System.out.println("Water quantity : " + m_iWaterQuantity);
    }
}
