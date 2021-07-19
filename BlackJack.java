// File name: Blackjack.java
// Author: Kori Reine
// Date last modified: 2/12/2021
// Description: Class to set up the BlackJack card game

public class BlackJack implements CardGame {
    // Member variables
    private int turnNumber;
    private Card player1Card1;
    private Card player1Card2;
    private Card player2Card1;
    private Card player2Card2;
    private int player1Wins;
    private int player2Wins;
    private int numOfTies;

    // Constructor
    public BlackJack() {
        player1Card1 = new Card();
        player1Card2 = new Card();
        player2Card1 = new Card();
        player2Card2 = new Card();
    }

    // Member functions from interface
    @Override
    public void setupGame() {
        System.out.println("Shall we play a game? (" + getClass().getName() + ")");
        System.out.println();
        turnNumber = 0;
        player1Wins = 0;
        player2Wins = 0;
        numOfTies = 0;
    } 

    @Override
    public void runSimulation() {
        for (int i = 0; i < 4; i++) {
            playTurn();
        }
    }

    @Override
    public void playTurn() {
        player1Card1.drawCard();
        player1Card2.drawCard();
        player2Card1.drawCard();
        player2Card2.drawCard();
        System.out.println("Draw #" + (turnNumber + 1) + ": " + player1Card1 + " and " + player1Card2 + 
            " versus " + player2Card1 + " and " + player2Card2);

        if ((player1Card1.getRank() + player1Card2.getRank()) > (player2Card1.getRank() + player2Card2.getRank())) {
            System.out.println(" Player 1 wins.");
            player1Wins++;
        }
        else if ((player2Card1.getRank() + player2Card2.getRank()) > (player1Card1.getRank() + player1Card2.getRank())) {
            System.out.println(" Player 2 wins.");
            player2Wins++;
        }
        else {
            System.out.println(" It's a tie!");
            numOfTies++;
        }
        turnNumber++;
    }

    @Override
    public void printResults() {
        System.out.println("The game ran for " + turnNumber + " turns.");
        System.out.println("Player 1 won " + player1Wins + " times.");
        System.out.println("Player 2 won " + player2Wins + " times.");
        System.out.println("Players tied " + numOfTies + " time(s).");
    }
}