import org.junit.jupiter.api.Test;

import static com.sun.tools.javac.main.Option.S;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void printString() {
        assertEquals("Olla world", Main.printString(String.valueOf(S)));
    }
}