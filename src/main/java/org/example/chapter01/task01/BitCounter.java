package org.example.chapter01.task01;

public class BitCounter {

    private static final int ONE = 1;

    public int getBitNum(int number, int position) {
        return (number >> position) & ONE;
    }
}
