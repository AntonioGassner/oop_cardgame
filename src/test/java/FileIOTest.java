import it.unicam.oop.Carta;
import it.unicam.oop.FileIO;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileIOTest {

    @Test
    public void charToSemeTest(){
        FileIO ioManager = new FileIO();
        char seme = 'c';
        String output = ioManager.charToSeme(seme);
        assertEquals("Coppe", output);
        System.out.println(output);
    }

    @Test
    public void parserTest() {
        FileIO ioManager = new FileIO();
        String stringa = "b1";
        Carta card = ioManager.parser(stringa);
        Carta carta = new Carta("Bastoni", 1);
        assertEquals(carta.getSeme(), card.getSeme());
        assertEquals(carta.getNumero(), card.getNumero());
    }
    }
