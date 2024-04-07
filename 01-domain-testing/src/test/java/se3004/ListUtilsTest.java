package se3004;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class ListUtilsTest {
    Random rand = new Random();

    @Test
    @DisplayName("Null Array Will Return NullPointerException No Matter 'len' Value")
    void nullReturnsFalse() {
        assertThrows(NullPointerException.class, () -> {
            ListUtils.sameEnds(null, 1);
        });
        System.out.println("Test 1 Passed!");
    }

    @Test
    @DisplayName("'len' Value Will Return IndexOutOfBoundsException No Matter What Elements The Array Contains")
    void lenBiggerThanArrayReturnsIndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ListUtils.sameEnds(new int[]{1,2,3,1,2,3}, 7);
        });
        System.out.println("Test 2 Passed!");
    }

    @Test
    @DisplayName("Empty Array Will Return True If 'len' Is 0")
    void emptyArrayLen0ReturnsTrue() {
        assertTrue(ListUtils.sameEnds(new int[]{}, 0));
        System.out.println("Test 3 Passed!");
    }

    @Test
    @DisplayName("Empty Array Will Return IndexOutOfBoundsException If 'len' Is Not 0")
    void emptyArrayLenNotZeroReturnsIndexOutOfBoundsException() {
        assertThrows(IndexOutOfBoundsException.class, () -> {
            ListUtils.sameEnds(new int[]{}, rand.nextInt((int)(Double.POSITIVE_INFINITY) - 1) + 1);
        });
        System.out.println("Test 3 Passed!");
    }

    @Test
    @DisplayName("Empty Array Will Return IndexOutOfBoundsException If 'len' Is Not 0")
    void arrayWithDifferentElementsReturnsFalseIfLenIsNotItsLength() {
        int[] arr = new int[]{43,5456,64,14,45};
        assertFalse(ListUtils.sameEnds(arr, rand.nextInt(arr.length)));
        System.out.println("Test 3 Passed!");
    }

    @Test
    @DisplayName("Empty Array Will Return IndexOutOfBoundsException If 'len' Is Not 0")
    void arrayReturnsTrueIfLenIsItsLength() {
        int[] arr = new int[]{43,67,534,35,43};
        assertTrue(ListUtils.sameEnds(arr, arr.length));
        System.out.println("Test 3 Passed!");
    }
}