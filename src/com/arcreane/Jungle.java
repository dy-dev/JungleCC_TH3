package com.arcreane;

import com.arcreane.base.Ecosystem;
import com.arcreane.base.Weather;

public class Jungle {

    public static void main(String[] args) {
        //Creation of ecosystem and weather variables
        Ecosystem ecosystem = Ecosystem.getInstance();
        //Weather needs to know where the rain is gonna fall => we pass the ecosystem as a parameter
        Weather weather = new Weather(ecosystem);

        //Define an algo or a condition to stop the loop
        //For instance :
        //          * There is no living creature left on the ecosystem
        //                  * No Prey => the predator will die of hunger
        //                  * No Predator => the prey will grow too much
        //          * There is too much water on the ground it is a flood
        //          * The is no water left
        //          *....
        while(ecosystem.getWaterSpot().m_iWaterQuantity > 0){
            System.out.println("***********************  Start Cycle **********************");
            ecosystem.step();
            weather.step();

            ecosystem.draw();

            try {
                Thread.sleep(250);
            } catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }

        System.out.println("Equilibrium has been shattered, the world is dying");

    }

}
