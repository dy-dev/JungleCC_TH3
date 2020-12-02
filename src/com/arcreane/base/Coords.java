package com.arcreane.base;

public class Coords {

    int m_iX;
    int m_iY;

    public Coords(){

    }


    public Coords(int p_iX, int p_iY){
        m_iX = p_iX;
        m_iY = p_iY;
    }

    public static double getDistances(Coords p_Coords1, Coords p_Coords2){
        return Math.sqrt( Math.pow(p_Coords2.m_iX - p_Coords1.m_iX , 2) +
                          Math.pow(p_Coords2.m_iY - p_Coords1.m_iY , 2)  );
    }

    public double getDistance(Coords p_Coords){
        return Math.sqrt( Math.pow(m_iX - p_Coords.m_iX , 2) +
                Math.pow(m_iY - p_Coords.m_iY , 2)  );
    }
}
