import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void shouldReturnCorrectValue() {
        assertEquals(105, Main.convertEurToUsd(100, 0), 0);
    }

    @Test
    void shouldReturnZeroValue() {
        assertEquals(0, Main.convertEurToUsd(0, 0), 0);
    }

    @Test
    void shouldReturnFloatValue() {
        assertEquals(110.25, Main.convertEurToUsd(105, 0), 0.000001);
    }
}