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
        Main.printAnswer();
        assertEquals("name= grantfa father= no mother= no\n" +
                "name= grantma father= no mother= no\n" +
                "name= father father= grantfa mother= no\n" +
                "name= mother father= no mother= grantma\n" +
                "name= son father= father mother= mother\n" +
                "name= girl father= father mother= mother\n", outContent.toString());
    }
}