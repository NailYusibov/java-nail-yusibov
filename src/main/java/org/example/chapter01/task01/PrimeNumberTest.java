package org.example.chapter01.task01;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimeNumberTest {
    @ParameterizedTest
    @CsvSource({
            "1, false", "2, true", "3, true", "4, false", "5, true", "9, false", "11, true", "25, false", "29, true", "-1, false", "-10, false"
    })
    void checkPrimeNumber(int number, int position, int expected) {
        BitCounter bitCounter = new BitCounter();
        int result = bitCounter.getBitNumb(number, position);
        assertEquals(expected, result);
    }
}
