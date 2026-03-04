package org.example.chapter01.task01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

// Найти максимум из 3-x чисел с помощью if

class MaxNumberTest {
    @ParameterizedTest
    @CsvSource({"1, 9, 5, 9", "9, 3, 5, 9", "5, 3, 9, 9"})
    void testMaxNumber(int num1, int num2, int num3, int expected) {
        assertEquals(expected, MaxNumber.max(num1, num2, num3));
    }
}
