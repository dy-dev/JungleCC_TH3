package com.arcreane.base;

public class Weather {
    //Member variable to know where to rain
    Ecosystem m_Ecosystem;

    public Weather(Ecosystem p_Ecosystem) {
        m_Ecosystem = p_Ecosystem;
    }

    public void rain(){
        //Algo to evaluate if it rains and how much water fall
        //....

        int rainQuantity = 100;
        m_Ecosystem.raining(rainQuantity);
        m_Ecosystem.raining(0, 10);
    }

    public void step() {
    }
}
