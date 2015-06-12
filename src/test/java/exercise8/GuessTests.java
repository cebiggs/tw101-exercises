package exercise8;

import com.thoughtworks.tw101.exercises.exercise8.Guess;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by cannon on 6/11/15.
 */
public class GuessTests {

    @Test
    public void shouldReadInGuess() {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        PrintStream printStream = mock(PrintStream.class);

        try {
            when(bufferedReader.readLine()).thenReturn("4");
        } catch (IOException e) {
            assert(false);
        }

        Guess guess = new Guess( bufferedReader, printStream );
        assertThat(guess.getGuess(), is(4));
    }
}
