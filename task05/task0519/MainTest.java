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
        Main.circle();
        assertEquals("Circle{centerX=22, centerY=23, radius=3.0, width=0, color='null'}", outContent.toString());
    }
}

