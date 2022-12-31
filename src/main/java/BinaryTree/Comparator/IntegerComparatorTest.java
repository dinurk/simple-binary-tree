package BinaryTree.Comparator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class IntegerComparatorTest {

    @Test
    @DisplayName("compare test")
    void compare() {
        IntegerComparator comparator = new IntegerComparator();
        assertTrue(comparator.compare(1, 2) < 0);
        assertTrue(comparator.compare(2, 1) > 0);
        assertEquals(0, comparator.compare(2, 2));
    }
}
