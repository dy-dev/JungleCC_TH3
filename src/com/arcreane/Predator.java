package com.arcreane;

public class Predator {
    private static int s_iAgeMaxPredator;

    private int m_iAge;
    private int m_iSpeed;
    private int m_iVigor;

    private int m_iWaterToDrink;

    private Smelling m_Smelling;
    private Vision m_Vision;
    private Coords m_Coords;

    public Predator(){
        m_iWaterToDrink = 1;
    }

    public Predator(Coords p_Coords){
        m_Coords = p_Coords;
        hunt(); // <=> this.hunt();
    }

    public int getAge() {
        return m_iAge;
    }

    public void setAge(int p_iAge) {
        m_iAge = p_iAge;
    }

    public int getSpeed() {
        return m_iSpeed;
    }

    public void setSpeed(int p_iSpeed) {
        m_iSpeed = p_iSpeed;
    }

    public int getVigor() {
        return m_iVigor;
    }

    public void setVigor(int p_iVigor) {
        m_iVigor = p_iVigor;
    }

    public Coords getCoords() {
        return m_Coords;
    }

    public void setCoords(Coords p_Coords) {
        m_Coords = p_Coords;
    }


    public void hunt(){
    }

    public void drink(){
        WaterSpot waterSpot = Ecosystem.getInstance().getWaterSpot();
        waterSpot.m_iWaterQuantity -= m_iWaterToDrink;
    }

    public void step() {
        drink();
    }
}
