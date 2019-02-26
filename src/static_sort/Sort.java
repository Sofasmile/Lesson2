package static_sort;

import java.util.Random;

public class Sort {

    // Bubble Sort
    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    // Insertion Sort
    public static int[] insertionSort(int[] array) {
        int temp, j;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                j = i;
                while (j > 0 && temp < array[j - 1]) {
                    array[j] = array[j - 1];
                    j--;
                }
                array[j] = temp;
            }
        }
        return array;
    }

    //Selection Sort
    public static int[] selectionSort(int[] array) {
        int min, temp;
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min])
                    min = j;
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        return array;
    }

    // Shell Sort
    public static int[] shellSort(int[] array) {
        int j;
        for (int div = array.length / 2; div > 0; div /= 2) {
            for (int i = div; i < array.length; i++) {
                int temp = array[i];
                for (j = i; j >= div && array[j - div] > temp; j -= div) {
                    array[j] = array[j - div];
                }
                array[j] = temp;
            }
        }
        return array;
    }

    // Quick Sort
    public static int[] quickSort(int[] array) {
        int left = 0;
        int right = array.length - 1;
        long timeBefore = System.currentTimeMillis();
        return quick(array, left, right);
    }

    // Quick Sort continuation 1
    private static int[] quick(int[] array, int left, int right) {
        int index = partition(array, left, right);
        if (left < index - 1) {
            quick(array, left, index - 1);
        }
        if (index < right) {
            quick(array, index, right);
        }
        return array;
    }

    // Quick Sort continuation 2
    private static int partition(int[] array, int left, int right) {
        int i = left, j = right;
        int tmp;
        int middle = array[(left + right) / 2];

        while (i <= j) {
            while (array[i] < middle) {
                i++;
            }
            while (array[j] > middle) {
                j--;
            }
            if (i <= j) {
                tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
        }
        return i;
    }
}
