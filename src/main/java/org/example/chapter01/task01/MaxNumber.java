package org.example.chapter01.task01;

public class MaxNumber {
    public static int max(int num1, int num2, int num3) {
        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }
        return max;
    }
}
