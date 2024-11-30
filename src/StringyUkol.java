import java.util.Scanner;

public class StringyUkol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte křestní jméno.");
        String jmeno = sc.nextLine();

        System.out.println("Zadejte příjmení.");
        String prijmeni = sc.nextLine();

        String celeJmeno = jmeno + " " + prijmeni;
        System.out.println(celeJmeno);

        String jmenoObracene = "";
        for (int i = jmeno.length() - 1; i >= 0; i--) {
            jmenoObracene += jmeno.charAt(i);
        }

        String prijmeniObracene = "";
        for (int i = prijmeni.length() - 1; i >= 0; i--) {
            prijmeniObracene += prijmeni.charAt(i);
        }

        System.out.println(jmenoObracene.toUpperCase() + " " + prijmeniObracene.toUpperCase());

    }
}
