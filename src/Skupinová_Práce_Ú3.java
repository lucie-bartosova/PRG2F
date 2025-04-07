import java.util.ArrayList;
import java.util.Scanner;

public class Skupinová_Práce_Ú3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> toDoList = new ArrayList<>();

        System.out.println();

        String vstupUzivatele;

        do {
            System.out.println("Zadejte úkol, který chcete do seznamu přidat. (Zadávání ukončíte zadáním \"-1\"");
            vstupUzivatele = sc.nextLine();
            toDoList.add(vstupUzivatele);
        } while (!vstupUzivatele.trim().equalsIgnoreCase("-1"));

        toDoList.removeLast();

        System.out.println("--------| To-Do List |--------");
        for (String ukol : toDoList) {
            System.out.println(ukol);
        }
        System.out.println("------------------------------");

        System.out.println("Přejete si zaškrtnout některý z úkolu jako hotový?");
        String upravaUzivatel = sc.nextLine();

        int cisloUkolu;

        if (upravaUzivatel.trim().equalsIgnoreCase("ano")) {
            while (true) {
                System.out.println("Zadejte pozici úkolu, který chcete škrtnout (Zadávání ukončíte zadáním \"-1\") - POZOR! První úkol je označen číslem 0!");
                cisloUkolu = sc.nextInt();
                if (cisloUkolu == -1) break;
                toDoList.remove(cisloUkolu);
            }
        }



        System.out.println("--------| To-Do List |--------");
        for (String ukol : toDoList) {
            System.out.println(ukol);
        }
        System.out.println("------------------------------");
    }
}
