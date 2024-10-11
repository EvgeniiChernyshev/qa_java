import java.util.List;

public class Alex extends Lion{
    private Feline feline;

    public Alex() throws Exception {
        super("Самец", new Feline());

    }
    public List<String> getFriends() {
        return List.of("Марти", "Глория" , "Мелман");
    }

    public String getPlaceOfLiving() {
        return "Нью-Йоркский зоопарк";
    }


    public int getKittens() {
        return 0;
    }
}
