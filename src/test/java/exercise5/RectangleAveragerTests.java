package exercise5;

import com.thoughtworks.tw101.exercises.exercise5.Rectangle;
import com.thoughtworks.tw101.exercises.exercise5.RectangleAverager;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by cannon on 6/10/15.
 */
public class RectangleAveragerTests {

    @Test
    public void shouldCalculateAverageRectangleArea() {
        Rectangle[] rectangles = {
                new Rectangle(2, 3),
                new Rectangle(3, 4),
                new Rectangle(4, 5),
                new Rectangle(5, 6),
                new Rectangle(6, 7)
        };

        RectangleAverager rectangleAverager = new RectangleAverager();

        float average = rectangleAverager.averageArea(rectangles);
        assertThat(rectangleAverager.averageArea(rectangles), is(22f));
    }
}
