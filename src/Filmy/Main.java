package Filmy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Film f1 = new Film("John Wick", 101, 5, 2015);

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Zadejte postupně: jméno filmu, délku v minutách, hodnocení a rok vydání.");
            String jmeno = sc.next();
            int delkaVminutach = sc.nextInt();
            int hodnoceni = sc.nextInt();
            int rokVydani = sc.nextInt();

            Film nactenyFilm = new Film(jmeno, delkaVminutach, hodnoceni, rokVydani);

            nactenyFilm.printInfo();
        }
    }
}
