package org.java.calcio;

import java.time.LocalDate;

public class Giocatore extends Persona {

    //CAMPI
    private String ruolo;

    //COSTRUTTORI

    public Giocatore(String nome, LocalDate dataDiNascita, String ruolo) {
        super(nome, dataDiNascita);
        this.ruolo = ruolo;
    }


    //METODI


    public String getRuolo() {
        return ruolo;
    }

    @Override
    public String toString() {
        return  "Giocatore:"+super.toString()+
                " ruolo= " + ruolo + '\'';
    }
}
