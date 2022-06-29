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
        Main.printOut(" ");
        assertEquals("""
                Colors{title='RED'}
                Colors{title='ORANGE'}
                Colors{title='YELLOW'}
                Colors{title='GREEN'}
                Colors{title='BLUE'}
                Colors{title='INDIGO'}
                Colors{title='VIOLET'}
                """, outContent.toString());
    }
}