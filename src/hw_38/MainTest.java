package hw_38;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void testChangeNumToString() {
        // Test Case 1
        List<Integer> ints1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> ints2 = Arrays.asList(5, 2, 3, 8);
        assertEquals(Arrays.asList("No", "Yes", "Yes", "No"), Main.changeNumToString(ints1, ints2));

        // Test Case 2
        ints1 = Arrays.asList(1, 2, 3, 4);
        ints2 = Arrays.asList(1, 2, 3, 4);
        assertEquals(Arrays.asList("Yes", "Yes", "Yes", "Yes"), Main.changeNumToString(ints1, ints2));

        // Test Case 3
        ints1 = Arrays.asList(1, 2, 3);
        ints2 = Arrays.asList(4, 5, 6);
        assertEquals(Arrays.asList("No", "No", "No"), Main.changeNumToString(ints1, ints2));

    }
}