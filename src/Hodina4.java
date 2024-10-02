import java.util.Random;
import java.util.Scanner;

public class Hodina4 {
    public static void main(String[] args) {
        //1. úkol
        Random rng = new Random();
        int promenna = rng.nextInt(101);
        //int delitel = 5;

        if (promenna%5==0) {
            System.out.println("Číslo "+promenna+" jde vydělit 5.");
        } else {
            System.out.println("Číslo "+promenna+" nelze vydělit 5.");
        }

        // Inline if statement
        //System.out.println("Číslo "+promenna+(promenna%delitel==0?" je dělitelné ":" není dělitelné ")+delitel+".");

        //--------------------------------------------------------------

        //2. úkol - Kostky
        int kostkaPrvni = rng.nextInt(1,7);
        int kostkaDruha = rng.nextInt(1,7);

        if (kostkaPrvni+kostkaDruha>=10) {
            System.out.println("Vyhrál jsi! Hodil jsi "+kostkaPrvni+" a "+kostkaDruha);
        } else if (kostkaPrvni==kostkaDruha) {
            System.out.println("Vyhrál jsi! Hodil jsi dvě stejná čísla! ("+kostkaPrvni+")");
        } else {
            System.out.println("Neumíš házet, zkus to znovu. :(");
        }

        //--------------------------------------------------------------

        //3. úkol - Interval
        Scanner sc = new Scanner(System.in);
        System.out.println("Napište nějaké číslo");
        int cislo = sc.nextInt();

        if (cislo==0) {
            System.out.println("Vaše číslo nesmí být 0!!!");
        } else if (cislo <100 && cislo>-100) {
            System.out.println("Vaše číslo spadá do intervalu (-100;100)");
        } else {
            System.out.println("Vaše číslo nespadá do zadaného intervalu (-100;100)");
        }

    }

    /* Pro více proměnných se stejným příkazem (k int kostkaPrvni = kostka(7))
    public static int kostka(int i) {
        Random rng = new Random();
        return rng.nextInt(1,i+1);
    }
    */
}
