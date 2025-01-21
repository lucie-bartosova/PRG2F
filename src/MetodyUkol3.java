import java.util.Scanner;

public class MetodyUkol3 {

    // Úkol 3 - generátor uživatelského jména

    public static String jmeno(String jmeno) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte své jméno:");
        return jmeno = sc.next();
    }

    public static String prijmeni(String prijmeni) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte své příjmení:");
        return prijmeni = sc.next();
    }

    public static String uzivatelskeJmeno(String jmeno, String prijmeni) {
        String uzivatelskeJmeno = "";

        if (jmeno.length() < 3) {
            uzivatelskeJmeno += jmeno.toLowerCase();
        } else {
            uzivatelskeJmeno += jmeno.substring(0,3).toLowerCase();
        }

        if (prijmeni.length() < 3) {
            uzivatelskeJmeno += prijmeni.toLowerCase();
        } else {
            uzivatelskeJmeno += prijmeni.substring(0,3).toLowerCase();
        }

        return uzivatelskeJmeno;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String jmeno = sc.next();
        String prijmeni = sc.next();

        String uzivatelskeJmeno = uzivatelskeJmeno(jmeno, prijmeni);

        System.out.println("Navrhované uživatelské jméno: " + uzivatelskeJmeno);

        if (uzivatelskeJmeno.length() > 4) {
            System.out.println("Vaše uživatelské jméno je v pořádku.");
        } else {
            System.out.println("Uživatelské jméno je příliš krátké. Přidejte další znak!");
        }

    }

}
