package org.java.calcio;

public class Allenatore extends Persona  {

    //CAMPI
    private String strategia;

    //COSTRUTTORE
    public Allenatore(String nome, int eta, String strategia) {
        super(nome, eta);
    }

    //METODI


    public String getStrategia() {
        return strategia;
    }

    @Override
    public String toString() {
        return  super.toString()+
                "strategia='" + strategia + '\'';
    }
}
