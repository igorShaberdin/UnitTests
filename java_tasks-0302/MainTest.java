import static com.sun.tools.javac.main.Option.S;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void printString() {
        assertEquals("Olla world", Main.printString(String.valueOf(S)));
    }
}