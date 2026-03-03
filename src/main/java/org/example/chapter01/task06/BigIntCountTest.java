package org.example.chapter01.task06;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class BigIntCountTest {
    @ParameterizedTest
    @CsvSource({"0, 1", "1, 1", "2, 2", "3, 6", "5, 120", "10, 3628800"})
    void shouldCalculateFactorial(int number, String expectedValue) {

        BigIntCount count = new BigIntCount();
        BigInteger expected = new BigInteger(expectedValue);

        BigInteger result = count.factorial(number);

        assertEquals(expected, result);
    }

    @Test
    void shouldThrowExceptionWhenNumberIsNegative() {

        BigIntCount count = new BigIntCount();
        int number = -1;

        assertThrows(IllegalArgumentException.class, () -> count.factorial(number));
    }
}
