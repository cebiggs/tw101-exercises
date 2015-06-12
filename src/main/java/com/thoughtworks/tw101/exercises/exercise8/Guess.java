package com.thoughtworks.tw101.exercises.exercise8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by cannon on 5/30/15.
 */
public class Guess {

    private int guess;
    private BufferedReader bufferedReader;
    private PrintStream printStream;

    /**
     * @throws NumberFormatException from setGuess(),
     *                               which attempts to parse user input from a String to an Integer
     */
    public Guess(BufferedReader bufferedReader, PrintStream printStream) throws NumberFormatException {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        setGuess();
    }

    public int getGuess() {
        return guess;
    }


    /**
     * setGuess() takes in user input as a String and converts
     * it to an integer that is the user's next guess.
     *
     * @throws NumberFormatException thrown because of parsing
     *                               an Integer from a String from user input
     */
    private void setGuess() throws NumberFormatException {
        String input;
        printStream.print("Enter your guess: ");

        try {
            input = bufferedReader.readLine();
            guess = Integer.parseInt(input);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
