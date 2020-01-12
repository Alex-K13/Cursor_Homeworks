package HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Task3 {
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
                .collect(Collectors.toList()));
    }
}
