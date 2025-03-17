import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Březen_H21_ArrayList_CV1 {
    public static void main(String[] args) {
        ArrayList<String> telefonniSeznam = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        String vstupUzivatele;

        do {
            System.out.println("Zadejte jméno a číslo nového kontaktu.");
            vstupUzivatele = sc.nextLine();
            telefonniSeznam.add(vstupUzivatele);
        } while (!vstupUzivatele.trim().equalsIgnoreCase("konec")); //IgnoreCast = aby uživatel mohl zadat více variant (např. KONEC, Konec); Trim = ukousne bíle znaky

        telefonniSeznam.removeLast();
            // telefonniSeznam.remove("konec");
            /* int delka = telefonniSeznam;
               telefonniSeznam.remove(delka - 1);
            */

        // System.out.println(telefonniSeznam); - výpis vedle sebe

        Collections.sort(telefonniSeznam);

        System.out.println("-------------------------| Kontakty |-------------------------");

        for (String kontakt : telefonniSeznam) { //výpis pod sebou
            System.out.println(kontakt);
        }

        System.out.println("--------------------------------------------------------------");
    }
}