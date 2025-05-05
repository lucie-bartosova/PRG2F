package Blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            boolean playAgain = true;
            while (playAgain) {
                Deck deck = new Deck();
                deck.shuffle();

                ArrayList<Card> playerHand = new ArrayList<>();
                Dealer dealer = new Dealer();

                playerHand.add(deck.dealCard());
                playerHand.add(deck.dealCard());
                dealer.addCard(deck.dealCard());
                dealer.addCard(deck.dealCard());

                System.out.println("Tvé karty:");
                for (Card card : playerHand) {
                    card.printCard();
                }
                System.out.println("Hodnota tvých karet: " + getHandValue(playerHand));

                dealer.printDealer(true);

                boolean playerTurn = true;
                while (playerTurn) {
                    System.out.println("Chcete si líznout další kartu? ano/ne");
                    String action = scanner.nextLine().toUpperCase();

                    if (action.equalsIgnoreCase("ano")) {
                        Card newCard = deck.dealCard();
                        playerHand.add(newCard);
                        System.out.println("Tvá karta:");
                        newCard.printCard();
                        System.out.println("Hodnota tvých karet: " + getHandValue(playerHand));

                        if (getHandValue(playerHand) > 21) {
                            System.out.println("Hru vyhrál Dealer! 🤖");
                            playerTurn = false;
                            break;
                        }
                    } else if (action.equalsIgnoreCase("ne")) {
                        playerTurn = false;
                    } else {
                        System.out.println("Zadejte pouze ANO nebo NE");
                    }
                }

                if (getHandValue(playerHand) <= 21) {
                    System.out.println("\nNa řadě je Dealer");
                    dealer.printDealer(false);

                    while (dealer.DealerValue() < 17) {
                        Card newCard = deck.dealCard();
                        dealer.addCard(newCard);
                        System.out.println("Dealerova karta:");
                        newCard.printCard();
                        System.out.println("Hodnota dealerových karet: " + dealer.DealerValue());
                    }

                    int playerTotal = getHandValue(playerHand);
                    int dealerTotal = dealer.DealerValue();

                    if (dealerTotal > 21) {
                        System.out.println("Tuto hru jsi vyhrál/a ty! 🏅");
                    } else if (playerTotal > dealerTotal) {
                        System.out.println("Tuto hru jsi vyhrál/a ty! 🏅");
                    } else if (playerTotal < dealerTotal) {
                        System.out.println("Hru vyhrál Dealer! 🤖");
                    } else {
                        System.out.println("Je to remíza!");
                    }
                }

                System.out.println("\nChceš si hru zopakovat? ano/ne");
                String again = scanner.nextLine().toLowerCase();
                if (!again.equals("ano")) {
                    playAgain = false;
                }
            }

            System.out.println("Děkuji za zahrání! ♥️");
        }

        public static int getHandValue(ArrayList<Card> hand) {
            int value = 0;
            int aceCount = 0;

            for (Card card : hand) {
                value += card.getValue();
                if (card.getValue() == 11) {
                    aceCount++;
                }
            }
            while (value > 21 && aceCount > 0) {
                value -= 10;
                aceCount--;
            }
            return value;
        }
}
