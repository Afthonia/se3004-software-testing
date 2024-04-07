package se3004;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    @Test
    void nullArrayReturnsNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
           Counting.countClumps(null);
        });
    }

    @Test
    void emptyArrayReturnsZero() {
        assertEquals(0, Counting.countClumps(new int[]{}));
    }

    @Test
    void oneClumpReturnsOne() {
        assertEquals(1, Counting.countClumps(new int[]{7,7,7,7,7}));
    }

    @Test
    void twoClumpReturnsTwo() {
        assertEquals(2, Counting.countClumps(new int[]{7,7,6,7,7}));
    }

    @Test
    void threeClumpReturnsThree() {
        assertEquals(3, Counting.countClumps(new int[]{7,7,6,6,7,7}));
    }

    @Test
    void fourClumpReturnsFour() {
        assertEquals(4, Counting.countClumps(new int[]{7,7,6,6,6,7,7,6,6}));
    }
}