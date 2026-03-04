package org.example.chapter01.task02;

// Написать метод для определения i-го бита числа с помощью битовых операций.

public class BitCounter {

    private static final int LAST_BIT_INDEX = 31;

    public int getBitNum(int number, int position) {
        if (position < 0 || position > LAST_BIT_INDEX) {
            throw new IllegalArgumentException("position must be in range [0, LAST_BIT_INDEX]");
        }
        return (number >> position) & 1;
    }
}
