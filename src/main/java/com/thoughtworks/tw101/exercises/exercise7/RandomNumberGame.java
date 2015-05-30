package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by cannon on 5/30/15.
 */
public class RandomNumberGame {

    private int randomNumber;
    private boolean didWin = false;

    public void runGame() {
        int userGuess = -1;
        boolean tooHigh = false;

        setUpGame();

        while ( !didWin ) {
            userGuess = getUserGuess();
            tooHigh = checkGuess(userGuess);

            if (didWin) {
                break;
            }

            if ( tooHigh ) {
                System.out.println("Your guess was too high!  Guess again.");
            }
            else
                System.out.println("Your guess was too low!  Guess again.");
        }

        System.out.printf("You won!! The number was: %d\n", randomNumber);

    }

    /**
     * Set up game
     */
    private void setUpGame() {
        randomNumber = generateRandomNumber();
        System.out.println("Welcome to the Random Number Game!! The most fun you've had in a while.");
        System.out.print("Enter a guess: ");
    }

    private int generateRandomNumber() {
        return (int) (Math.random() * 100);
    }

    private int getUserGuess() {
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }

    private boolean checkGuess(int guess) {
        if ( guess == randomNumber ) {
            didWin = true;
        }
        else if ( guess > randomNumber ) {
            return true;
        }
        return false;
    }
}
