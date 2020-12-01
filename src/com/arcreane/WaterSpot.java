package com.arcreane;

public class WaterSpot {
    public int m_iWaterQuantity;

    public WaterSpot() {
        m_iWaterQuantity = 500;
    }

    public void step() {
        System.out.println("Water quantity : " + m_iWaterQuantity);
    }
}
