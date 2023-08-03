package org.java.calcio;

import java.time.LocalDate;

public class Allenatore extends Persona  {

    //CAMPI
    private String strategia;

    //COSTRUTTORE

    public Allenatore(String nome, LocalDate dataDiNascita, String strategia) {
        super(nome, dataDiNascita);
        this.strategia = strategia;
    }


    //METODI


    public String getStrategia() {
        return strategia;
    }

    @Override
    public String toString() {
        return  super.toString()+
                " strategia= " + strategia + '\'';
    }
}
