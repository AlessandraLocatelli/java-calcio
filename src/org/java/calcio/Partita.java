package org.java.calcio;

import java.util.Random;

public class Partita {

    private Squadra squadraOspite;
    private Squadra squadraCasa;
    private Arbitro arbitro;

    public Partita(Squadra squadraOspite, Squadra squadraCasa, Arbitro arbitro) {
        this.squadraOspite = squadraOspite;
        this.squadraCasa = squadraCasa;
        this.arbitro = arbitro;
    }


    public Squadra getSquadraOspite() {
        return squadraOspite;
    }

    public Squadra getSquadraCasa() {
        return squadraCasa;
    }

   public Arbitro getArbitro()
   {
       return arbitro;
   }


   //metodo per iniziare partita
   public boolean iniziaPartita ()
   {
       System.out.println("Partita Iniziata");
       return true;

   }

   //metodo per concludere partita

    public boolean concludiPartita ()
    {
        System.out.println("Partita Terminata");
        return true;

    }




   //metodo per segnare goal
    public int segnaGoal(boolean iniziata) throws RuntimeException
    {
        int goalSegnati = 0;

        if(!iniziata)
        {
            throw new RuntimeException("non hai iniziato la partita, non puoi segnare dei goal!");
        }

        Random r = new Random();
        int squadraCheHaSegnato = r.nextInt(1,3);

        switch (squadraCheHaSegnato)
        {
            case 1:
                System.out.println("Ha segnato la squadra: "+squadraCasa);
                break;
            case 2:
                System.out.println("Ha segnato la squadra: "+squadraOspite);
                break;
            default:
                break;
        }


        goalSegnati++;

        return goalSegnati;

    }

    @Override
    public String toString() {
        return
                "Partita:\n" +
                        "Squadra Ospite: "+ squadraOspite +
                "\nSquadra Casa:" + squadraCasa +
                "\n" + arbitro
                ;
    }
}
