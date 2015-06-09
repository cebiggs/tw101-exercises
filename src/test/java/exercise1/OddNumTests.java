package exercise1;

/**
 * Created by cannon on 6/7/15.
 */

import com.thoughtworks.tw101.exercises.exercise1.OddNum;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

public class OddNumTests {

    @Test
    public void shouldPrintAllOddNumbersFrom1To10AndTheirSum() {
        PrintStream printStream = mock(PrintStream.class);
        OddNum oddNum = new OddNum(1, 10, printStream);
        oddNum.printOddNumListAndSum();

        InOrder inOrder = Mockito.inOrder(printStream, printStream);
        inOrder.verify(printStream).println("1 3 5 7 9");
        inOrder.verify(printStream).println(25);
    }
}
