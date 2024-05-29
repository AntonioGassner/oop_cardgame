import it.unicam.oop.Carta;
import it.unicam.oop.Mazzo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MazzoTest {

    @Test
    void testMischiareMazzo() {
        List<Carta> cartaList = new ArrayList<Carta>();
        Carta carta = new Carta("Coppe", 1);
        cartaList.add(carta);
        Mazzo mazzo = new Mazzo(cartaList);


        assertEquals(1, cartaList.size(), "Optional message if the test fails");
//        assertEquals(2, cartaList.size(), "Optional message if the test fails");
        assertSame(carta, cartaList.get(0), "Carta creata é uguale a carta nel mazzo");
    }
}
