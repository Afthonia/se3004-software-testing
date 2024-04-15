package se3004;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    @Test
    @DisplayName("Null Will Return NullPointerException")
    void nullArrayReturnsNullPointerException() {
        assertThrows(NullPointerException.class, () -> {
           Counting.countClumps(null);
        });
        System.out.println("Test 1 Passed!");
    }

    @Test
    @DisplayName("Empty Array Will Return 0")
    void emptyArrayReturnsZero() {
        assertEquals(0, Counting.countClumps(new int[]{}));
        System.out.println("Test 2 Passed!");
    }

    @Test
    @DisplayName("One Clump Will Return 1")
    void oneClumpReturnsOne() {
        assertEquals(1, Counting.countClumps(new int[]{7,7,7,7,7}));
        System.out.println("Test 3 Passed!");
    }

    @Test
    @DisplayName("Two Clump Will Return 2")
    void twoClumpsReturnsTwo() {
        assertEquals(2, Counting.countClumps(new int[]{7,7,6,7,7}));
        System.out.println("Test 4 Passed!");
    }

    @Test
    @DisplayName("Three Clumps Will Return 3")
    void threeClumpsReturnsThree() {
        assertEquals(3, Counting.countClumps(new int[]{7,7,6,6,7,7}));
        System.out.println("Test 5 Passed!");
    }

    @Test
    @DisplayName("Four Clumps Will Return 4")
    void fourClumpReturnsFour() {
        assertEquals(4, Counting.countClumps(new int[]{7,7,6,6,6,7,7,6,6}));
        System.out.println("Test 6 Passed!");
    }
}