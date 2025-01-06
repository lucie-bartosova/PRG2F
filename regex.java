import java.util.regex.Pattern;

public class regex {
    public static void main(String[] args) {
        // String string = "Lorem ipsum 123 KOL1S2";
        // Pattern p = Pattern.compile("[0-9]+");

        // Obsahuje PSČ?
        String psc = "31200";
        Pattern p2 = Pattern.compile("\\d{5}");

        String psc2 = "312 00";
        Pattern p3 = Pattern.compile("\\d{3}_\\d{2}");

        // Rodné čísla
        String rodCis = "075813/1234"; //YYMMDD/xxxx
        Pattern p4 = Pattern.compile("/\\d{4}");
    }
}
