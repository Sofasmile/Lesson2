package staticsort;

import java.util.Arrays;

public class Sort {
    // Bubble Sort
    public static int[] bubbleSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    private static void swap(int[] array, int i, int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static int[] insertionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
            }
        }
        return arr;
    }


    //Selection Sort
    public static int[] selectionSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int min, temp;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min])
                    min = j;
            }
            swap(arr, min, i);
        }
        return arr;
    }

    // Shell Sort
    public static int[] shellSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int j;
        for (int div = arr.length / 2; div > 0; div /= 2) {
            for (int i = div; i < arr.length; i++) {
                int temp = arr[i];
                for (j = i; j >= div && arr[j - div] > temp; j -= div) {
                    arr[j] = arr[j - div];
                }
                arr[j] = temp;
            }
        }
        return arr;
    }

    // Quick Sort
    public static int[] quickSort(int[] array) {
        int[] arr = Arrays.copyOf(array, array.length);
        int left = 0;
        int right = arr.length - 1;
        return quick(arr, left, right);
    }

    // Quick Sort continuation 1
    private static int[] quick(int[] arr, int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1) {
            quick(arr, left, index - 1);
        }
        if (index < right) {
            quick(arr, index, right);
        }
        return arr;
    }

    // Quick Sort continuation 2
    private static int partition(int[] arr, int left, int right) {
        int i = left;
        int j = right;
        int middle = arr[(left + right) / 2];

        while (i <= j) {
            while (arr[i] < middle) {
                i++;
            }
            while (arr[j] > middle) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }
}
