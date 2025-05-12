package Účet;

import java.text.spi.DateFormatProvider;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ucet {

    private static int generator = 100000;
    private String cisloUctu;
    private String majitel;
    private double zustatek;

    private static double poplatek = 0.5;

    private List<String> historie = new ArrayList<>();

    /**
     * @author lucka
     */

    public Ucet(String majitel) {
        this.majitel = majitel;
        zustatek = 0;
        cisloUctu = "ACC-" + generator;
        generator++;
    }

    public void pridejCastku(double castka) {
        if (castka > 0) {
            zustatek = zustatek + castka;
            log("přidáno " + castka);
        }
    }
    /**
     * @author pavel
     */
    public boolean vyberPenize(double castka) {
        if (zustatek >= (castka + poplatek) && castka > 0) {
            zustatek -= castka + poplatek;
            log("vybrano " + castka);
            return true;
        } else {
            return false;
        }
    }

    public boolean posliPenize(Ucet cil, double castka) {
        if (vyberPenize(castka)) {
            cil.pridejCastku(castka);
            log("poslal uctu " + cil.cisloUctu + " castku " + castka);
            return true;
        } else {
            return false;
        }


    }

    public void log(String info) {
        historie.add(LocalDate.now().toString() + " " + info);
    }

    /**
     * @author kuba
     */

    public void vypisZustatek() {
        System.out.println(majitel+ " - " + cisloUctu + " - " + zustatek);
    }

    public void vypisHistorie() {
        System.out.print("Historie uctu "+ cisloUctu);
        for(String log : historie) {
            System.out.println(log);
        }
    }

    public String getCisloUctu() {
        return cisloUctu;
    }

    public String getMajitel() {
        return majitel;
    }
}
