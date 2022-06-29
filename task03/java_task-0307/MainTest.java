
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
        assertEquals("Zerg{name='David', id=1}\n" +
                "Zerg{name='David', id=2}\n" +
                "Zerg{name='David', id=3}\n" +
                "Zerg{name='David', id=4}\n" +
                "Zerg{name='David', id=5}\n" +
                "Zerg{name='David', id=6}\n" +
                "Zerg{name='David', id=7}\n" +
                "Zerg{name='David', id=8}\n" +
                "Zerg{name='David', id=9}\n" +
                "Zerg{name='David', id=10}\n" +
                "Protos{name='John', id=1}\n" +
                "Protos{name='John', id=2}\n" +
                "Protos{name='John', id=3}\n" +
                "Protos{name='John', id=4}\n" +
                "Protos{name='John', id=5}\n" +
                "Terran{name='Bill', id=1}\n" +
                "Terran{name='Bill', id=2}\n" +
                "Terran{name='Bill', id=3}\n" +
                "Terran{name='Bill', id=4}\n" +
                "Terran{name='Bill', id=5}\n" +
                "Terran{name='Bill', id=6}\n" +
                "Terran{name='Bill', id=7}\n" +
                "Terran{name='Bill', id=8}\n" +
                "Terran{name='Bill', id=9}\n" +
                "Terran{name='Bill', id=10}\n" +
                "Terran{name='Bill', id=11}\n" +
                "Terran{name='Bill', id=12}\n", outContent.toString());
    }
}