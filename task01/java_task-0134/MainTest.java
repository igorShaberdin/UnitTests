import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void compareTest() {
        assertEquals(150000, Main.getVolume(10, 5, 3));
    }
}