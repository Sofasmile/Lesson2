import builder_realize.*;
import immutable.Address;
import immutable.People;
import static_sort.*;
import type_of_class.Flat;

import java.util.Arrays;
import java.util.Random;

public class Program {

    public static void main(String[] args) {
        // Task 1
        Builder builder = new Employee();
        Architect architect = new Architect(builder);
        architect.buil();
        House house = builder.result();
        house.showResult();
        System.out.println("----------------------");

        // Task 2
        Flat flat = new Flat(45, 2);
        flat.information();
        flat.doorInFlat();
        flat.showRepair();
        Flat.TypeOfFlat studio = new Flat.TypeOfFlat(40, 1, "studio");
        studio.showType();
        System.out.println("----------------------");

        // Task 3
        People people = new People(20, "Sofia", "Diakonova", new Address("Shevchenka"));
        System.out.println(people.getAdress().getStreet());
        System.out.println("----------------------");

        //Task 4
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
