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

    public String toString(int n){
        switch (n) {
            case 1: return "Ace";    // In Briscola, '1' is typically the Ace
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Jack";   // Jack, traditionally a face card
            case 9: return "Knight"; // Knight, another face card
            case 10: return "King";  // King, usually the highest face card
            default: return "Invalid card number"; // Default case for numbers outside 1-10
        }

    }
}
