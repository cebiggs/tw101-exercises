package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Scanner;

/**
 * Created by cannon on 5/30/15.
 */
public class Guess {

    private int guess;

    public Guess() {
        setGuess();
    }

    public int getGuess() {
        return guess;
    }

    private void setGuess() {
        System.out.print("Enter your guess: ");
        Scanner in = new Scanner(System.in);
        guess = in.nextInt();
    }
}
