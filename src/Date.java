import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Date {

    static long DobaDo(LocalDate datum) {
        LocalDate dnes = LocalDate.now();
        return dnes.until(datum, ChronoUnit.DAYS);
    }

    public static void main(String[] args) {
        LocalDate vanoce = LocalDate.of(2025, 12, 24);
        LocalDate narozeniny = LocalDate.of(2025, 8, 13);
        LocalDate prazdniny = LocalDate.of(2025, 6, 27);

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte datum ve formátu YYYY-MM-DD.");
        String uzivatel = sc.nextLine();
        LocalDate datum = LocalDate.parse(uzivatel);


        System.out.println(DobaDo(vanoce) + " dní do Vánoc.");
        System.out.println(DobaDo(narozeniny) + " dní do mých narozenin.");
        System.out.println(DobaDo(prazdniny) + " dní do letních prázdnin.");
        System.out.println(DobaDo(datum) + " dní do Vámi vybraného data.");
    }

}
