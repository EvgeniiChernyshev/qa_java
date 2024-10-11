
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FelineTest {

    @Test
    public void testGetKittensReturnsDefaultCount() {
        Feline feline = new Feline();
        int result = feline.getKittens();
        assertEquals(1, result);
    }

    @Test
    public void testGetKittensReturnsProvidedCount() {
        Feline feline = new Feline();
        int result = feline.getKittens(3);
        assertEquals(3, result);
    }

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test
    public void testgetFamily() {
        Feline feline = new Feline();
        assertTrue(feline.getFamily().equals("Кошачьи"));

    }
}
