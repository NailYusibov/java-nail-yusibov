package org.example.chapter01.task02;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

// Написать метод для определения i-го бита числа с помощью битовых операций.

public class BitCounterTest {

    @ParameterizedTest
    @CsvSource({"13, 0, 1", "13, 1, 0", "13, 2, 1", "13, 3, 1", "5, 0, 1", "5, 1, 0", "5, 2, 1"})
    void shouldReturnCorrectBitNum(int number, int position, int expected) {
        BitCounter bitCounter = new BitCounter();

        int actual = bitCounter.getBitNum(number, position);

        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 32})
    void shouldThrowForInvalidPosition(int position) {
        BitCounter bitCounter = new BitCounter();
        assertThrows(IllegalArgumentException.class, () -> bitCounter.getBitNum(13, position));
    }
}
