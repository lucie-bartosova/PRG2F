import Účet.Ucet;

import java.util.Locale;

public class Main {
    /**
     * @author lojza
     */
    public static void main(String[] args) {
        Locale.setDefault(new Locale("cs", "CZ"));   // Kvůli desetinné čárce

        Ucet ucet1 = new Ucet("Ctirad");
        Ucet ucet2 = new Ucet("Zikmund");

        ucet1.pridejCastku(10_000);
        ucet2.pridejCastku(30_000);

        System.out.println("💸 Převod 2 500 Kč z účtu 1 na účet 2:");
        ucet1.posliPenize(ucet2, 2_500);

        System.out.println("🏧 Výběr 1 000 Kč z účtu 1:");
        ucet1.vyberPenize(1_000);

        System.out.println("📊 Konečné zůstatky:");
        ucet1.vypisZustatek();
        ucet1.vypisHistorie();
        System.out.println();
        ucet2.vypisZustatek();
        ucet2.vypisHistorie();
    }
}