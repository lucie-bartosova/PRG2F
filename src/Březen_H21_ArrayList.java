import java.util.ArrayList;

public class Březen_H21_ArrayList   {

    public static void main(String[] args) {
        ArrayList<String> auta = new ArrayList<>();

        auta.add("Škoda");
        auta.add("Mercedes");
        auta.add("Mazda");
        auta.add("Fiat Punto");

        System.out.println(auta.get(0)); //Vypíše prvek na daném indexu
        // auta.getFirst() - vypíše první prvek v poli
        // auta.getLast() - vypíše poslední prvek v poli


        auta.remove(3); // Nebo: auta.remove("Fiat Punto"); - !POZOR, je case-sensitive!


        auta.set(0, "Pagani Zonda"); //Výměna prvku na indexu 1

        System.out.println(auta.size());

        System.out.println(auta);

        for (int i = 0; i < auta.size(); i++) {
            System.out.println(auta.get(i));
        }
    }

}
