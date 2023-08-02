package org.java.calcio;

public class Persona {

    //CAMPI
    private String nome;
    private int eta;

    //COSTRUTTORE

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }


    //METODI


    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }

    @Override
    public String toString() {
        return  " nome= " + nome + '\'' +
                ", età= " + eta+ " anni";
    }
}
