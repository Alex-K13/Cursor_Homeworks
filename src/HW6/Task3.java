package HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Task3 {
<<<<<<< HEAD
     static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>();
        List<Integer> array2 = new ArrayList<>();

        array1.add(2);
        array1.add(3);
        array1.add(6);
        array1.add(8);
        array1.add(5);
        System.out.println("Array1: " + array1);

        array2.add(21);
        array2.add(8);
        array2.add(10);
        array2.add(5);
        array2.add(7);
        System.out.println("Array2: " + array2);

        System.out.print("Similar elements: ");
        System.out.println(array1.stream()
                .filter(array2::contains)
=======
    static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(2);
        list1.add(3);
        list1.add(6);
        list1.add(8);
        list1.add(5);
        System.out.println("list1: " + list1);

        list2.add(21);
        list2.add(8);
        list2.add(10);
        list2.add(5);
        list2.add(7);
        System.out.println("list2: " + list2);

        System.out.print("Similar elements: ");
        System.out.println(list1.stream()
                .filter(list2::contains)
>>>>>>> HW6
                .collect(Collectors.toList()));
    }
}
