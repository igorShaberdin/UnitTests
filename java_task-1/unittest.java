

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class unittest {

        @Test
        public void shouldReturnCorrectValue() {
            assertEquals(1, Solution.getMetreFromCentimetre(100), 0);
        }

        @Test
        public void shouldReturnZeroValue() {
            assertEquals(0, Solution.getMetreFromCentimetre(0), 0);
        }

        @Test
        public void shouldReturnFloatValue() {
            assertEquals(1, Solution.getMetreFromCentimetre(105), 0.000001);
        }

    }

