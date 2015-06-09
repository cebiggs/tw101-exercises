package exercise2;

/**
 * Created by cannon on 6/8/15.
 */

import com.thoughtworks.tw101.exercises.exercise2.Accumulator;
import org.junit.Test;

import java.io.PrintStream;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class AccumulatorTests {

    @Test
    public void shouldIncrementNumOfCallsAndPrintNumOfCalls() {
        PrintStream printStream = mock(PrintStream.class);
        Accumulator accumulator = new Accumulator(printStream);
        accumulator.increment();
        accumulator.total();
        assertThat(accumulator.numOfCalls, is(1));
        verify(printStream).print(1);
    }
}
