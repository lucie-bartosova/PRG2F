public class VnoreneCykly {
    public static void main(String[] args) {

        // ■ = Alt + 254
        // Shift + F6 = Přejmenování všech stejných proměnných

        int velikost = 8;

        for (int radek = 0; radek < velikost; radek++) {
            for (int sloupec = 0; sloupec < velikost; sloupec++) {
                if ((sloupec + radek) % 2 == 0) {
                    System.out.print("⬛ ");
                } else {
                    System.out.print("⬜ ");
                }
            }
            System.out.println();
        }

    }
}
