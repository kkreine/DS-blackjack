// Author: Kori Reine
// File name: DeckOfCards.java
// Purpose: Class to create and interact with a deck of cards
// Date Last Modified: 5/14/2021

public class DeckOfCards {
    public int numCards;
    public LinkedStack<Card> cardDeck;

    // Constructor
    public DeckOfCards() {
        numCards = 0;
        cardDeck = new LinkedStack<Card>();
    };

    // Assign values to all cards
    public void fillDeck() {
        int r; // rank
        int s; // suit
        if (!cardDeck.isEmpty()) {
            System.out.println("Error, can't fill deck already full");
            throw new RuntimeException();
        }

        for (r = 1; r <= 13; r++) {
            for (s = 0; s < 4; s++) {
                Card card = new Card();
                card.setSuit(s);
                card.setRank(r);
                cardDeck.push(card);
                numCards++;
            }
        }
    }

    public void shuffleDeck() {
        int i;
        if (cardDeck.isEmpty()) {
            System.out.println("Error, can't shuffle an empty deck");
            throw new RuntimeException();
        }
        for (i = 0; i < numCards; i++) {
            int index2 = (int)(Math.random() * (numCards + 1));
            cardDeck.swap(i, index2);
        }
    }

    public Card drawCard() {
        numCards--;
        return cardDeck.pop();
    }

    public void insertCard(Card insertCard) {
        cardDeck.push(insertCard);
        numCards++;
    }

    // Override toString function
    @Override
    public String toString() {
        String strOut = "";
        strOut += cardDeck.toString();
        return strOut;
    }
}