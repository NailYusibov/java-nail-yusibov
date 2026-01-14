package org.example.chapter01.task01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BitCounterTest {

    @ParameterizedTest
    @CsvSource({"13, 0, 1", "13, 1, 0", "13, 2, 1", "13, 3, 1", "5, 0, 1", "5, 1, 0", "5, 2, 1"})
    void shouldReturnCorrectBitNum(int number, int position, int expected) {
        BitCounter bitCounter = new BitCounter();

        int actual = bitCounter.getBitNum(number, position);

        assertEquals(expected, actual);
    }
}
