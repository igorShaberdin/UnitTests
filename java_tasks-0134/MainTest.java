import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {
    }

    @org.junit.jupiter.api.Test
    void getVolume() {
        assertEquals(100000, Main.getVolume(10, 2, 5), 0);
    }
}
