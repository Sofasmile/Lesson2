import builder_realize.*;
import static_sort.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        Builder builder = new Employee();
        Architect architect = new Architect(builder);
        architect.buil();
        House house = builder.result();
        house.showResult();

        //

        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(31) - 15;
        }
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(Sort.bubbleSort(array)));
        System.out.println(Arrays.toString(Sort.insertionSort(array)));
        System.out.println(Arrays.toString(Sort.quickSort(array)));
        System.out.println(Arrays.toString(Sort.selectionSort(array)));
        System.out.println(Arrays.toString(Sort.shellSort(array)));

    }
}
