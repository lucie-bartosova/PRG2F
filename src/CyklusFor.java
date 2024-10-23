import java.util.Random;
import java.util.Scanner;

public class CyklusFor {
    public static void main(String[] args) {
        /*// Vypište násobky 5ti od 1 do 1000
            // Pomocí cyklu While
            int i = 0;
            while(i <= 1000){
                System.out.println(i);
                i += 5;
            }

            // Pomocí cyklu For
            for (int j = 0; j <= 1000 ; j+= 5) {
                System.out.println(j);
            }

        // Vypište všechna čísla od 100 do 0
            //Cyklus For
            for (int k = 100; k >= 0 ; k--) {
                System.out.println(k);
            }

        // Vypište všechna čísla od 100^2 do 0^2
            // Cyklus For
            for (int l = 100; l >= 0; l--) {
                System.out.println(l*l);
                // System.out.println(Math.pow(l, 1.5));
            }

        // Vypište malou násobilku pro čísla 1-10
            // Cyklus For
            for (int m = 1; m <= 10 ; m++) {
                System.out.print("|");
                for (int p = 1; p <= 10 ; p++) {
                    System.out.print(m*p);
                    if (m*p <= 9) {
                        System.out.print(" ");
                    }
                    System.out.print("|");
                }
                System.out.println();
            }

        // Cvičení
            // Úkol 1 - Funkce
            for (int n = -50; n <= 50 ; n++) {
                int y = 2 * n - 3;
                System.out.println("Hodnota y: " + y);
            }

            // Úkol 2 - součet od 1 do čísla od uživatele
            System.out.println("Napište libovolné číslo");
            Scanner sc = new Scanner(System.in);
            int o = sc.nextInt();
            int soucet = 0;

            for (int p = 1; p <= o ; p++) {
                soucet += p;
                if (p != o) {
                    System.out.print(p +" + ");
                } else {
                    System.out.println(p);
                }
            }
            System.out.println("Součet: " + soucet);

            // Úkol 3
            System.out.println("Napište libovolné číslo");
            Scanner sc = new Scanner(System.in);
            int q = sc.nextInt();
            int nasobek = 1;

            for (int r = q; r > 0 ; r--) {
                nasobek *= r;
                if (r != 1) {
                    System.out.print(r +" * ");
                } else {
                    System.out.println(r);
                }

            }
            System.out.println("Faktoriál: " + nasobek);
            */



            // Úkol 4 - Hlava/Orel - 1mil mincí
            int hlava = 0;
            int orel = 0;
            Random hodMinci = new Random();


            for (int mince = 0; mince <= 1000000 ; mince++) {
               int nahoda = hodMinci.nextInt(0, 2);
               if ( nahoda == 1 ) {
                   hlava++;
               } else {
                   orel++;
               }
            }
            System.out.println("Pravděpodobnost hlavy je: " + hlava/10000.0 + " %");
            System.out.println("Pravděpodobnost orla je: " + orel/10000.0 + " %");
    }
}