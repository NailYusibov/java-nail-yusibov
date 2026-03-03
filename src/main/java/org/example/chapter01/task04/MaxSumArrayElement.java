package org.example.chapter01.task04;

// Найти сумму элементов массива, которые больше среднего арифметического.

public class MaxSumArrayElement {
    public long sumAboveAverage(int... numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        }
        long maxSumm = 0;
        for (int num : numbers) {
            maxSumm += num;
        }
        double midl = (double) maxSumm / numbers.length;
        long resultSum = 0;
        for (int num : numbers) {
            if (num > midl) {
                resultSum += num;
            }
        }
        return resultSum;
    }
}
