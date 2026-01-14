package org.example.chapter01.task01;

public class BitCounter {
    public int getBitNumb(int number, int position) {
        return (number >> position) & 1;
    }
}