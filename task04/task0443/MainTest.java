
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @BeforeEach
    void setContent() {
        System.setOut(new PrintStream(outContent));
    }
    @Test
    void testOut() {
        String name = "Fok";
        int[] arr = {1999, 4, 15};
        Main.printOut(name, arr);
        assertEquals("My name is Fok.\n" +
                "I was born in 1999.4.15", outContent.toString());
    }
}