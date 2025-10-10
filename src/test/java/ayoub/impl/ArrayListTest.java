package ayoub.impl;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {

    private ArrayList<Integer> list;

    @BeforeEach
    void setUp() {
        list = new ArrayList<>();
    }

    @Test
    void testIsEmptyInitially() {
        assertTrue(list.isEmpty());
        assertEquals(0, list.size());
    }

    @Test
    void testAddElements() {
        assertTrue(list.add(10));
        assertTrue(list.add(20));
        assertEquals(2, list.size());
        assertFalse(list.isEmpty());
    }

    @Test
    void testGetElement() {
        list.add(5);
        list.add(15);
        assertEquals(5, list.get(0));
        assertEquals(15, list.get(1));
    }

    @Test
    void testSetElement() {
        list.add(1);
        list.add(2);
        list.set(0, 100);
        assertEquals(100, list.get(0));
    }

    @Test
    void testIndexOfElement() {
        list.add(99);
        list.add(100);
        list.add(101);
        assertEquals(1, list.indexOf(100));
        assertEquals(-1, list.indexOf(999));
    }

    @Test
    void testContains() {
        list.add(7);
        list.add(14);
        assertTrue(list.contains(7));
        assertFalse(list.contains(21));
    }

    @Test
    void testAddBeyondInitialCapacity() {
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        assertEquals(20, list.size());
        assertEquals(19, list.get(19));
    }

    //TODO later
//    @Test
//    void testGetOutOfBoundsThrows() {
//        list.add(1);
//        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
//            list.get(5);
//        });
//    }
//
//    @Test
//    void testSetOutOfBoundsThrows() {
//        list.add(1);
//        assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
//            list.set(3, 10);
//        });
//    }
}

