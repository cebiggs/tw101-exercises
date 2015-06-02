package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

/**
 * Created by cannon on 6/1/15.
 */
public class Player {

    private ArrayList<Guess> guesses;

    public Player() {
        guesses = new ArrayList<Guess>();
    }

    /**
     * gets the user's next guess and adds it to the list of guesses
     *
     * @return the user's next guess
     * @throws NumberFormatException thrown from attempting to parse
     *                               user input from a String to an Integer in the Guess class
     */
    public int guess() throws NumberFormatException {
        Guess guess = new Guess();
        guesses.add(guess);
        return guess.getGuess();
    }

    public void printGuesses() {
        System.out.print("You guessed: ");
        for (Guess guess : guesses) {
            System.out.print(guess.getGuess() + " ");
        }
    }
}
