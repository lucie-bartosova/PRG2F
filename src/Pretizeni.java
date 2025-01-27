import java.util.Scanner;

public class Pretizeni {



    // Úkol 1 - Suma celých čísel (Přetížení datovým typem)
    static int suma(int a, int b) {
        return a + b;
    }
    //          Suma reálných čísel
    static double suma(double a, double b) {
        return a + b;
    }



    // Úkol 2 - Průměr
    static double avg() {
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int partialSum = 0;

        System.out.println("Zadejte číslo.");
        int input = sc.nextInt();
        counter++;
        partialSum += input;

        while (input != -1) { //"Dokud něco ... budeme opakovat ... => While
            input = sc.nextInt();
            counter++;
            partialSum += input;
        }

        return partialSum / counter;
    }
    static double avg(double a, double b, double c) {
        double suma = a + b + c;
        double pocet = 3;

        return suma / pocet;
    }



    // Úkol 3 - Jméno a věk (Přetížení jiným pořadím)
    static void print(String jmeno, int vek) { //Checeme jen vypsat => void
        System.out.println("Jméno: " + jmeno + "\nVěk: " + vek);
    }
    //          Věk a jméno (změna pořadí)
    static void print(int vek, String jmeno) {
        print(jmeno, vek);
    }



    public static void main(String[] args) {
        System.out.println(suma(5.5, 10.5)); // Když použiju reálné číslo, použije se metoda s double

        print("Lucka", 17);
        print(17, "Lucka");

        System.out.println(avg());
    }
}
