package com.thoughtworks.tw101.exercises.exercise7;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created by cannon on 6/1/15.
 */
public class Player {

    public int guess() {
        Guess guess = new Guess(new BufferedReader(new InputStreamReader(System.in)), System.out);
        return guess.getGuess();
    }
}
