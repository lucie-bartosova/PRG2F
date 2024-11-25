import java.util.Scanner;

public class Stringy {
    public static void main(String[] args) {
        // Úkol na Moodle

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte křestní jméno:");
        String krestniJmeno = sc.next();
        System.out.println("Zadejte přijmení:");
        String prijmeni1 = sc.next();

        //-------------------------------------------------
        String jmeno = "Martins Ferreira Pereira De Magalhaes";
        String prijmeni = "Mandová";
        jmeno = jmeno + " " + prijmeni;

        int delkaRetezce = "Ahoj".length();

        delkaRetezce = jmeno.length();

        int indexM = jmeno.indexOf("De"); // Když chci písmenko, dám to do ''

        System.out.println(delkaRetezce);
        System.out.println(indexM); // na pozici 25

        // Když chci do řetězce uložit něco v uvozovkách - "On je: \"Idiot\"" => (On je "Idiot") - escape character

        System.out.println(jmeno.toUpperCase());
        System.out.println(jmeno.toLowerCase());

        // Bílé znaky = Tabulátor, mezera, ...
        String password = "      heslo          ";
        System.out.println(password.trim());
        System.out.println("void                 ".strip());

        String vdanaMandova = jmeno.replace("Mandová", "Cervenokostelecká");
        System.out.println(vdanaMandova);

        String oprava = vdanaMandova.replace('C', 'Č');
        System.out.println(oprava);
        //String je neměnná proměnná

        {
            boolean case1 = new String("test").equals("test"); // true

            // new String("test") a "test" jsou rozdílné objekty. == porovnává, jestli jsou to stejný objekty
            boolean case2 = new String("test") == "test"; // false

            // stejně jako case2
            boolean case3 = new String("test") == new String("test"); // false

            // jedná se o tzv. "literály" a to jsou vždy stejné objekty
            boolean case4 = "test" == "test"; // true

            // literály "te" a "st" se spojí v jeden a odkazuje se poté na jeden a ten samý objekt
            boolean case5 = "test" == "te" + "st"; // true
        } //Porovnávání

        // pro jednoduchost používejte u řetězců místo ==, equals()
        System.out.println("Bob".equals("bob"));
        System.out.println("Bob".equalsIgnoreCase("bob"));


        System.out.println("Zadejte slovo/cokoliv jiného");
        String odUziv = sc.next();
        System.out.println("Délka: "+odUziv.length());
        System.out.println("Velkými: "+odUziv.toUpperCase());

    }
}
