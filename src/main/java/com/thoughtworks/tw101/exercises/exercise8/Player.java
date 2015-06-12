package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
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
        Guess guess = getNewGuess();
        guesses.add(guess);
        return guess.getGuess();
    }

    public Guess getNewGuess() {
        return new Guess(new BufferedReader(new InputStreamReader(System.in)), System.out);
    }

    public void printGuesses(PrintStream printStream) {
        String output = "You guessed: ";

        for (Guess guess : guesses) {
            output = output.concat(guess.getGuess() + " ");
        }

        printStream.println(output);
    }
}
