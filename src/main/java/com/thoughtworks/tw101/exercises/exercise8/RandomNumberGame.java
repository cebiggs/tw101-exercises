package com.thoughtworks.tw101.exercises.exercise8;

/**
 * Created by cannon on 5/30/15.
 */
public class RandomNumberGame {

    private int randomNumber;
    private Player player;
    private boolean didWin = false;


    public RandomNumberGame() {

        setUpGame();
    }

    public void playGame() {

        while (!didWin) {
            int userGuess;

            try {
                userGuess = getUserGuess();
            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
                continue;
            }

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

    /**
     * gets user's next guess
     *
     * @return user's guess
     * @throws NumberFormatException from parsing user input into an Integer,
     *                               done in the Guess class
     */
    private int getUserGuess() throws NumberFormatException {
        return player.guess();
    }

    private void checkGuess(int guess) {
        if (guess == randomNumber) {
            didWin = true;
        } else if (guess > randomNumber) {
            System.out.println("Your guess was too high!\n");
        } else {
            System.out.println("Your guess was too low!\n");
        }
    }

    private void endGame() {
        System.out.printf("You won!! The number was %d\n", randomNumber);
        player.printGuesses();
    }
}