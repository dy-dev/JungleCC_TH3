package com.arcreane.base;

import com.arcreane.animal.Animal;
import com.arcreane.animal.Predator;
import com.arcreane.animal.Prey;
import com.arcreane.resources.Plant;
import com.arcreane.resources.WaterSpot;

public class Ecosystem {
    //Creation des tableaux de predateur, de proies, de plantes
    //et également création du plan d'eau
    //private Predator[] m_PredatorArray;
    //private Prey[] m_PreyArray;
    private JungleObject[] m_JungleObjectArray;

    public WaterSpot getWaterSpot() {
        return (WaterSpot)m_JungleObjectArray[0];
    }

    private static Ecosystem s_Instance;

    public static Ecosystem getInstance() {
        if (s_Instance == null)
            s_Instance = new Ecosystem();
        return s_Instance;
    }


    private Ecosystem() {
        m_JungleObjectArray = new JungleObject[301];
        m_JungleObjectArray[0] = new WaterSpot();

        for (int i = 1; i < m_JungleObjectArray.length - 2; i += 3) {
            m_JungleObjectArray[i] = new Predator();
            m_JungleObjectArray[i + 1] = new Prey();
            m_JungleObjectArray[i + 2] = new Plant();
        }
    }

    public void step() {
        for (JungleObject obj : m_JungleObjectArray) {
            obj.step();
        }
    }

    public void draw() {
        for (JungleObject obj : m_JungleObjectArray) {
            obj.draw();
        }
    }

    public void raining(int rainQuantity) {
        System.out.println("Plouf");
    }

    public void raining(int startTime, int EndTime) {
        //pour gérer le fait qu'il puisse pleuvoir pendant plusieur cycle
        System.out.println("Il pleut depuis des jours");
    }
}
