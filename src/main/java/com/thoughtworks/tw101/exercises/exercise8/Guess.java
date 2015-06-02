package com.thoughtworks.tw101.exercises.exercise8;

import java.util.Scanner;

/**
 * Created by cannon on 5/30/15.
 */
public class Guess {

    private int guess;
    private Scanner scanner;

    /**
     * @throws NumberFormatException from setGuess(),
     *                               which attempts to parse user input from a String to an Integer
     */
    public Guess() throws NumberFormatException {
        scanner = new Scanner(System.in);
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
        System.out.print("Enter your guess: ");

        input = scanner.next();
        guess = Integer.parseInt(input);
    }
}
