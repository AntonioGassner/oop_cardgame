package it.unicam.oop;

import java.util.ArrayList;
import java.util.List;

public class PartitaController implements iPartitaController{
    // tiene in memoria i giocatori
    // tiene in memoria le mani
    // chi crea i giocatori?

    // pescare carte dalla mano dell'avversario -> classe giocatore
    // scartare coppie -> classe giocatore

    // gestisce la partita
    // iniziare a giocare
    // logica che determina la vittoria
    // implementare le regole del gioco
    // gestione dei turni


    public PartitaController(List<Giocatore> giocatoreList) {
        this.giocatoreList = giocatoreList;
    }

    private List<Giocatore> giocatoreList;

    boolean gameRunning = true;


    @Override
    public void startGame() {


        // determina il giocatore attivo
        // controlliamo di continuo se un giocatore vince o perder
        // giochiamo finche la condizione sopra non e soddisfatta

        // todo scartare tutte le coppie che hai in mano prima di iniziare a giocare
        //  -> giocare significa inizare pescano prima e scartando poi

        while(gameRunning){
            for (int i = 0; i < giocatoreList.size(); i++) {
                giocaTurno(i);
                checkSconfitta(i);
                if(!gameRunning){
                    break;
                }
            }
        }
        // eventuali post-game

    }

    public void giocaTurno(int i){
        Giocatore giocatoreAttivo = giocatoreList.get(i);
        Giocatore giocatorePassivo = giocatoreList.get((i+1)%giocatoreList.size());

        giocatoreAttivo.pescareCarta(giocatorePassivo);
        giocatoreAttivo.scartareCoppia();

    }

    public void checkSconfitta(int i){
        Giocatore giocatoreAttivo = giocatoreList.get(i);
        if(giocatoreAttivo.getMano().size() == 1){
            Carta carta = giocatoreAttivo.getMano().get(0);
            // todo impostare una carta (oggetto) che determina la sconfitta, in modo che qua sotto possiamo fare un equals

            if(carta.getNumero() == 1 && carta.getSeme().equals("Bastoni")){
             gameRunning = false;
             // notificare che la partita finisce, ed e stata persa dal giocatore in posizione <i>
            }
        }
    }


}
