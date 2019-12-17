package HW6;

import java.util.ArrayList;
import java.util.List;

class Task1 {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();

        array.add(3);
        array.add(9);
        array.add(11);
        array.add(18);
        array.add(20);
        array.add(22);

        System.out.print("Removed numbers: ");
        for (int num : array) {
            if (num % 3 == 0)
                System.out.print(num + " ");
        }
    }
}


