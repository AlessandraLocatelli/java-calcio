package org.java.calcio;

import java.util.ArrayList;
import java.util.List;

public class Squadra {

    //CAMPI
     private List<Persona> squadra;
     String nomeSquadra;


    //COSTRUTTORE

    public Squadra(String nomeSquadra) {

        squadra = new ArrayList<>();
        this.nomeSquadra = nomeSquadra;

    }


    //METODI

    public void aggiungiGiocatore(Giocatore giocatore)
    {

        squadra.add(giocatore);
    }


    public void aggiungiAllenatore(Allenatore allenatore)
    {

        squadra.add(allenatore);
    }


    public List<Persona> getSquadra() {
        return squadra;
    }


    @Override
    public String toString() {
        return " " +nomeSquadra+ " "+ squadra;
    }
}


