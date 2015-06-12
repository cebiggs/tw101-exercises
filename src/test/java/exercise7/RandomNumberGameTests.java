package exercise7;

import com.thoughtworks.tw101.exercises.exercise7.Player;
import com.thoughtworks.tw101.exercises.exercise7.RandomNumberGame;
import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by cannon on 6/10/15.
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
        when(player.guess()).thenReturn(randomNumber);
        randomNumberGame.playGame();
        assertThat(randomNumberGame.getDidWin(), is(true));
    }

    @Test
    public void shouldPrintTooHighIfPlayerGuessesHigherThanCorrectNumber() {

    }

    @Test
    public void shouldPrintTooLowIfPlayerGuessesLowerThanCorrectNumber() {

    }

    @Test
    public void shouldEndGameWhenPlayerWins() {

    }
}
