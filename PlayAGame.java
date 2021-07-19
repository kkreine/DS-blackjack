// Author: Kori Reine
//File name: PlayAGame.java
// Purpose: Entry point to card playing game
// Date Last Modified: 5/14/2021

import java.util.Scanner;

public class PlayAGame {
    public static void main(String[] args) {
        System.out.println("Welcome to the game");
        DeckOfCards myDeck = new DeckOfCards();
        DeckOfCards discardDeck = new DeckOfCards();
        int max_cards = 52;
        Card playerHand[] = new Card[max_cards];
        
        // Fill and shuffle deck
        myDeck.fillDeck();
        myDeck.shuffleDeck();

        // Get user input
        System.out.print("How many cards should I draw? ");
        Scanner input = new Scanner(System.in);
        int numPlayerCards = input.nextInt();
        input.close();
        System.out.println();

        System.out.println("Drawing " + numPlayerCards + " cards.");
        System.out.println();

        // Print hand
        System.out.println("My hand:");
        for (int i = 0; i < numPlayerCards; i++) {
            playerHand[i] = myDeck.drawCard();
            System.out.println(playerHand[i]);
        }
        System.out.println();

        // Show the remaining deck
        System.out.println("Looking at the deck:");
        System.out.println("Number of cards left is " + myDeck.numCards);
        System.out.println("Here's a quick peek at the deck:");
        System.out.println(myDeck.toString());
        System.out.println();

        // Discard pile
        System.out.println("Returning the cards to the discard pile.");
        for (int i = 0; i < numPlayerCards; i++) 
            discardDeck.insertCard(playerHand[i]);
        System.out.println("Discard pile:");
        System.out.println("Number of cards left is " + discardDeck.numCards);
        System.out.println("Here's a peek at the deck:");
        System.out.println(discardDeck.toString());

        System.out.println();
        System.out.println("Thanks for playing!");

        // To make things separate, I'm going to put a simple blackjack game here:
        CardGame blackjack = new Blackjack();
    }
}