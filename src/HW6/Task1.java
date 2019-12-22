package HW6;

import java.util.ArrayList;
import java.util.List;

class Task1 {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();

        integers.add(3);
        integers.add(9);
        integers.add(11);
        integers.add(18);
        integers.add(20);
        integers.add(22);

        System.out.print("Removed numbers: ");
        for (int num : integers) {
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }
    }
}