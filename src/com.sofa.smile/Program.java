import builderrealize.Student;
import immutable.Address;
import immutable.People;
import staticsort.Sort;
import typeofclass.Flat;

import java.util.Arrays;
import java.util.Random;

public class Program {
    public static void main(String[] args) {
        // Task 1
        Student student = Student.newBuilder()
                .setName("Sofia")
                .setSurname("Diakonova")
                .setAge(20)
                .setStugentNumber("kv123456789")
                .setAverageMark(4.5)
                .build();
        System.out.println(student.toString());
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
        People people = new People("Sofia", "Diakonova", new Address("Shevchenka"));
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

