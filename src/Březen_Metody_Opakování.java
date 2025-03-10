public class Březen_Metody_Opakování {

    //Příklad 1: Součet dvou čísel
    public static int soucet(int a, int b) {
        return a + b;
    }

    //Příklad 2: Kontrola, zda je číslo sudé
    public static boolean sude(int x) {
        if (x%2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Příklad 3: Vytvoření úvítací zprávy
    public static void zprava(String jmeno) {
        System.out.println("Vítejte, " + jmeno + "!");
    }

    //Příklad 4: Přetížená metoda pro výpočet mocniny (rektuzivně)
    public static int mocnina(int cislo) {
        return cislo * cislo;
    }

    //Příklad 5: Výpočet faktoriálu (rekurzivně)
    public static int faktorial(int cislo2) {
        int faktorial = 1;
        for (int i = 1; i <= cislo2; i++) {
            faktorial *= i;
        }
        return faktorial;
    }


    //Příklad 6: Výpočet Fibonacciho čísla (rekruzivně)
    public static int fibonacci(int cislo3) {
        if (cislo3 == 0) {
            return 0;
        } else if (cislo3 == 1) {
            return 1;
        } else {
            return fibonacci(cislo3 - 1) + fibonacci(cislo3 - 2);
        }
    }



    public static void main(String[] args) {
        System.out.println(soucet(1, 5));
        System.out.println(sude(5));
        zprava("Lucie");

        System.out.println(mocnina(5));
        System.out.println(faktorial(5));
        System.out.println(fibonacci(10));
    }
}
