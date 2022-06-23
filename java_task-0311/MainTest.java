import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void writeToConsole() {
        assertEquals("printing: Hello world", Main.writeToConsole("Hello world"));
    }
}