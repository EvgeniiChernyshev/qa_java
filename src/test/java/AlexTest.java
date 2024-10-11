import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexTest {

    @Test
    public void testGetKittens() throws Exception {
        Alex alex = new Alex();
        System.out.println(alex.getKittens());
    }

    @Test
    public void testSexAlex() throws Exception {
        Alex alex = new Alex();
        assertTrue(alex.hasMane);
    }

    @Test
    public void testGetFriends() throws Exception {
        Alex alex = new Alex();
        assertEquals(List.of("Марти", "Глория" , "Мелман"), alex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        Alex alex = new Alex();
        assertEquals("Нью-Йоркский зоопарк", alex.getPlaceOfLiving());
    }

}
