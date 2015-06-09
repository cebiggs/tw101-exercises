package exercise2;

/**
 * Created by cannon on 6/8/15.
 */
import com.thoughtworks.tw101.exercises.exercise2.Accumulator;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;

public class AccumulatorTests {

    @Test
    public void shouldIncrementNumOfCallsWhenCallIncrementMethod() {
        Accumulator accumulator = new Accumulator();
        accumulator.increment();
        assertThat(accumulator.numOfCalls, is(1));
    }

    @Test
    public void shouldPrintTotalNumOfCallsWhenCallTotalMethod() {

    }
}
