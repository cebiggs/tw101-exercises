package exercise3;

/**
 * Created by cannon on 6/8/15.
 */

import com.thoughtworks.tw101.exercises.exercise3.OddSum;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class OddSumTests {

    @Test
    public void shouldReturnSumOfAllOddIntegersBetweenStartingAndEndingValue() {
        OddSum oddSum = new OddSum();
        assertThat(oddSum.of(1, 10), is(25));
    }
}
