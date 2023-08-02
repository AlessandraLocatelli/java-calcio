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

    public void aggiungiGiocatore(Giocatore giocatore)
    {

        squadra.add(giocatore);
    }



    public List<Persona> getSquadra() {
        return squadra;
    }

}
