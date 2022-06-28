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
    void printOut() {
        Main.printOut("nowhere", "somewhere");
        assertEquals("It's Windows path: nowhere\n" +
                "It's Java string: somewhere", outContent.toString());
    }
}

