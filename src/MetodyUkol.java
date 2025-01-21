public class MetodyUkol {

    static void validatePassword(String password) {
        boolean valid = false;

        if (password.length() < 8) {
            System.out.println("Heslo nesplňuje jednu z podmínek: \"délka hesla\"");
            return;
        }

        if (password.toLowerCase().contains("heslo")) {
            System.out.println("Heslo nesplňuje jednu z podmínek: \"obsahuje zakázané slovo\"");
            return;
        }

        if (!password.matches(".*\\d.*")) {
            System.out.println("Heslo nesplňuje jednu z podmínek: \"neobsahuje žádné číslo\"");
            return;
        }

        valid = true;

        if (valid) {
            System.out.println("Heslo je v pořádku");
        }
    }

    public static void main(String[] args) {
        validatePassword("HesloHeslo123");
        validatePassword("Valid");
        validatePassword("ValidValid");
        validatePassword("JaFaktNevim123");
    }
}
