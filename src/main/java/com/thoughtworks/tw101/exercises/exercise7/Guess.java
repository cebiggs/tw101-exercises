package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by cannon on 5/30/15.
 */
public class Guess {

    private int guess;
    private Scanner scanner;

    public Guess() {
        scanner = new Scanner(System.in);
        setGuess();
    }

    public int getGuess() {
        return guess;
    }

    private void setGuess() {
        String input;
        System.out.print("Enter your guess: ");

        input = scanner.next();
        guess = Integer.parseInt(input);
    }
}
