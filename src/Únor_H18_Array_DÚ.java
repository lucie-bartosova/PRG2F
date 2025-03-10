public class Únor_H18_Array_DÚ {

    public static String[] rozsireniInventory(String[] inventory) {
        String[] inventoryExpanded = new String[inventory.length + 4];
        for (int i = 0; i < inventory.length; i++) {
            inventoryExpanded[i] = inventory[i];
        }

        inventoryExpanded[32] = "Hyperaktive Popcornmaschine";
        inventoryExpanded[33] = "Schrödingers Gartenzwerg";
        inventoryExpanded[34] = "Unbesiegbares Kaugummimonster";
        inventoryExpanded[35] = "Lichtgeschwindigkeits-Sushirolle";

        return inventoryExpanded;
    }

    public static char[] rozsizeniRarity(char[] rarity) {
        char[] rarityExpanded = new char[rarity.length + 4];
        for (int i = 0; i < rarity.length; i++) {
            rarityExpanded[i] = rarity[i];
        }

        rarityExpanded[32] = 'A';
        rarityExpanded[33] = 'A';
        rarityExpanded[34] = 'A';
        rarityExpanded[35] = 'A';

        return rarityExpanded;
    }

    public static void serazeniAbeceda(String[] inventory, char[] rarity) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = i + 1; j < inventory.length; j++) {
                if (inventory[i].compareTo(inventory[j]) > 0) {
                    String tempItem = inventory[i];
                    inventory[i] = inventory[j];
                    inventory[j] = tempItem;

                    char tempRarity = rarity[i];
                    rarity[i] = rarity[j];
                    rarity[j] = tempRarity;
                }
            }
        }
    }

    public static void serazeniRarita(String[] inventory, char[] rarity) {
        for (int i = 0; i < inventory.length - 1; i++) {
            for (int j = i + 1; j < inventory.length; j++) {
                if (rarity[i] > rarity[j]) {
                    String tempItem = inventory[i];
                    inventory[i] = inventory[j];
                    inventory[j] = tempItem;

                    char tempRarity = rarity[i];
                    rarity[i] = rarity[j];
                    rarity[j] = tempRarity;
                }
                else if (rarity[i] == rarity[j]) {
                    if (inventory[i].compareTo(inventory[j]) > 0) {
                        String tempItem = inventory[i];
                        inventory[i] = inventory[j];
                        inventory[j] = tempItem;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {

        //Inventory
        String[] inventory = {
                "Spitzhacke",
                "Krankenwagen",
                "Apache-Hubschrauber 3000",
                "Monchhichi",
                "Chihuahua",
                "Gallone Milch",
                "Hubba Bubba",
                "48-Port-Switch",
                "Stiefel",
                "Schwanz eines weißen Wals",
                "DVD-Player",
                "16GB RAM",
                "LGM 30 Minuteman",
                "Lego Ninja Go",
                "Excalibur",
                "50-Meter-Seil",
                "Quanten-Discombobulator",
                "Empfindungsfähiges Gummiente",
                "Unsichtiges Glücks-Frettchen",
                "Zeitreisender Hamster",
                "Kosmische Luftpolsterfolie",
                "Telepathischer Spatel",
                "Interdimensionales Käserad",
                "Verzerrte Lavalampe",
                "Tanzender Kaktus des Chaos",
                "Mystische Fleischkugel",
                "Einhornfürze im Glas",
                "Singender Weltraum-Taco",
                "Antischwerkraft-Banane",
                "Multiversum-Becher",
                "Hellseherischer Toaster",
                "Atom-Schaumbad"
        };
        //Rarity
        char[] rarity = {'C', 'D', 'D', 'D', 'B', 'A', 'D', 'E', 'E', 'E', 'A', 'E', 'D', 'A', 'E', 'D', 'A', 'A', 'D', 'A', 'E', 'D', 'E', 'B', 'C', 'C', 'A', 'B', 'C', 'C', 'E', 'E'};


        //Rozšíření polí
        String[] inventoryExpanded = rozsireniInventory(inventory);
        char[] rarityExpanded = rozsizeniRarity(rarity);


        //Výpis seřazeného pole
        System.out.println("\n\n-------- Rozřazení podle abecedy --------\n");
        serazeniAbeceda(inventoryExpanded, rarityExpanded);
        for (int i = 0; i < inventoryExpanded.length; i++) {
            System.out.println(inventoryExpanded[i] + " | " + rarityExpanded[i]);
        }

        System.out.println("\n\n-------- Rozřazení podle rarity --------\n");
        serazeniRarita(inventoryExpanded, rarityExpanded);
        for (int i = 0; i < inventoryExpanded.length; i++) {
            System.out.println(inventoryExpanded[i] + " | " + rarityExpanded[i]);
        }

    }
}
