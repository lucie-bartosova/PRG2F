import java.sql.SQLOutput;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {

        int vek = 0;
        double PI = 3.14159d;
        boolean isTrue = true;
        char bigA = 'A';
        String name = "Jmeno";





        // Pro načtení od uživatele je potřeba Scanner:
        Scanner sc = new Scanner(System.in);
        System.out.println("Napiš mi své jméno.");
        String jmeno = sc.next();
        // int cislo = sc.nextInt();
        // double des = sc.nextDouble();
        System.out.println(jmeno);






        // cv. 1 - Uložte 2 libovolná čísla do 2 proměnných - Vypište, Prohoďte a vypište
        int a = 1;
        int b = 2;
        int temp = 0;

        temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);





        // cv. 2 - Jednoduchá kalkulačka (+, -, *, /)
        while (true) {

        System.out.println("Zadejte první číslo");
        int prvni = sc.nextInt();
        System.out.println("Zadejte druhé číslo");
        int druhy = sc.nextInt();


        System.out.println("Vyberte početní operaci (+,-,*,/");
        String znaminko = sc.next();

        if (znaminko.equals("+")) {
            System.out.println(prvni+druhy);
        } else if (znaminko.equals("-")) {
            System.out.println(prvni-druhy);
        } else if (znaminko.equals("*")) {
            System.out.println(prvni*druhy);
        } else if (znaminko.equals("/")) {
            System.out.println(prvni/druhy);
        }
        }

        /*System.out.println(prvni+druhy);
        System.out.println(prvni-druhy);
        System.out.println(prvni*druhy);
        System.out.println(prvni/druhy);*/

        sc.close();
    }
}
