package ayoub.impl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArraysTest {

    private Arrays<String> arrays;

    @BeforeEach
    void setUp() {
        arrays = new Arrays<>(5);
    }

    @Test
    void testAddAndLen() {
        arrays.add("apple");
        arrays.add("banana");
        assertEquals(2, arrays.len());
    }

    @Test
    void testContains() {
        arrays.add("car");
        assertTrue(arrays.contains("car"));
        assertFalse(arrays.contains("bus"));
    }

    @Test
    void testDeleteExistingElement() {
        arrays.add("x");
        arrays.add("y");
        assertTrue(arrays.delete("x"));
        assertEquals(1, arrays.len());
        assertFalse(arrays.contains("x"));
    }

    @Test
    void testDeleteNonExistingElement() {
        arrays.add("one");
        assertFalse(arrays.delete("two"));
        assertEquals(1, arrays.len());
    }

    @Test
    void testGetValidIndex() {
        arrays.add("hello");
        assertEquals("hello", arrays.get(0));
    }

    @Test
    void testGetInvalidIndex() {
        arrays.add("world");
        assertNull(arrays.get(5)); // Out of bounds
    }

    @Test
    void testSetValidIndex() {
        arrays.add("old");
        arrays.set(0, "new");
        assertEquals("new", arrays.get(0));
    }

    @Test
    void testSetInvalidIndex() {
        arrays.add("item");
        arrays.set(5, "fail"); // Should print an error
        assertEquals("item", arrays.get(0)); // no change
    }

    @Test
    void testIndexOf() {
        arrays.add("find");
        assertEquals(0, arrays.indexOf("find"));
        assertEquals(-1, arrays.indexOf("notHere"));
    }

    @Test
    void testIsEmpty() {
        assertTrue(arrays.isEmpty());
        arrays.add("one");
        assertFalse(arrays.isEmpty());
    }
}
