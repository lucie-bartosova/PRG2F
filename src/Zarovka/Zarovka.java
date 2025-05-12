package Zarovka;

public class Zarovka {

    // Atributy
    private boolean sviti;
    static int pocetZarovek = 0; //Když je static - je to jen proměnná třídy - můžu ji vyžít jen jako Zarovka.pocetZarovek

    static int pocetSviticichZarovek = 0;
    static int pocetNesviticichZarovek = 0;



    // Konstruktor
    public Zarovka() {
        this.sviti = false;
        pocetZarovek++;
        pocetNesviticichZarovek++;
    }

    public Zarovka(boolean stavZarovky) {
        this.sviti = stavZarovky;
        pocetZarovek++;

        if (stavZarovky == true) {
            pocetSviticichZarovek++;
        } else {
            pocetNesviticichZarovek++;
        }
    }

}
