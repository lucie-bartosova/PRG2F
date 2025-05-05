package Blackjack;

import java.util.ArrayList;

public class Dealer {
    private ArrayList<Card> hand;

    public Dealer() {
        hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int DealerValue() {
        int value = 0;
        int eso = 0;

        for (Card card : hand) {
            value += card.getValue();
            if (card.getValue() == 11) {
                eso++;
            }
        }
        while (value > 21 && eso > 0) {
            value -= 10;
            eso--;
        }

        return value;
    }

    public void printDealer(boolean hideFirstCard) {
        if (hideFirstCard) {
            System.out.println("Dealerova první karta je skrytá:");
            for (int i = 1; i < hand.size(); i++) {
                hand.get(i).printCard();
            }
        } else {
            System.out.println("Dealerovy karty:");
            for (Card card : hand) {
                card.printCard();
            }
            System.out.println("Hodnota dealerových karet je: " + DealerValue());
        }
    }
}
