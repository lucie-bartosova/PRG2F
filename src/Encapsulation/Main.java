package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Obdelnik o = new Obdelnik(-5, 10);

        /* Způsob přes atributy
        o.stranaA = 10;
        o.stranaB = 15;

        System.out.println(o.stranaA);
        */


        // Způsov přes metody Getter a Setter
        //o.setStranaA(5);
        System.out.println(o.getStranaA());
        System.out.println(o.getStranaB());

        o.setBarva("maroon");
        System.out.println(o.getBarva());

    }
}
