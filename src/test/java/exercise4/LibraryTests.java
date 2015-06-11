package exercise4;

import com.thoughtworks.tw101.exercises.exercise4.Library;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;

/**
 * Created by cannon on 6/10/15.
 */
public class LibraryTests {

    @Test
    public void shouldPrintAllBooksContainingString() {
        String[] books = {
                "Harry Potter and the Sorcerer's Stone",
                "An Introduction to Pottery",
                "Sorcerer Intro",
                "To the Stone-Cutters"
        };

        PrintStream printStream = mock(PrintStream.class);
        Library library = new Library(books, printStream);

        library.printBooksContaining("Potter");

        InOrder inOrder = Mockito.inOrder(printStream, printStream);
        inOrder.verify(printStream).println("Harry Potter and the Sorcerer's Stone");
        inOrder.verify(printStream).println("An Introduction to Pottery");
    }

}
