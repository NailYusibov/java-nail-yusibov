package org.example.chapter01.task04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

// Найти сумму элементов массива, которые больше среднего арифметического.

public class MaxSumArrayElementTest {
    @Test
    void zeroOfEmptyArray() {
        MaxSumArrayElement calculation = new MaxSumArrayElement();
        int[] input = {};
        long expected = 0;
        long result = calculation.sumAboveAverage(input);
        assertEquals(expected, result);
    }

    @Test
    void maxSumTest() {
        MaxSumArrayElement calculation = new MaxSumArrayElement();
        int max = Integer.MAX_VALUE;
        int[] input = {max, max - 1, max - 1};
        long expected = max;
        long result = calculation.sumAboveAverage(input);
        assertEquals(expected, result);
    }
}
