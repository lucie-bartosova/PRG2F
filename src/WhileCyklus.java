import java.util.Random;
import java.util.Scanner;

public class WhileCyklus {
    public static void main(String[] args) {
        /*
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++; //Přičtení 1 k proměnné
        }


        // Do-while - minimálně jednou se akce provede a kontroluje while (Házej kostkou dokud...)
        Random kostka = new Random();
        int cislo;
        System.out.println("Házej, dokud nebude číslo větší než 2");
        do {
            cislo = kostka.nextInt(0,7);
            System.out.println("hodil jsi "+cislo);
        } while (cislo < 2);


        // Zadání od uživatele
        Scanner sc = new Scanner(System.in);
        int number;
        do {
            System.out.println("Zadej číslo větší než 0:");
            number = sc.nextInt();

        } while (number <= 0);
        */


        // Úkol 1 - Sudé čísla 0-1000
        int cislicka = 0;
        while(cislicka <= 1998) {
            cislicka+=2;
            System.out.println(cislicka);
        }


        // Úkol 2 - hod kosktou
        Random kostka = new Random();
        int cislo;
        System.out.println("Házej, dokud nebude číslo 6");
        do {
            cislo = kostka.nextInt(1,7);
            System.out.println("hodil jsi "+cislo);
        } while (cislo != 6);
    }
}
