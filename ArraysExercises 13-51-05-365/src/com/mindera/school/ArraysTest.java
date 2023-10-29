package com.mindera.school;


import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

class ArraysTest {
    private Arrays exercises = new Arrays();

    @Test
    void getNegativeNumbers() {
        assertEquals(0, exercises.getNegativeNumbers(new int[]{}));
        assertEquals(0, exercises.getNegativeNumbers(new int[]{1, 18, 30, 2, 25, 35}));
        assertEquals(1, exercises.getNegativeNumbers(new int[]{1, -1, 30, 2, 25, 35}));
        assertEquals(2, exercises.getNegativeNumbers(new int[]{1, 18, 30, -30, 25, 35, -49}));
        assertEquals(3, exercises.getNegativeNumbers(new int[]{-1, 18, -20, 2, 25, -35}));
    }

    @Test
    void getNumberOfTimes() {
        assertEquals(0, exercises.getNumberOfTimes(new int[]{}, 3));
        assertEquals(0, exercises.getNumberOfTimes(new int[]{1, 18, 30, 2, 25, 35}, 3));
        assertEquals(1, exercises.getNumberOfTimes(new int[]{1, 18, 3, 30, 2, 25, 35}, 3));
        assertEquals(2, exercises.getNumberOfTimes(new int[]{1, 18, 3, 30, 2, 25, 35, 3}, 3));
        assertEquals(3, exercises.getNumberOfTimes(new int[]{1, 3, 18, 30, 3, 2, 25, 35, 3}, 3));
    }

    @Test
    void getBooleanArray() {
        assertArrayEquals(new boolean[]{}, exercises.getBooleanArray(new int[]{}));
        assertArrayEquals(new boolean[]{true, true, true, true, true, true}, exercises.getBooleanArray(new int[]{1, 18, 30, 2, 25, 35}));
        assertArrayEquals(new boolean[]{true, false, true, true, true, true}, exercises.getBooleanArray(new int[]{1, -1, 30, 2, 25, 35}));
        assertArrayEquals(new boolean[]{true, true, true, false, true, true, false}, exercises.getBooleanArray(new int[]{1, 18, 30, -30, 25, 35, -49}));
        assertArrayEquals(new boolean[]{false, true, false, true, true, false}, exercises.getBooleanArray(new int[]{-1, 18, -20, 2, 25, -35}));
        assertArrayEquals(new boolean[]{true, true, true, true, true, true, false}, exercises.getBooleanArray(new int[]{1, 18, 30, 2, 25, 35, 0}));

    }

    @Test
    void getLargestNumber() {
        assertEquals(7, exercises.getLargestNumber(new int[]{1, 3, 18, 30, 3, 2, 25, 35, 3}));
        assertEquals(4, exercises.getLargestNumber(new int[]{1, 3, 18, 30, 300, 2, 25, 35, 3}));
        assertEquals(0, exercises.getLargestNumber(new int[]{100, 3, 18, 30, 3, 2, 25, 35, 3}));
        assertEquals(0, exercises.getLargestNumber(new int[]{-1, -3, -18, -30, -3, -2, -25, -35, -3}));
    }

    @Test
    void getOddEvenArray() {
        assertArrayEquals(new int[]{}, exercises.getOddEvenArray(new int[]{}));
        assertArrayEquals(new int[]{-1, 1, 1, 1, -1, -1}, exercises.getOddEvenArray(new int[]{1, 18, 30, 2, 25, 35}));
        assertArrayEquals(new int[]{-1, -1, 1, 1, -1, -1}, exercises.getOddEvenArray(new int[]{1, -1, 30, 2, 25, 35}));
        assertArrayEquals(new int[]{-1, 1, 1, 1, -1, -1, -1}, exercises.getOddEvenArray(new int[]{1, 18, 30, -30, 25, 35, -49}));
        assertArrayEquals(new int[]{-1, 1, 1, 1, -1, -1}, exercises.getOddEvenArray(new int[]{-1, 18, -20, 2, 25, -35}));
    }

    @Test
    void sumAllElements() {
        assertEquals(0, exercises.sumAllElements(new int[]{}));
        assertEquals(111, exercises.sumAllElements(new int[]{1, 18, 30, 2, 25, 35}));
        assertEquals(92, exercises.sumAllElements(new int[]{1, -1, 30, 2, 25, 35}));
        assertEquals(30, exercises.sumAllElements(new int[]{1, 18, 30, -30, 25, 35, -49}));
        assertEquals(-11, exercises.sumAllElements(new int[]{-1, 18, -20, 2, 25, -35}));
    }

    @Test
    void removeElement() {
        assertArrayEquals(new int[]{}, exercises.removeElement(new int[]{}, 20));
        assertArrayEquals(new int[]{}, exercises.removeElement(new int[]{10}, 10));
        assertArrayEquals(new int[]{10}, exercises.removeElement(new int[]{10}, 20));
        assertArrayEquals(new int[]{1, 18, 2, 25, 35}, exercises.removeElement(new int[]{1, 18, 30, 2, 25, 35}, 30));
        assertArrayEquals(new int[]{1, -1, 30, 2, 25}, exercises.removeElement(new int[]{1, -1, 30, 2, 25, 35}, 35));
        assertArrayEquals(new int[]{18, 30, -30, 25, 35, -49}, exercises.removeElement(new int[]{1, 18, 30, -30, 25, 35, -49}, 1));
        assertArrayEquals(new int[]{18, 30, -30, 25, 35, -49}, exercises.removeElement(new int[]{1, 18, 30, -30, 1, 25, 35, -49, 1}, 1));
    }

    @Test
    void orderArray() {
        assertArrayEquals(new int[]{}, exercises.orderArray(new int[]{}));
        assertArrayEquals(new int[]{1}, exercises.orderArray(new int[]{1}));
        assertArrayEquals(new int[]{-1, 1}, exercises.orderArray(new int[]{1, -1}));
        assertArrayEquals(new int[]{-49, -30, 1, 18, 25, 30, 35}, exercises.orderArray(new int[]{1, 18, 35, -30, 25, 30, -49}));
        assertArrayEquals(new int[]{-35, -20, -1, 2, 18, 25}, exercises.orderArray(new int[]{-1, 18, -20, 2, 25, -35}));
    }
}