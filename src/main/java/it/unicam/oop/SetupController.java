package it.unicam.oop;

import java.util.ArrayList;
import java.util.List;

public class SetupController {

    private FileIO fileIO = new FileIO();

    private Mazzo mazzo = new Mazzo();

    int numeroGiocatori = 2;

    public List<Giocatore> inizializzaSetup(){
        // todo ottenere il numero giocatori dal player
        //  sarebbe appropriato avere questo metodo dentro
        //  a una classe utils o Input/Output che interagisce con il Player
        // int mazzoScelto = consoleIO.selezionaMazzo();
        inizializzaMazzo();
        return inizializzaGiocatori(numeroGiocatori);
    }

    private void inizializzaMazzo() {
        List<String> linesList = fileIO.leggiFile();
        List<Carta> mazzoList = fileIO.interpretaFile(linesList);
        mazzo.setListMazzo(mazzoList);
        mazzo.mischiareMazzo();
        // todo togliere la carta gia a setup

    }

    private List<Giocatore> inizializzaGiocatori(int n) {
        List<Giocatore> giocatoreList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Giocatore giocatore = new Giocatore();
            giocatoreList.add(giocatore);
        }
        inizializzaMani(giocatoreList);
        return giocatoreList;
    }

    private void inizializzaMani(List<Giocatore> giocatoreList) {
        // cicliamo le carte nel mazzo finche non finiscono
        int i = 0;
        int j = 0;
        while (i < mazzo.getListMazzo().size()) {
            Giocatore giocatore = giocatoreList.get(j);
            giocatore.riceviCarta(mazzo.getCartaAtIndex(i));
            i++;
            j = (j + 1) % giocatoreList.size();
        }
    }
}
