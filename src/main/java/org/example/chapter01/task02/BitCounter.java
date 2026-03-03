package org.example.chapter01.task02;

// Написать метод для определения i-го бита числа с помощью битовых операций.

public class BitCounter {

    public int getBitNum(int number, int position) {
        if (position < 0 || position > 31) {
            throw new IllegalArgumentException("position must be in range [0, 31]");
        }
        return (number >> position) & 1;
    }
}
