import java.util.Random;
import java.util.Scanner;

public class Priklady {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // AND
        {
            // 1. Povolení vstupu na atrakci
            System.out.println("Vítejte na atrakci! Zadejte prosím svůj věk.");
            int vek = sc.nextInt();

            System.out.println("Dále prosím zadejte Vaši výšku.");
            int vyska = sc.nextInt();

            if (vek > 12 && vyska >= 140 && vyska < 200) {
                System.out.println("Super! Splňujete všechny požadavky. Vítejte na naší atrakci a užijte si ji! :D");
            } else {
                System.out.println("Bohužel nesplňujete některé podmínky pro vstup na naši atrakci. :(");
            }

            // 2. Platná registrace na závod
            System.out.println("Vítejte na našem maratonu! Zadejte prosím Váš věk.");
            int vek2 = sc.nextInt();

            System.out.println("Dále prosím zadejte čas, za který dokážete 10km uběhnout. (V minutách)");
            int cas = sc.nextInt();

            if (vek2 >= 18 && cas < 60) {
                System.out.println("splněné podmínky pro registraci.");
            } else {
                System.out.println("nesplěné podmínky pro registraci.");
            }

            // 3. Slevová akce
            System.out.println("Dobrý den! Získali jste možnost obdržet slevu na nákup! Zadejte prosím počet Vašich věrnostních bodů.");
            int body = sc.nextInt();

            System.out.println("Nyní prosím zadejte celkovou hodnotu zboží ve Vašem košíku.");
            int kosik = sc.nextInt();

            if (body > 100 && kosik >= 5000) {
                System.out.println("Gratulujeme! Obdrželi jste slevu!");
            } else {
                System.out.println("Bohužel, sleva Vám nebyla udělena, protože nesplňujete podmínky akce. :(");
            }
        }

        // OR + RANDOM
        {
            // 1. Generování dvou náhodných čísel (1-12)
            int cislo1 = random.nextInt(1, 13);
            int cislo2 = random.nextInt(1, 13);

            System.out.println(cislo1);
            System.out.println(cislo2);

            if (cislo1+cislo2==21 || cislo1+cislo2<10) {
                System.out.println("Vyhráli jste!");
            } else {
                System.out.println("Nevyhráli jste.. :(");
            }

            // 2. Hod dvou kostek
            int kostka1 = random.nextInt(1, 7);
            int kostka2 = random.nextInt(1, 7);

            if (kostka1+kostka2<10 || (kostka1==6 && kostka2==6)) {
                System.out.println("Vyhráli jste!");
            } else {
                System.out.println("Prohráli jste..");
            }

            // 3. Hod tří kostek
            int kostka11 = random.nextInt(1, 7);
            int kostka22 = random.nextInt(1, 7);
            int kostka33 = random.nextInt(1, 7);

            if (kostka11==kostka22 || kostka11==kostka33 || kostka22==kostka33) {
                System.out.println("Vyhráli jste! Alespoň dvě kostky byly stejné.");
            } else {
                System.out.println("Dnes to bohužel nevyšlo... Zkuste to znovu!");
            }
        }

        // Reálné scénáře
        {
            // 1. Pozdrav podle času
            System.out.println("Zadejte prosím kolik je hodin (v rozmezí: 0-23)");
            int hodiny = sc.nextInt();

            if (hodiny >= 5 && hodiny <= 11) {
                System.out.println("Dobré ráno!");
            } else if (hodiny >= 12 && hodiny <= 17) {
                System.out.println("Dobré odpoledne!");
            } else {
                System.out.println("Dobrý večer!");
            }

            // 2. Cenová kalkulace
            System.out.println("Zadejte prosím kolik vstupenek chcete koupit.");
            int pocetVstupenek = sc.nextInt();

            int plnaCena = 1200;
            double sleva15 = plnaCena*0.85;
            double sleva25 = plnaCena*0.75;

            if (pocetVstupenek >= 1 && pocetVstupenek <= 5) {
                System.out.println("Platíte: "+plnaCena*pocetVstupenek+" Kč.");
            } else if (pocetVstupenek >= 6 && pocetVstupenek <= 10) {
                System.out.println("Platíte: "+sleva15*pocetVstupenek+" Kč.");
            } else if (pocetVstupenek >= 11 && pocetVstupenek <= 20) {
                System.out.println("Platíte: "+sleva25*pocetVstupenek+" Kč.");
            } else {
                System.out.println("Objednávka zamítnuta...");
            }

            // 3. Výpočet ceny za spotřebu vody
            System.out.println("Zadejte svou měsíční spotřebu vody (v litrech).");
            int spotreba = sc.nextInt();

            double cena1 = 0.03;
            double cena2 = 0.025;
            double cena3 = 0.02;
            double cena4 = 0.015;

            if (spotreba >= 0 && spotreba <= 4999) {
                System.out.println("Za vodu budete platit: "+spotreba*cena1+" Kč.");
            } else if (spotreba >= 5000 && spotreba <= 9999) {
                System.out.println("Za vodu budete platit: "+spotreba*cena2+" Kč.");
            } else if (spotreba >= 10000 && spotreba <= 14999) {
                System.out.println("Za vodu budete platit: "+spotreba*cena3+" Kč.");
            } else if (spotreba >= 15000) {
                System.out.println("Za vodu budete platit: "+spotreba*cena4+" Kč.");
            }

        }
    }
}
