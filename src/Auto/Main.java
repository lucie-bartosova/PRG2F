package Auto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /* Úkol 1 - Auto */
        Auto a = new Auto();
        a.setZnacka("Škoda");
        a.setModel("Fabia");
        a.setRokVyroby(2020);

        Auto b = new Auto();
        b.setZnacka("Tesla");
        b.setModel("Model 3");
        b.setRokVyroby(2023);

        System.out.println("-----| Úkol 1 - Auto |------");
        System.out.println(a.getZnacka() + " " + a.getModel() + " (" + a.getRokVyroby() + ")");
        System.out.println(b.getZnacka() + " " + b.getModel() + " (" + b.getRokVyroby() + ")");
        System.out.println(" ");

    /* Úkol 2 - Produkt*/

    }
}
