package com.thoughtworks.tw101.exercises.exercise7;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * Created by cannon on 5/30/15.
 */
public class RandomNumberGame {

    private int randomNumber;
    private boolean didWin = false;
    private Player player;
    private PrintStream printStream;


    public RandomNumberGame(Player player, PrintStream printStream) {
        this.player = player;
        this.printStream = printStream;

        setUpGame();
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public boolean getDidWin() {
        return didWin;
    }

    public void playGame() {

        while ( !didWin ) {
            int userGuess = getUserGuess();
            checkGuess(userGuess);
        }
        endGame();
    }

    private void setUpGame() {
        randomNumber = generateRandomNumber();

        printStream.println("Welcome to the Random Number Game!");
        printStream.println("A random number has been chosen between 1 and 100.  Try to guess the number!\n");
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }

    private int getUserGuess() {
        return player.guess();
    }

    private void checkGuess(int guess) {
        if ( guess == randomNumber ) {
            didWin = true;
        }
        else if ( guess > randomNumber ) {
            printStream.println("Your guess was too high!\n");
        }
        else {
            printStream.println("Your guess was too low!\n");
        }
    }

    private void endGame() {
        printStream.printf("You won!! The number was %d", randomNumber);
    }
}