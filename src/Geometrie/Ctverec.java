package Geometrie;

// Třída
public class Ctverec {

    // Atributy
    private double delkaStranyA;
    private double delkaStranyB;
    private double obsah;
    private double obvod;



    // Konstruktor
    public Ctverec() {
        this.delkaStranyA = delkaStranyA;
        this.delkaStranyB = delkaStranyB;
    }


    // Getter
    public double getDelkaStranyA() {
        return delkaStranyA;
    }

    public double getDelkaStranyB() {
        return delkaStranyB;
    }

    public double getObsah() {
        return delkaStranyA * delkaStranyB; // Nechápu proč to funguje
    }

    public double getObvod() {
        return 2 * (delkaStranyA + delkaStranyB);
    }

    // Setter
    public void setDelkaStranyA(double delkaStranyA) {
        this.delkaStranyA = delkaStranyA;
    }

    public void setDelkaStranyB(double delkaStranyB) {
        this.delkaStranyB = delkaStranyB;
    }
}