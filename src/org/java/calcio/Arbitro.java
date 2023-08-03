package org.java.calcio;

import java.time.LocalDate;

public class Arbitro extends Persona {

    private String ruolo;


    public Arbitro(String nome, LocalDate dataDiNascita) {
        super(nome, dataDiNascita);
        ruolo = "Arbitro Principale";
    }

    @Override
    public String toString() {
        return "Arbitro "+ super.toString()+
                " ruolo= " + ruolo + '\'';
    }
}
