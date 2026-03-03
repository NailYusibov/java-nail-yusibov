package org.example.chapter01.task05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

// Написать метод для сортировки массива пузырьком

public class ArrBubbleSortTest {
    @Test
    void emptyArray() {
        ArrBubbleSort sortet = new ArrBubbleSort();
        int[] input = {};

        sortet.sort(input);

        assertArrayEquals(new int[]{}, input);
    }

    @Test
    void oneElement() {
        ArrBubbleSort sortet = new ArrBubbleSort();
        int[] input = {5};

        sortet.sort(input);

        assertArrayEquals(new int[]{5}, input);
    }

    @Test
    void solvedSort() {
        ArrBubbleSort sortet = new ArrBubbleSort();
        int[] input = {1, 2, 3, 4};

        sortet.sort(input);

        assertArrayEquals(new int[]{1, 2, 3, 4}, input);
    }

    @Test
    void backSort() {
        ArrBubbleSort sortet = new ArrBubbleSort();
        int[] input = {5, 4, 3, 2};

        sortet.sort(input);

        assertArrayEquals(new int[]{2,3,4,5}, input);
    }

    @Test
    void randomSort() {
        ArrBubbleSort sortet = new ArrBubbleSort();
        int[] input = {4, 7, 2, 6, 3};

        sortet.sort(input);

        assertArrayEquals(new int[]{2,3,4,6,7}, input);
    }
}
