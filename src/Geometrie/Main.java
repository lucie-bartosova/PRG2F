package Geometrie;

public class Main {
    public static void main(String[] args) {

        // Konstruktor
        Ctverec a = new Ctverec();
        Ctverec b = new Ctverec();

        // Setter
        a.setDelkaStranyA(15);
        b.setDelkaStranyA(10);

        a.setDelkaStranyB(5);
        b.setDelkaStranyB(2);

        // Getter
        System.out.println("Čtverec A: strana a = " + a.getDelkaStranyA() + "; strana b = " + a.getDelkaStranyB());
        System.out.println("Čtverec B: strana a = " + b.getDelkaStranyA() + "; strana b = " + b.getDelkaStranyB());

        System.out.println("Obsah čtverce A: " + a.getObsah());
        System.out.println("Obsah čtverce B: " + b.getObsah());

        System.out.println("Obvod čtverce A: " + a.getObvod());
        System.out.println("Obvod čtverce B: " + b.getObvod());


    }
}
