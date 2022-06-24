import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void main() {
    }

    @Test
    void addTenPercent() {
        assertEquals(110,Main.addTenPercent(100), 0.00000001);
    }
}