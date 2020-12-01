package com.arcreane;

public class Ecosystem {
    //Creation des tableaux de predateur, de proies, de plantes
    //et également création du plan d'eau
    private Predator[] m_PredatorArray;
    private Prey[] m_PreyArray;
    private Plant[] m_PlantArray;

    private WaterSpot m_WaterSpot;

    public WaterSpot getWaterSpot() {
        return m_WaterSpot;
    }

    private static Ecosystem s_Instance;
    public static Ecosystem getInstance(){
        if(s_Instance == null)
            s_Instance = new Ecosystem();
        return s_Instance;
    }


    private Ecosystem() {
        m_PredatorArray = new Predator[100];
        m_PreyArray = new Prey[100];
        m_PlantArray = new Plant[100];

        for (int i = 0; i < m_PredatorArray.length; i++) {
            m_PredatorArray[i] = new Predator();
        }
        for (int i = 0; i < m_PreyArray.length; i++) {
            m_PreyArray[i] = new Prey();
        }
        for (int i = 0; i < m_PlantArray.length; i++) {
            m_PlantArray[i] = new Plant();
        }

        m_WaterSpot = new WaterSpot();
    }

    public void step() {
        for (Predator pred : m_PredatorArray ) {
            pred.step();
        }
        for (Prey  prey : m_PreyArray ) {
            prey.step();
        }
        for (Plant plant : m_PlantArray ) {
            plant.step();
        }
        m_WaterSpot.step();
    }

    public void draw() {
    }

    public void raining(int rainQuantity) {
    }
}
