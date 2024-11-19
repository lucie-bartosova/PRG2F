import java.util.Random;
import java.util.Scanner;

public class CyklusFor {
    public static void main(String[] args) {

        // Vypište násobky 5ti od 1 do 1000
        {
            for (int a = 0; a <= 1000 ; a += 5) {
                System.out.println(a);
            }
        }

        // Vypište všechna čísla od 100 do 0
        {
            for (int b = 100; b >= 0 ; b--) {
                System.out.println(b);
            }
        }

        // Vypište všechna čísla od 100^2 do 0^2
        {
            for (int c = 100; c <= 0 ; c--) {
                System.out.println(c*c);
            }
        }

        // Vypište malou násobilku pro čísla 1-10
        {
            for (int d = 1; d <= 10 ; d++) {
                for (int e = 1; e <= 10 ; e++) {
                    System.out.print(d*e + " ");
                }
                System.out.println();
            }
        }

        // Funkce (y = 2x - 3)
        {
            for (int f = -50; f <= 50 ; f++) {
                int y = 2 * f - 3;
                System.out.println("Pro x = " + f + " se funkce: y = " + y);
            }
        }

        // Součet od 1 do čísla od uživatele
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Napište libovolné číslo.");
            int g = sc.nextInt();

            int soucet = 0;

            for (int h = 1; h <= g ; h++) {
                soucet += h;
                if (h < g) {
                    System.out.print(h + " + ");
                } else {
                    System.out.print(h);
                }
            }
            System.out.print(" = " + soucet);
            System.out.println();
        }

        // Faktoriál čísla od uživatele
        {
            Scanner sc = new Scanner(System.in);

            System.out.println("Zadejte libovolné číslo.");
            int i = sc.nextInt();

            int faktorial = 1;

            for (int j = i; j >= 1 ; j--) {
                faktorial *= j;
                if (j != 1) {
                    System.out.print(j + " * ");
                } else {
                    System.out.print(j);
                }
            }
            System.out.print(" = " + faktorial);
            System.out.println();
        }

        // Hod mincí - Pravděpodobnost
        {
            int panna = 0;
            int orel = 0;
            Random k = new Random();

            for (int l = 0; l <= 1000000; l++) {
                int nahoda = k.nextInt(0,2);
                if (nahoda == 1) {
                    panna++;
                } else {
                    orel++;
                }
            }
            System.out.println("Pravděpodobnost panny je: " + panna/10000.0 + " %");
            System.out.println("Pravděpodobnost orla je: " + orel/10000.0 + " %");
        }

        // Hod kostkou - Pravěpodobnost hodu čísla 3
        {
            // l = Hod kostkou
            // m = Pravděpodobnost
            // n = Kostka
            // o = Náhoda

            Random l = new Random();
            int m = 0;

            for (int n = 0; n <= 10000000 ; n++) {
                int o = l.nextInt(0,7);
                if (o == 3) {
                    m++;
                }
            }
            System.out.println("Pravděpodobnost hodu čísla 3 je: " + m/100000.0 + " %");
        }

        // Bonus - Trojúhelník z *
        {
            // p = Uživatelem požadovaná výška
            // q = Výška trojúhelníku
            // r = Počet hvězdiček
            Scanner sc = new Scanner(System.in);
            System.out.println("Zadejte prosím výsku trojúhelníku");
            int p = sc.nextInt();

            for (int q = 1; q <= p ; q++) {
                for (int r = 1; r < q ; r++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}