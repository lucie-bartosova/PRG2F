package Blackjack;

public class Card {
    private String rank;
    private String suit;
    private int value;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;

        if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
            this.value = 10;
        } else if (rank.equals("A")) {
            this.value = 11;
        } else {
            this.value = Integer.parseInt(rank);
        }

        if (suit.equals("srdce")) {
            this.suit = "♥️";
        } else if (suit.equals("káry")) {
            this.suit = "♦️";
        } else if (suit.equals("piky")) {
            this.suit = "♠️";
        } else if (suit.equals("kříže")) {
            this.suit = "♣️";
        }
    }

    public int getValue() {
        return value;
    }

    public void printCard() {
        System.out.println(rank + suit);
    }


}
