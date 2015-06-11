package exercise5;

import com.thoughtworks.tw101.exercises.exercise5.Rectangle;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by cannon on 6/10/15.
 */
public class RectangleTests {

    @Test
    public void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle(2, 3);
        assertThat(rectangle.area(), is(6));
    }
}
