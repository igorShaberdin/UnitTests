import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void shouldReturnCorrectValue() {
        assertEquals(1, Main.sumDigitsInNumber(100), 0);
    }
    @Test
    void shouldReturnZeroValue() {
        assertEquals(0, Main.sumDigitsInNumber(0), 0);
    }
}