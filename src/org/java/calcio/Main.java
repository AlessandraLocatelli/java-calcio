package org.java.calcio;

import java.util.Arrays;
import java.util.Random;

public class Main {


    private static final String[] NOMI_GIOCATORI =
    {



    };


    public static void main(String[] args) {

        Random r = new Random();
        System.out.println(Arrays.toString(NOMI_GIOCATORI));
        int indiceRandom = r.nextInt(0, NOMI_GIOCATORI.length);

        String giocatore11 = (NOMI_GIOCATORI[indiceRandom]);
        System.out.println(giocatore11);





    }




}
