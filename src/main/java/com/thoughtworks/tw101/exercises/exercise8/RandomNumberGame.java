package com.thoughtworks.tw101.exercises.exercise8;

import java.io.PrintStream;

/**
 * Created by cannon on 5/30/15.
 */
public class RandomNumberGame {

    private int randomNumber;
    private Player player;
    private boolean didWin;
    private boolean gameOver;
    private PrintStream printStream;

    public RandomNumberGame(Player player, PrintStream printStream) {
        this.player = player;
        this.printStream = printStream;
        didWin = false;
        gameOver = false;

        setUpGame();
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public boolean getDidWin() {
        return didWin;
    }

    private void setDidWin(boolean didWin) {
        this.didWin = didWin;
    }

    public boolean getGameOver() {
        return gameOver;
    }

    private void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public void playGame() {

        while (!getGameOver()) {
            int userGuess;

            try {
                userGuess = getUserGuess();
            } catch (NumberFormatException e) {
                printStream.println("Please enter a number.");
                continue;
            }

            checkGuess(userGuess);
        }
    }

    public void checkGuess(int guess) {
        if (guess == randomNumber) {
            setDidWin(true);
            endGame();
        } else if (guess > randomNumber) {
            printStream.println("Your guess was too high!\n");
        } else {
            printStream.println("Your guess was too low!\n");
        }
    }

    private void setUpGame() {
        randomNumber = generateRandomNumber();

        printStream.println("Welcome to the Random Number Game!");
        printStream.println("A random number has been chosen between 1 and 100.  Try to guess the number!\n");
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    /**
     * gets user's next guess
     *
     * @return user's guess
     * @throws NumberFormatException from parsing user input into an Integer,
     *                               done in the Guess class
     */
    private int getUserGuess() throws NumberFormatException {
        return player.guess();
    }

    private void endGame() {
        setGameOver(true);
        printStream.printf("You won!! The number was %d\n", randomNumber);
        player.printGuesses(System.out);
    }
}