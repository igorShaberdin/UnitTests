import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void addTenPercent() {
        assertEquals(110,Main.addTenPercent(100), 0);
    }
}