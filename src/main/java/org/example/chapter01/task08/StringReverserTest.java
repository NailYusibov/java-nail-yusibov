package org.example.chapter01.task08;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringReverserTest {
    @ParameterizedTest
    @CsvSource({
            "hello, olleh",
            "Java, avaJ",
            "a, a",
            "'', ''",
            "12345, 54321"
    })
    void shouldReverseString(String input, String expected) {

        StringReverser reverser = new StringReverser();

        String result = reverser.reverse(input);

        assertEquals(expected, result);
    }

    @Test
    void shouldThrowExceptionWhenInputIsNull() {

        StringReverser reverser = new StringReverser();

        assertThrows(IllegalArgumentException.class, () -> reverser.reverse(null));
    }
}
