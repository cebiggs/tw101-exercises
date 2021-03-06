package exercise6;

import com.thoughtworks.tw101.exercises.exercise6.Troll;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by cannon on 6/10/15.
 */
public class TrollTests {

    Troll troll;

    @Before
    public void setUp() {
        troll = new Troll(40);
    }

    @Test
    public void shouldOnlyTakeHalfDamage() {
        troll.takeDamage(10);
        assertThat(troll.currentHitpoints(), is(35));
    }

    @Test
    public void shouldSetName() {
        assertThat(troll.name(), is("Troll"));
    }

    @Test
    public void shouldReturnCurrentHitpoints() {
        assertThat(troll.currentHitpoints(), is(40));
    }
}
