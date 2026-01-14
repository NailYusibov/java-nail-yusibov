package org.example.chapter01.task01;

public class PrimeNumber {

    private static final int MIN_PRIME = 2;
    private static final int FIRST_DIVISOR = 2;

    public boolean isPrimeNum(int number) {
        if (number < MIN_PRIME) {
            return false;
        }

        int limit = (int) Math.sqrt(number);

        for (int divisor = FIRST_DIVISOR; divisor <= limit; divisor++) {
            if (number % divisor == 0) {
                return number == divisor;
            }
        }

        return true;
    }
}
