
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

public class LionTest {

    Feline feline;

    @Before
    public void setUp() {
        feline = Mockito.mock(Feline.class);
    }

    @Test
    public void testDoesHaveManeForMale() throws Exception {
        Lion lion = new Lion("Самец", feline);
        assertTrue(lion.doesHaveMane());
    }

    @Test
    public void testDoesHaveManeForFemale() throws Exception {
        Lion lion = new Lion("Самка", feline);
        assertFalse(lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testInvalidLionSexThrowsException() throws Exception {
        new Lion("Invalid", feline);
    }

    @Test
    public void testGetKittens() throws Exception {
        when(feline.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", feline);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы"));
        Lion lion = new Lion("Самец", feline);
        assertEquals(List.of("Животные", "Птицы"), lion.getFood());
    }
}
