package it.unicam.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Giocatore implements iGiocatore{

    List<Carta> mano = new ArrayList<>();

    public Giocatore() {
    }

    public List<Carta> getMano() {
        return mano;
    }

    public void setMano(List<Carta> mano) {
        this.mano = mano;
    }

    public void riceviCarta(Carta carta) {
        this.mano.add(carta);
    }

    @Override
    public void scartareCoppia() {
        // Count each card's occurrences in the hand
        Map<Integer, Long> cardCounts = this.mano.stream()
                .collect(Collectors.groupingBy(card -> card.getNumero(), Collectors.counting()));

        // todo scrivere un test per vedere che funziona
        // Build a new list excluding the cards with even counts
        mano = mano.stream()
                .filter(card -> cardCounts.get(card.getNumero()) % 2 != 0)
                .collect(Collectors.toList());
    }


    @Override
    public void pescareCarta(Giocatore playerWePickFrom) {
        Random random = new Random();
        List<Carta> mano = playerWePickFrom.getMano();
        int randomInt = random.nextInt(mano.size()-1);
        // todo controllare che funziona
        Carta carta = playerWePickFrom.getMano().get(randomInt);
        this.mano.add(carta);
    }



}
