import java.util.Scanner;

public class StringyCV {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String veta = sc.nextLine();
        System.out.println(veta.indexOf(' '));

        int pocet = 0;
        for (int i = 0; i < veta.length()-1; i++) {

            if (veta.charAt(i) == ' ') {
                pocet++;
            }
        }
        System.out.println(pocet);

        sc.close();
    }
}
