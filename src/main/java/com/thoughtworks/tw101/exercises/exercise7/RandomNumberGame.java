package com.thoughtworks.tw101.exercises.exercise7;

import java.io.PrintStream;

/**
 * Created by cannon on 5/30/15.
 */
public class RandomNumberGame {

    private int randomNumber;
    private boolean didWin;
    private boolean gameOver;
    private Player player;
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


    public void checkGuess(int guess) {
        if ( guess == randomNumber ) {
            setDidWin(true);
            endGame();
        }
        else if ( guess > randomNumber ) {
            printStream.println("Your guess was too high!\n");
        }
        else {
            printStream.println("Your guess was too low!\n");
        }
    }

    public void playGame() {

        while ( !getGameOver() ) {
            int userGuess = getUserGuess();
            checkGuess(userGuess);
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

    private int getUserGuess() {
        return player.guess();
    }

    private void endGame() {
        setGameOver(true);
        printStream.printf("You won!! The number was %d", randomNumber);
    }
}