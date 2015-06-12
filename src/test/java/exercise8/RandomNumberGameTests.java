package exercise8;

import com.thoughtworks.tw101.exercises.exercise8.Player;
import com.thoughtworks.tw101.exercises.exercise8.RandomNumberGame;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cannon on 6/11/15.
 */
public class RandomNumberGameTests {

    private RandomNumberGame randomNumberGame;
    private PrintStream printStream;
    private Player player;

    @Before
    public void setUp() {
        player = mock(Player.class);
        printStream = mock(PrintStream.class);
        randomNumberGame = new RandomNumberGame(player, printStream);
    }

    @Test
    public void shouldGenerateRandomNumberBetween1And100() {
        assertThat(randomNumberGame.getRandomNumber(), is(both(greaterThanOrEqualTo(1)).and(lessThanOrEqualTo(100))));
    }

    @Test
    public void shouldBeAWinIfPlayerGuessesCorrectNumber() {
        int randomNumber = randomNumberGame.getRandomNumber();
        randomNumberGame.checkGuess(randomNumber);
        assertThat(randomNumberGame.getDidWin(), is(true));
    }

    @Test
    public void shouldNotBeAWinIfPlayerGuessesWrongNumber() {
        int randomNumber = randomNumberGame.getRandomNumber();
        randomNumberGame.checkGuess(randomNumber+1);
        assertThat(randomNumberGame.getDidWin(), is(false));
    }

    @Test
    public void shouldPrintTooHighIfPlayerGuessesHigherThanCorrectNumber() {
        int randomNumber = randomNumberGame.getRandomNumber();
        randomNumberGame.checkGuess(randomNumber+1);
        verify(printStream).println("Your guess was too high!\n");
    }

    @Test
    public void shouldPrintTooLowIfPlayerGuessesLowerThanCorrectNumber() {
        int randomNumber = randomNumberGame.getRandomNumber();
        randomNumberGame.checkGuess(randomNumber-1);
        verify(printStream).println("Your guess was too low!\n");
    }

    @Test
    public void shouldNotEndGameIfUserHasNotWon() {
        int randomNumber = randomNumberGame.getRandomNumber();
        randomNumberGame.checkGuess(randomNumber - 1);
        assertThat(randomNumberGame.getGameOver(), is(false));
    }

    @Test
    public void shouldEndGameWhenPlayerWins() {
        int randomNumber = randomNumberGame.getRandomNumber();
        randomNumberGame.checkGuess(randomNumber);
        assertThat(randomNumberGame.getGameOver(), is(true));
    }
}
