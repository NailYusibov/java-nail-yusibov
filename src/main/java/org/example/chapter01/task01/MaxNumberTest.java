package org.example.chapter01.task01;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxNumberTest {
    void testMaxNumber() {
        int result = MaxNumber.max(9, 3, 5);
        assertEquals(9, result);
    }

}