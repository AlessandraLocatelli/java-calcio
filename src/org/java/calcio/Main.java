package org.java.calcio;
import java.time.LocalDate;
import java.util.*;

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
                    "Dario Verdi", "Fabrizio Mori", "Andrea Mangili", "Davide Gritti",
                    "Matteo Sancini","Luca Ghisalberti","Riccardo Marchion"

            };


    private static final String[] NOMI_ARBITRI =
            {
                    "Giovanni Mazzoleni", "Valerio Brini", "Paolo Ravati", "Marco Fabrelli",
                    "Giacomo Manzani", "Luca Raveschi", "Fausto Peretti"

            };


    private static final String[] RUOLI_GIOCATORI =
            {
                    "Portiere", "Attaccante", "Difensore", "Centrocampista"

            };

    private static final String[] TATTICHE_ALLENATORI =
            {
                    "Offensiva", "Difensiva "

            };


    public static void main(String[] args) {

        Squadra squadraCasa = new Squadra("Squadra 1");
        Squadra squadraOspite = new Squadra("Squadra 2");
        Random r = new Random();
        Scanner sc = new Scanner(System.in);


        //CREAZIONE SQUADRA CASA

        for (int i = 0; i < 11; i++) {

            String nomeRandom = NOMI_GIOCATORI[r.nextInt(0, NOMI_GIOCATORI.length)];
            LocalDate dataDiNascitaRandom = getDataDiNascitaRandom();
            String ruoloRandom = RUOLI_GIOCATORI[r.nextInt(0, RUOLI_GIOCATORI.length)];
            Giocatore giocatore = new Giocatore(nomeRandom, dataDiNascitaRandom, ruoloRandom);
            squadraCasa.aggiungiGiocatore(giocatore);
        }


        String nomeRandomAllenatore1 = NOMI_ALLENATORI[r.nextInt(0, NOMI_ALLENATORI.length)];
        LocalDate dataDiNascitaRandomAllenatore1 = getDataDiNascitaRandom();
        String tatticaRandomAllenatore1 = TATTICHE_ALLENATORI[r.nextInt(0, TATTICHE_ALLENATORI.length)];
        Allenatore allenatore1 = new Allenatore(nomeRandomAllenatore1, dataDiNascitaRandomAllenatore1, tatticaRandomAllenatore1);
        squadraCasa.aggiungiAllenatore(allenatore1);


        System.out.println("CREAZIONE SQUADRA CASA: ");
        System.out.println(squadraCasa.getSquadra());


        //CREAZIONE SQUADRA OSPITE

        for (int i = 0; i < 11; i++) {

            String nomeRandom = NOMI_GIOCATORI[r.nextInt(0, NOMI_GIOCATORI.length)];
            LocalDate dataDiNascitaRandom = getDataDiNascitaRandom();
            String ruoloRandom = RUOLI_GIOCATORI[r.nextInt(0, RUOLI_GIOCATORI.length)];
            Giocatore giocatore = new Giocatore(nomeRandom, dataDiNascitaRandom, ruoloRandom);
            squadraOspite.aggiungiGiocatore(giocatore);
        }


        String nomeRandomAllenatore2 = NOMI_ALLENATORI[r.nextInt(0, NOMI_ALLENATORI.length)];
        LocalDate dataDiNascitaRandomAllenatore2 = getDataDiNascitaRandom();
        String tatticaRandomAllenatore2 = TATTICHE_ALLENATORI[r.nextInt(0, TATTICHE_ALLENATORI.length)];
        Allenatore allenatore2 = new Allenatore(nomeRandomAllenatore2, dataDiNascitaRandomAllenatore2, tatticaRandomAllenatore2);
        squadraOspite.aggiungiAllenatore(allenatore2);


        System.out.println("CREAZIONE SQUADRA OSPITE: ");
        System.out.println(squadraOspite.getSquadra());

        //AGGIUNTA ARBITRO

        String nomeRandom = NOMI_ARBITRI[r.nextInt(0, NOMI_ARBITRI.length)];
        LocalDate dataDiNascitaRandom = getDataDiNascitaRandom();
        Arbitro arbitro = new Arbitro(nomeRandom, dataDiNascitaRandom);

        System.out.println("ARBITRO");
        System.out.println(arbitro);

        //CREAZIONE PARTITA
        Partita partita = new Partita(squadraOspite, squadraCasa, arbitro);
        System.out.println(partita);

        boolean partitaIniziata = false;
        int goals = 0;

        System.out.println("Vuoi iniziare la partita? (y/n)");
        String rispostaUtente = sc.nextLine();

        if (rispostaUtente.equalsIgnoreCase("y")) {
             partitaIniziata = true;
             partita.iniziaPartita();
        }

        try{
        goals += partita.segnaGoal(partitaIniziata);
        goals += partita.segnaGoal(partitaIniziata);
        goals += partita.segnaGoal(partitaIniziata);
        goals += partita.segnaGoal(partitaIniziata);
        System.out.println("Goals totali: "+goals);
        partita.concludiPartita();

        }
        catch(RuntimeException e)
        {

            System.out.println(e.getMessage());

        }






      sc.close();
    }


    private static LocalDate getDataDiNascitaRandom() {

        Random r = new Random();

        int year = r.nextInt(1980,2003);
        int month = 1;
        int day = 1;

        LocalDate bday = LocalDate.of(year,month,day);
        return bday.plusDays(r.nextInt(365));

    }





}
