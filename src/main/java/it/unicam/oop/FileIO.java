package it.unicam.oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileIO {

    public void leggiFile(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/main/resources/listaCarteNelMazzo.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void interpretaFile(List<String> lines){
        for(String riga : lines){
            parser(riga);
        }
    }

    public Carta parser(String riga){

        char ch = riga.charAt(0);
        char seme = riga.charAt(0);
        char numero = riga.charAt(1);
        int numeroInt = numero - '0';

        Carta carta = new Carta(charToSeme(seme), numeroInt);
        return carta;
    }

    public String charToSeme(char seme) {
        switch (seme) {
            case 1:
                return "Ace";    // In Briscola, '1' is typically the Ace
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            default:
                return "Invalid card number"; // Default case for numbers outside 1-10

        }

    }
}
