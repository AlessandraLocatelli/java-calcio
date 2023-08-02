package org.java.calcio;
import java.util.Arrays;
import java.util.Random;

public class Main {


    private static final String[] NOMI_GIOCATORI =
            {
                    "Matteo Bianchi", "Alessandro Rossi", "Marco Esposito", "Luca Conti",
                    "Federico Martini", "Davide Romano", "Giorgio Ferri", "Giovanni Russo",
                    "Andrea  Ricci", "Stefano Cattaneo", "Nicola Ferri", "Marco Colombo",
                    "Alessio Barbieri", "Lorenzo Ferrari", "Matteo Russo", "Davide Romano",
                    "Luca De Santis", "Andrea Marini", "Giordano Bordi", "Fabio Fontana",
                    "Riccardo Moretti", "Giulio Venturi", "Filippo Rota", "Tommaso Ricci",
                    "Matteo Marchetti", "Simone Giuliani", "Edoardo Rinaldi", "Luca Trevisan",
                    "Francesco Caruso", "Alberto Rossetti", "Fabio Fabbrica", "Stefano Ferri",
                    "Martino Villa", "Luca Santoro", "Nicola D'Angelo", "Roberto Angelis",
                    "Daniele Sartori", "Pietro Romani"
            };

    private static final String[] NOMI_ALLENATORI =
            {
                    "Giuseppe Marconi", "Federico Bonelli", "Mattia Falconi",
                    "Dario Verdi","Fabrizio Mori","Andrea Mangili","Davide Gritti",
                    "Matteo Sancini"

            };


    private static final String[] RUOLI_GIOCATORI =
            {
                 "Portiere","Attaccante","Difensore","Centrocampista"

            };

    private static final String[] TATTICHE_ALLENATORI =
            {
                    "Offensiva","Difensiva "

            };



    public static void main(String[] args) {


        Squadra squadra = new Squadra();
        Random r = new Random();



        for(int i = 0; i < 11; i++){


            String nomeRandom = NOMI_GIOCATORI[r.nextInt(0, NOMI_GIOCATORI.length)];
            int etaRandom = r.nextInt(18, 30);
            String ruoloRandom = RUOLI_GIOCATORI[r.nextInt(0, RUOLI_GIOCATORI.length)];
            Giocatore giocatore = new Giocatore(nomeRandom, etaRandom, ruoloRandom);
            squadra.aggiungiGiocatore(giocatore);
        }


            String nomeRandom = NOMI_ALLENATORI[r.nextInt(0, NOMI_ALLENATORI.length)];
            int etaRandom = r.nextInt(35,46);
            String tatticaRandom = TATTICHE_ALLENATORI[r.nextInt(0, TATTICHE_ALLENATORI.length)];
            Allenatore allenatore = new Allenatore(nomeRandom,etaRandom,tatticaRandom);
            squadra.aggiungiAllenatore(allenatore);

        System.out.println("CREAZIONE SQUADRA: ");
        System.out.println(squadra.getSquadra());







    }





}
