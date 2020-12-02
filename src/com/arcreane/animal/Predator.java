package com.arcreane.animal;

import com.arcreane.animal.senses.Smelling;
import com.arcreane.base.Coords;
import com.arcreane.base.Ecosystem;

public class Predator extends Animal {
    private static int s_iAgeMaxPredator;


    private Smelling m_Smelling;

    public Predator() {
        super(new Coords());
        System.out.println("Je suis un prédateur");
        m_iWaterToDrink = 1;
        m_Smelling = new Smelling();
    }

    public Predator(Coords p_Coords) {
        super(p_Coords);
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


    public void hunt() {
//        Prey toHunt = null;
//        //demander au terrain la liste des proies
//        Prey[] preys = Ecosystem.getInstance().getPreys();
//        //passer à son odorat chaque proie pour tester si elle est accessible
//        for (Prey prey : preys) {
//            if (m_Smelling.checkIfHuntable(m_Coords, prey)) {
//                toHunt = prey;
//                break;
//            }
//        }
        /*if(toHunt != null)
         */
        //Si son odorat determine qu'une proie est acessible
        //Il se met en déplacment vers cette proie en mode
        //  * chasse rapide si il est loin
        //  * furtif si il est pret
    }


    @Override
    public void step() {
        System.out.println("Je suis un prédateur et je step");
        //Algorithm qui détermine
        //  * Est ce que je chasse
        //  * Est ce que je bois
        //  * Est ce que je déambule
        //  ...
        //drink();
        //super.drink();
        //hunt();
    }

}
