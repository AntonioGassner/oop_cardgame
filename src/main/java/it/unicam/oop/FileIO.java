package it.unicam.oop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileIO {

    public List<String> leggiFile() {
        List<String> lines = new ArrayList<>();
        try {
            lines = Files.readAllLines(Paths.get("src/main/resources/listaCarteNelMazzo.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public List<Carta> interpretaFile(List<String> lines){
        List<Carta> carte = new ArrayList<>();
        for(String riga : lines){
            carte.add(parser(riga));
        }
        return carte;
    }

    public Carta parser(String riga){
        char seme = riga.charAt(0);
        char numero = riga.charAt(1);
        int numeroInt = numero - '0';

        Carta carta = new Carta(charToSeme(seme), numeroInt);
        return carta;
    }

    public String charToSeme(char seme) {
        switch (seme) {
            case 'b':
                return "Bastoni";
            case 'c':
                return "Coppe";
            case 'd':
                return "Danari";
            case 's':
                return "Spade";
            default:
                return "Invalid card type";

        }

    }
}
