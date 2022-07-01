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
        Main.inTrend.checkNumber();
        assertEquals("8\n" +
                "88\n" +
                "888\n" +
                "8888\n" +
                "88888\n" +
                "888888\n" +
                "8888888\n" +
                "88888888\n" +
                "888888888\n" +
                "8888888888\n", outContent.toString());
    }
}