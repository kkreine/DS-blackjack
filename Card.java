//File name: Card.java
//Author: Kori Reine
//Date last modified: 5/14/2021
//Description: Class to create a card for playing

public class Card implements Comparable<Card> {
    private int rank;
    private int suit;
    String[] mapRank = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven",
                        "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
    String[] mapSuit = {"Spades", "Clubs", "Hearts", "Diamonds"};

    public Card() {
        rank = 1;
        suit = 0;
    };

    public int getRank() {
        return this.rank;
    }

    public void setRank(int r) {
        rank = r;
    }

    public int getSuit() {
        return this.suit;
    }

    public void setSuit(int s) {
        if (s >= 0 && s <= 4)
            suit = s;
    }

    public void drawCard() {
        // int = (int)(Math.random() * (max - min + 1) + min);
        suit = (int)(Math.random() * (3 - 0 + 1) + 0);
        rank = (int)(Math.random() * (13 - 1 + 1) + 1);
    }

    @Override       
    public String toString() {
        return "" + mapRank[this.rank - 1] + " of " + mapSuit[this.suit];
    }

    public boolean equals(Object that) {
        if (this == that)
            return true;
        if (!(that instanceof Card))
            return false;
        if (((Card)that).getRank() == getRank())
            return true;
        return false;
    }

    @Override
    public int compareTo(Card that) {
        return Integer.compare(getRank(), that.getRank());
    }
}