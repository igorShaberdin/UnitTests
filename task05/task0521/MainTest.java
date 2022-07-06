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
        Main.figur();
        assertEquals("6.0 7.0 3.0\n" +
                "10.0 5.0 15.0\n", outContent.toString());
    }
}

