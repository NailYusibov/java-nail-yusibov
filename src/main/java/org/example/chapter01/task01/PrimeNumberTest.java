package org.example.chapter01.task01;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class PrimeNumberTest {

    @ParameterizedTest
    @CsvSource({
        "-10, false",
        "0, false",
        "1, false",
        "2, true",
        "3, true",
        "4, false",
        "5, true",
        "9, false",
        "13, true",
        "25, false"
    })
    void shouldReturnCorrectPrimeResult(int number, boolean expected) {
        PrimeNumber primeNumber = new PrimeNumber();

        boolean actual = primeNumber.isPrimeNum(number);

        assertEquals(expected, actual);
    }
}
