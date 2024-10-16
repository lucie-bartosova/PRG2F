import java.util.Random;
import java.util.Scanner;

public class WhileCyklus {
    public static void main(String[] args) {
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


        // Úkol 1 - Sudé čísla 0-1000
        int cislicka = 0;
        while(cislicka <= 1998) {
            cislicka+=2;
            System.out.println(cislicka);
        }


        // Úkol 2 - hod kosktou
        Random kostka2 = new Random();
        int cislo2;
        System.out.println("Házej, dokud nebude číslo 6");
        do {
            cislo2 = kostka2.nextInt(1,7);
            System.out.println("hodil jsi "+cislo2);
        } while (cislo2 != 6);



        // CV - lower/higher
        Random random = new Random();
        int vygenerovaneCislo = random.nextInt(0, 101); //dolní to generuje, horní ne)
        int tipUzivatele;
        do {
            System.out.println("Zadejte Váš tip (číslo je v intervalu 0-100)"); //Psaní do stejné řádky: System.out.print("Zadejte Váš tip (číslo je v intervalu 0-100): ");
            tipUzivatele = sc.nextInt();

            if (tipUzivatele == vygenerovaneCislo) {
                System.out.println("Trefa!!");
            } else if (tipUzivatele > vygenerovaneCislo) {
                System.out.println("Váš tip je moc vysoký.");
            } else {
                System.out.println("Váš tip je moc nízký.");
            }

        } while (tipUzivatele != vygenerovaneCislo); //while(true) - cyklus půjde do nekonečna a zastaví se tam, kde bude break; (například pokud bude tip správný)

        //ukoly - soucet


        int userCislo;
        int soucet = 0;
        do {
            System.out.print("Zadejte číslo: ");
            userCislo = sc.nextInt();
            soucet += userCislo; // = soucet = userCislo + soucet;

        } while (userCislo != 0);

        System.out.println("Součet: "+soucet);




    }
}
