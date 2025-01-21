import java.util.Scanner;

public class MetodyUkol4 {

    // Úkol 4 - součet číslic čísla

    public static int sumOfDigits(int n) {
        n = Math.abs(n);

        if (n < 10) {
            return n;
        } else {
            n = n%10 + sumOfDigits(n/10);
            return n;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zadejte číslo:");
        int cislo = sc.nextInt();

        System.out.println("Součet číslic čísla " + cislo + " je: " + sumOfDigits(cislo));

    }
}
