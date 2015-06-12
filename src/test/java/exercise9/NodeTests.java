package exercise9;

import com.thoughtworks.tw101.exercises.exercise9.Node;
import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created by cannon on 6/11/15.
 */
public class NodeTests {

    @Test
    public void shouldReturnNamesOfAllNodesInAlphabeticalOrder() {
        Node root = new Node("Cecil");

        root.add("Michelle");
        root.add("Bill");

        assertThat(root.names().get(0), is("Bill"));
        assertThat(root.names().get(1), is("Cecil"));
        assertThat(root.names().get(2), is("Michelle"));
    }
}
