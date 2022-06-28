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
                1 2 3 4 5 6 7 8 9 10\s
                2 4 6 8 10 12 14 16 18 20\s
                3 6 9 12 15 18 21 24 27 30\s
                4 8 12 16 20 24 28 32 36 40\s
                5 10 15 20 25 30 35 40 45 50\s
                6 12 18 24 30 36 42 48 54 60\s
                7 14 21 28 35 42 49 56 63 70\s
                8 16 24 32 40 48 56 64 72 80\s
                9 18 27 36 45 54 63 72 81 90\s
                10 20 30 40 50 60 70 80 90 100\s
                """, outContent.toString());
    }
}