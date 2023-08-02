package org.java.calcio;

public class Giocatore extends Persona {

    //CAMPI
    private String ruolo;

    //COSTRUTTORI
    public Giocatore(String nome, int eta, String ruolo) {
        super(nome, eta);
        this.ruolo = ruolo;
    }

    //METODI
    public String getRuolo() {
        return ruolo;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "ruolo='" + ruolo + '\'';
    }
}
