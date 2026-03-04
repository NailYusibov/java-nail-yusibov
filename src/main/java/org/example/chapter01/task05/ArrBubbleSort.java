package org.example.chapter01.task05;

// Написать метод для сортировки массива пузырьком

public class ArrBubbleSort {
    private static final int MIN_SIZE_TO_SORT = 2;

    @SuppressWarnings("PMD.AvoidArrayLoops")
    public void sort(int... numb) {
        if (numb.length < MIN_SIZE_TO_SORT) {
            return;
        }
        for (int i = 0; i < numb.length - 1; i++) {
            for (int j = 0; j < numb.length - 1; j++) {
                if (numb[j] > numb[j + 1]) {
                    int temp = numb[j];
                    numb[j] = numb[j + 1];
                    numb[j + 1] = temp;
                }
            }
        }
    }
}
