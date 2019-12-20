package HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number & Comparable<? super T>> {
    private List<T> lisT = new ArrayList<>();

    void add(T value) {
        lisT.add(value);
    }

    T returnLargestValue() {
        if (lisT.isEmpty()) {
            System.out.println("List is empty");
        } else {
            return Collections.max(lisT);
        }
        return null;
    }

    T returnSmallestValue() {
        if (lisT.isEmpty()) {
            System.out.println("List is empty");
        } else {
            return Collections.min(lisT);
        }
        return null;
    }
}
