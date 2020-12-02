package com.arcreane.animal.senses;

import com.arcreane.base.Coords;
import com.arcreane.animal.Prey;

public class Smelling extends Sense  {
    public boolean checkIfHuntable(Coords m_coords, Prey prey) {
        //Tester à l'aide d'une méthode static sur coordonnées
        //si la m_coords et les coords de prey sont assez proches pour
        //que le predateur se mette en chasse
        //=> nécessite de définir une variable dans smelling de distance de chasse
        //=> necessite également de définir une méthode getCoords dans la classe prey


        //double d = Coords.getDistances(m_coords , prey.getCoords());
        double d = m_coords.getDistance(prey.getCoords());


        //Si la proie se trouve à moins de 100 unités (chiffre pris complètement au hasard)
        //On dit qu'on est capable de le sentir et donc de le chasser
        if( d < 100)
            return true;
        return false;
    }
}
