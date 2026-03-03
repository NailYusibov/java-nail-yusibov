package org.example.chapter01.task06;

import java.math.BigInteger;

public class BigIntCount {
    public BigInteger factorial(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("number must be >= 0");
        }
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}
