package Encapsulation;

public class Obdelnik {
    // Pro využití Getter a Setter musím proměnné dát na PRIVATE
    private double stranaA;
    private double stranaB;
    String barva;


    // SETTERY
        // alt + insert
    public void setStranaA(double stranaA) {
        if (stranaA > 0) {
            this.stranaA = stranaA;
        } else {
            return;
        }
    }

    public void setStranaB(double stranaB) {
        if (stranaB > 0) {
            this.stranaB = stranaB;
        } else {
            return;
        }
    }

    public void setBarva(String barva) {
        this.barva = barva;
    }

    // GETTERY
        // alt + insert
    public double getStranaA() {
        return stranaA;
    }

    public double getStranaB() {
        return stranaB;
    }

    public String getBarva() {
        return barva;
    }

    // KONSTRUKTORY
        // alt + insert
    public Obdelnik(double stranaA, double stranaB) {
        setStranaA(stranaA);
        setStranaB(stranaB);
    }
}
