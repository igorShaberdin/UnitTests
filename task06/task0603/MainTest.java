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
    void test() {
        Solution.test(3);
        assertEquals("The object Dog destroyed\n" +
                "The object Dog destroyed\n" + "The object Dog destroyed\n", outContent.toString());
    }
}

