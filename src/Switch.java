import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Napište číslo od 1-7, které reprezentuje den v týdnu.");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Je Pondělí.");
                break;
            case 2:
                System.out.println("Je Úterý.");
                break;
            case 3:
                System.out.println("Je Středa.");
                break;
            case 4:
                System.out.println("Je Čtvrtek.");
                break;
            case 5:
                System.out.println("Je Pátek.");
                break;
            case 6:
                System.out.println("Je Sobota.");
                break;
            case 7:
                System.out.println("Je Neděle.");
                break;
            default:
                System.out.println("Neplatný den! Zkuste zadat číslo od 1 do 7");
                break;
        }
    }

}


