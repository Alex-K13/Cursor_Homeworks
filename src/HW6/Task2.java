package HW6;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public Task2() {
    }

    public static void main(String[] args) {
        List<String> fruits = new ArrayList();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Coconut");
        fruits.add("Lemon");

        for (int i = 0; i < fruits.size(); ++i) {
            if (fruits.get(i) == "Orange") {
                fruits.set(i, "Grapefruit");

                System.out.println("Edited list with fruits: " + fruits);
            } else {
                System.out.println("That value not present");
            }
        }

    }
}
