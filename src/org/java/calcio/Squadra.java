package org.java.calcio;

import java.util.ArrayList;
import java.util.List;

public class Squadra {

    //CAMPI
     private List<Persona> squadra;

    //COSTRUTTORE

    public Squadra() {

        squadra = new ArrayList<>();


    }


    //METODI


    public List<Persona> getSquadra() {
        return squadra;
    }

}
