package org.example.chapter01.task02;

// Написать метод для определения i-го бита числа с помощью битовых операций.

public class BitCounter {


    public int getBitNum(int number, int position) {
        return (number >> position) & 1;
    }
}
