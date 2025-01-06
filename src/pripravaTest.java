import java.util.Random;

public class pripravaTest {

    public static void main(String[] args) {

        Random random = new Random();
        int kostka = random.nextInt(1, 7);
        System.out.println(kostka);
    }
}
