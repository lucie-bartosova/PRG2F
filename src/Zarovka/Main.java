package Zarovka;

public class Main {
    public static void main(String[] args) {

        Zarovka kuchyn = new Zarovka();

        System.out.println(Zarovka.pocetZarovek + " žárovka");
        Zarovka pokoj = new Zarovka(true);
        System.out.println(Zarovka.pocetZarovek + " žárovky");

        Zarovka obyvak = new Zarovka(true);
        Zarovka loznice = new Zarovka(true);
        Zarovka koupelna = new Zarovka(false);

        System.out.println(Zarovka.pocetSviticichZarovek + " svíticích žárovek");
        System.out.println(Zarovka.pocetNesviticichZarovek + " nesvíticích žárovek");


    }
}
