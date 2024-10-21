public class CyklusFor {
    public static void main(String[] args) {
        // Vypište násobky 5ti od 1 do 1000
            // Pomocí cyklu While
            int i = 0;
            while(i <= 1000){
                System.out.println(i);
                i += 5;
            }

            // Pomocí cyklu For
            for (int j = 0; j <= 1000 ; j+= 5) {
                System.out.println(j);
            }

        // Vypište všechna čísla od 100 do 0
            //Cyklus For
            for (int k = 100; k >= 0 ; k--) {
                System.out.println(k);
            }

        // Vypište všechna čísla od 100^2 do 0^2
            // Cyklus For
            for (int l = 100; l >= 0; l--) {
                System.out.println(l*l);
                // System.out.println(Math.pow(l, 1.5));
            }

        // Vypište malou násobilku pro čísla 1-10
            // Cyklus For
            for (int n = 1; n <= 10 ; n++) {
                for (int p = 1; p <= 10 ; p++) {
                    System.out.print(n*p+" ");
                    if (n*p <= 9) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
    }
}
