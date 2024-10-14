
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class AnimalTest {

    private String animalKind;
    private List<String> expectedFood;
    private String expectedExceptionMessage;

    public AnimalTest(String animalKind, List<String> expectedFood, String expectedExceptionMessage) {
        this.animalKind = animalKind;
        this.expectedFood = expectedFood;
        this.expectedExceptionMessage = expectedExceptionMessage;
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        animal.getFamily();
        assertTrue(animal.getFamily().contains("кошачьи"));
    }

    @Test
    public void testGetFood() throws Exception {
        Animal animal = new Animal();

        if (expectedExceptionMessage != null) {
            Exception exception = assertThrows(Exception.class, () -> {
                animal.getFood(animalKind);
            });
            assertEquals(expectedExceptionMessage, exception.getMessage());
        } else {
            List<String> food = animal.getFood(animalKind);
            assertEquals(expectedFood, food);
        }
    }

    @Parameterized.Parameters
    public static List<Object[]> testData() {
        return Arrays.asList(new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения"), null},
                {"Хищник", List.of("Животные", "Птицы", "Рыба"), null},
                {"Паразиты", null, "Неизвестный вид животного, используйте значение Травоядное или Хищник"}
        });
    }



}
