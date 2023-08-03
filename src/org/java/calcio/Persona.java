package org.java.calcio;


import java.time.LocalDate;
import java.time.Period;

public class Persona {

    //CAMPI
    private String nome;
    private LocalDate dataDiNascita;

    private int eta;


    //COSTRUTTORE

    public Persona(String nome, LocalDate dataDiNascita) {
        this.nome = nome;
        this.dataDiNascita = dataDiNascita;
        eta = getEta();
    }


    //METODI


    public String getNome() {
        return nome;
    }


    public int getEta()
    {
        Period eta = Period.between(dataDiNascita,LocalDate.now());




        return eta.getYears();
    }





    @Override
    public String toString() {
        return  " nome= " + nome + '\'' +
                "data di nascita= "+dataDiNascita+
                ", età= " + eta+ " anni";
    }
}
