import java.util.Random;

public class Leden_Metody_Úvod {

    static int hodKostky() {


        Random randomGenerator = new Random();
        int hodKostkou = randomGenerator.nextInt(1,7);
        System.out.println("Hod: " + hodKostkou);

        return hodKostkou; //Když chceme return, změníme void na int/boolean/...
    }
    static void pozdrav() {

        System.out.println("Zadejte číslo ");

    }

    public static void main(String[] args) {

        // Metoda hodKostky

        int vysledek1 = hodKostky(); //Pro uložení hodnoty ji dáme do proměnné stejného datového typu
        int vysledek2 = hodKostky();
        int vysledek3 = hodKostky();

        System.out.println(vysledek1 + vysledek2 + vysledek3);

        // Metoda pozdrav

        pozdrav();
    }
}