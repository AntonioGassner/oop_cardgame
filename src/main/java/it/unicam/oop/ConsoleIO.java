package it.unicam.oop;

import java.util.List;
import java.util.Scanner;

public class ConsoleIO {

    Scanner scanner = new Scanner(System.in);

    public void messaggioInizioPartita() {
        System.out.println("Benvenuto nel gioco X");
    }

    public void messaggioFinePartita(String giocatoreCheVince) {
        System.out.printf("\nCongratulazioni %s! Hai vinto!", giocatoreCheVince);
    }

    public int selezionaMazzo() {
        System.out.println("Scegli un mazzo di gioco" +
                "\n1) Mazzo di Briscola " +
                "\n2) Mazzo di Poker"
        );
        int input = getIntInput(scanner);
        scanner.close();
        return input;
    }

    public void stampaMappa(int[][] mappa, List<Giocatore> giocatori){
        for (int i = 0; i < giocatori.size(); i++) {
//            Posizione posizione =  giocatori.get(i).getPosizione()
            // mappa[posizione.getX][posiosione.getY] = giallo
        }
        // print

        // rappresentazione come array -> mappa di enum/oggetti
        // giocatori/macchine -> posizione
    }

    // stampare le opzioni
    // prender in imput il numero della scelta


    // Method to get and validate integer input
    private int getIntInput(Scanner scanner) {
        while (true) {
            String input = scanner.nextLine();
            if (isValid(input)) {
                return Integer.parseInt(input);  // Return valid input
            } else {
                System.out.println("Input Invalido, perfavore inserire 1 o 2");
            }
        }
    }

    // Validation method
    private boolean isValid(String input) {
        try {
            int number = Integer.parseInt(input);
            return number >= 1 && number <= 2;
        } catch (NumberFormatException e) {
            return false;  // Input was not an integer
        }
    }


    // controlla che l'input sia del tipo giusto

    // messaggio di inizio partita

    // selezionare il mazzo

    // mostrare la mappa al giocatore all'inizio del suo turno
    // permettere al giocatore di scegliere la sua mossa

    // messaggio di fine partita

}
