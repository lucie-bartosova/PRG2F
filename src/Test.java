import java.util.Random;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Úkol 1 - darování krve
        System.out.println("Zadejte Váš věk.");
        int vek = sc.nextInt();

        if (vek >= 18 && vek <= 65) {
            System.out.println("Můžete darovat krev.");
        } else {
            System.out.println("Nemůžete darovat krev.");
        }


        // Úkol 2 - Karty
        int karta1 = random.nextInt(0, 13);
        int karta2 = random.nextInt(0, 13);


        if (karta1+karta2 == 21 || karta1+karta2 < 10) {
            System.out.println("Vyhrál jste! Vaše karty byly: první karta: "+karta1+" a druhá karta: "+karta2+" (Součet: "+(karta1+karta2)+")");
        } else {
            System.out.println("Bohužel jste prohrál :(");
        }


        // Úkol 3 - Gin
        System.out.println("Zadejte požadovaný počet lahví ginu.");
        int pocetLahvi = sc.nextInt();

        int plnaCena = 540;
        double sleva10 = plnaCena*0.90;
        double sleva20 = plnaCena*0.80;
        int prekupnik = 0;

        if (pocetLahvi <= 5) {
            System.out.println("Platíte: "+pocetLahvi*plnaCena);
        } else if (pocetLahvi <= 10) {
            System.out.println("Platíte: "+pocetLahvi*sleva10);
        } else if (pocetLahvi <= 50) {
            System.out.println("Platíte: "+pocetLahvi*sleva20);
        } else {
            System.out.println("Objednávka byla zamítnuta! Zjištěn pokus o překupnictví. Celková cena: "+prekupnik);
        }
    }
}
