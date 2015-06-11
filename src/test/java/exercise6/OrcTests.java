package exercise6;

import com.thoughtworks.tw101.exercises.exercise6.Orc;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by cannon on 6/10/15.
 */
public class OrcTests {

    private Orc orc;

    @Before
    public void setUp() {
        orc = new Orc(20);
    }

    @Test
    public void shouldTakeFullDamage() {

    }

    @Test
    public void shouldSetName() {

    }

    @Test
    public void shouldReturnCurrentHitpoints() {
        assertThat(orc.currentHitpoints(), is(20));
    }
}
