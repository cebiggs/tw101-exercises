package com.thoughtworks.tw101.exercises.exercise7;

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

    public Guess(BufferedReader bufferedReader, PrintStream printStream) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        setGuess();
    }

    public int getGuess() {
        return guess;
    }

    private void setGuess() {
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
