import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {
    @Test
    void oneToAnother(){
        Main calculator = new Main();
        assertEquals(3600,calculator.convertToSeconds(1));
    }

}