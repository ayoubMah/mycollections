package ACollection.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyArrayTest {

    private MyArray<String> myArray;

    @BeforeEach
    void setUp() {
        myArray = new MyArray<>(5);
    }

    @Test
    void testAddAndLen() {
        myArray.add("apple");
        myArray.add("banana");
        assertEquals(2, myArray.len());
    }

    @Test
    void testContains() {
        myArray.add("car");
        assertTrue(myArray.contains("car"));
        assertFalse(myArray.contains("bus"));
    }

    @Test
    void testDeleteExistingElement() {
        myArray.add("x");
        myArray.add("y");
        assertTrue(myArray.delete("x"));
        assertEquals(1, myArray.len());
        assertFalse(myArray.contains("x"));
    }

    @Test
    void testDeleteNonExistingElement() {
        myArray.add("one");
        assertFalse(myArray.delete("two"));
        assertEquals(1, myArray.len());
    }

    @Test
    void testGetValidIndex() {
        myArray.add("hello");
        assertEquals("hello", myArray.get(0));
    }

    @Test
    void testGetInvalidIndex() {
        myArray.add("world");
        assertNull(myArray.get(5)); // Out of bounds
    }

    @Test
    void testSetValidIndex() {
        myArray.add("old");
        myArray.set(0, "new");
        assertEquals("new", myArray.get(0));
    }

    @Test
    void testSetInvalidIndex() {
        myArray.add("item");
        myArray.set(5, "fail"); // Should print an error
        assertEquals("item", myArray.get(0)); // no change
    }

    @Test
    void testIndexOf() {
        myArray.add("find");
        assertEquals(0, myArray.indexOf("find"));
        assertEquals(-1, myArray.indexOf("notHere"));
    }

    @Test
    void testIsEmpty() {
        assertTrue(myArray.isEmpty());
        myArray.add("one");
        assertFalse(myArray.isEmpty());
    }
}
