package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by cannon on 5/30/15.
 */
public class RandomNumberGame {

    private int randomNumber;
    Player player;
    private boolean didWin = false;


    public RandomNumberGame() {
        setUpGame();
    }

    public void playGame() {

        while ( !didWin ) {
            int userGuess = getUserGuess();
            checkGuess(userGuess);
        }
        endGame();
    }

    private void setUpGame() {
        player = new Player();
        randomNumber = generateRandomNumber();

        System.out.println("Welcome to the Random Number Game!");
        System.out.println("A random number has been chosen between 1 and 100.  Try to guess the number!\n");
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }

    private int getUserGuess() {
        Guess guess = new Guess();
        return guess.getGuess();
    }

    private void checkGuess(int guess) {
        if ( guess == randomNumber ) {
            didWin = true;
        }
        else if ( guess > randomNumber ) {
            System.out.println("Your guess was too high!\n");
        }
        else {
            System.out.println("Your guess was too low!\n");
        }
    }

    private void endGame() {
        System.out.printf("You won!! The number was %d", randomNumber);
    }
}