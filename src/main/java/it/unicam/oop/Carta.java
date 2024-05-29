package it.unicam.oop;

public class Carta {

    private String seme;

    private int numero;

    public Carta(String seme, int numero) {
        this.seme = seme;
        this.numero = numero;
    }

    public String getSeme() {
        return seme;
    }

    public void setSeme(String seme) {
        this.seme = seme;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
