import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnCorrectValue() {
        assertEquals(100, Main.getCountSecondsPassedInCurrentHour(100), 0);
    }

    @Test
    void shouldReturnZeroValue() {
        assertEquals(0, Main.getCountSecondsPassedInCurrentHour(0), 0);
    }
}