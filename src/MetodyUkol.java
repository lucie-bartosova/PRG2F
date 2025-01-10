public class MetodyUkol {

    static void validatePassword(String password) {
        boolean valid = false;

        if (password.length() < 8) {
            System.out.println("Délka hesla nebyla splněna, zadejte heslo o minimální délce 8 znaků");
            return;
        }

        if (password.toLowerCase().contains("heslo")) {
            System.out.println("Heslo nesmí obsahovat slovo \"Heslo\".");
            return;
        }

        if (!password.matches(".*\\d.*")) {
            System.out.println("Heslo musí obsahovat libovolné číslo.");
            return;
        }

        valid = true;

        if (valid) {
            System.out.println( password + " splňuje všechny podmínky!");
        }
    }

    public static void main(String[] args) {
        validatePassword("HesloHeslo123"); //nesplněno - obsahuje slovo "heslo"
        validatePassword("Valid"); //nesplněno - neobsahuje >8 znaků
        validatePassword("ValidValid"); //nesplněno - neobsahuje žádné číslo
        validatePassword("JaFaktNevim123"); //splněno
    }
}
