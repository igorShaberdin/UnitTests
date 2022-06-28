
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
        Main.printOut("Мам", "Мыл", "Рам");
        assertEquals("МылРамМам\n" +
                "РамМамМыл\n" +
                "МамМылРам\n" +
                "МылРамМам\n" +
                "РамМамМыл\n" +
                "МамМылРам\n", outContent.toString());
    }
}