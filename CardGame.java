// File name: CardGame.java
// Author: Kori Reine
// Date last modified: 2/12/2021
// Description: Template interface for War and BlackJack games

public interface CardGame {
    // Print welcome message and initialize variables
    public void setupGame(); 

    // Calls the other functions to run the entire game
    public void runSimulation();

    // Sets up the game and decides winner
    public void playTurn();

    // Print the details of wins, losses, and number of turns
    public void printResults();
}
