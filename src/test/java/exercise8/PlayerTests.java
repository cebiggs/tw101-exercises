package exercise8;

import com.thoughtworks.tw101.exercises.exercise8.Guess;
import com.thoughtworks.tw101.exercises.exercise8.Player;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cannon on 6/11/15.
 */
public class PlayerTests {
    /**
     * Current implementation of Player class is not easily testable.
     * Needs to be refactored.
     */
//    @Test
//    public void shouldPrintPlayerGuesses() {
//        BufferedReader bufferedReader = mock(BufferedReader.class);
//        PrintStream printStream = mock(PrintStream.class);
//
//        try {
//            when(bufferedReader.readLine()).thenReturn("4").thenReturn("5").thenReturn("6");
//        } catch (IOException e) {
//            assert(false);
//        }
//
//        Guess guess = new Guess( bufferedReader, printStream );
//        Player player = new Player();
//
//        when(player.getNewGuess()).thenReturn(guess);
//
//        verify(printStream).println("You guessed: 4 5 6 ");
//    }
}
