import java.util.Scanner;

public class Leden_H14_Array_CV1 {
    public static void main(String[] args) {

        // ú.1
        int[] pole = {1, 0, 2, 5, 3, -2, 6, -7, -22, -100};

        pole[3] = 20; //Změna čísla na vybrané pozici (začíná se od 0)

        System.out.println(pole[9]); // Vypíše poslední prvek, když vím kolik prvků v poli mám
        System.out.println(pole[pole.length - 1]); // Vypíše poslední prvek (délka - 1 => protože se počítá od 0)

        // Vypsání všech prvků

        System.out.println("          -- Výpis všech prvků od začátku --");

        for (int i = 0; i < pole.length ; i++) {
            System.out.println(pole[i]);
        }

        System.out.println("          -- Výpis všech prvků od konce --");

        for (int i = pole.length - 1; i >= 0; i--) {
            System.out.println(pole[i]);
        }


        // ú.2

        Scanner sc = new Scanner(System.in);
        System.out.print("Zadejte číslo, které bude zastupovat kolika prvkové pole bude: ");
        int pocetPrvku = sc.nextInt();

        if (pocetPrvku < 0) System.out.println("Zadejte kladné číslo.");

        int[] poleCisel = new int[pocetPrvku];

        System.out.println("Postupně zadávejte prvky:");
        for (int i = 0; i < pocetPrvku; i++) {
            int vstup = sc.nextInt();
            poleCisel[i] = vstup;
        }

        System.out.println("          -- Prvky pole --");
        for (int i = 0; i < poleCisel.length ; i++) {
            System.out.println(poleCisel[i]);
        }

    }
}
