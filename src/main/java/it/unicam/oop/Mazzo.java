package it.unicam.oop;

import java.util.ArrayList;
import java.util.List;

public class Mazzo implements iMazzo{

    //todo gestire la creazione delle singole carte e l'inserimento delle carte nella listMazzo

    private List<Carta> listMazzo = new ArrayList<>();

    public Mazzo(List<Carta> listMazzo) {
        this.listMazzo = listMazzo;
    }

    public List<Carta> getListMazzo() {
        return listMazzo;
    }

    public void setListMazzo(List<Carta> listMazzo) {
        this.listMazzo = listMazzo;
    }

    @Override
    public void sceltaMazzo() {
        //todo gestire i/o da file per caricare la lista delle carte contenute nel mazzo
    }

    /**
     * Metodo che mischia il mazzo
     */
    @Override
    public void mischiareMazzo() {

    }
}
