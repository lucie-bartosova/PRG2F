import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Scanner;

public class Březen_H22_ArrayList_CV2 {

    public static void main(String[] args) {
        ArrayList<ArrayList<String>> seznamTrid = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Zadejte počet tříd: ");
        int pocetTrid = sc.nextInt();

        // Vytvoření prázdných tříd
        for (int i = 0; i < pocetTrid; i++) {
            seznamTrid.add(new ArrayList<>());

            System.out.print("Zadejte počet žáků v " + (i+1) + ". třídě: ");
            int pocetZaku = sc.nextInt();

            for (int j = 0; j < pocetZaku; j++) {
                System.out.print("Zadejte jména žáků: ");
                String zak = sc.next();

                // Varianta 1
                /* ArrayList<String> jednaTrida = seznamTrid.get(0);
                jednaTrida.add(zak); */

                // Varianta 2
                seznamTrid.get(i).add(zak);
            }

        }


        System.out.println("-----------------------| Seznam tříd: |-----------------------");

        for (int i = 0; i < pocetTrid; i++) {
            System.out.println("Třída číslo " + (i + 1) + ": " + seznamTrid.get(i));
            // System.out.printf("Třída %d %s\n", (i+1), seznamTrid.get(i));
        }

        System.out.println("--------------------------------------------------------------");
    }

}


// OOP - objektově orientované programování
// Škola - MÁ: Žáci, učitelé, žáci, jméno, kapitál - UMÍ: vzdelavat()
//  Třída - MAJÍ: TÚ, počet žáků, kmenová učebna, žáci - UMÍ: pridatZaka(), vykopniZaka()
//  Žák - MÁ: Jméno, příjmení, věk, rodné číslo - UMÍ:

// Postup:
// Škola - jméno: INFIS - Skola infis = new Skola()
// Třída - jméno: TwoF - Trida twoF = new Trida()
// Žák - jméno: Filip - Zak Filip = new Zak()
// twoF.zaci.add(zak);
// twoF.pridatZaka(Filip);