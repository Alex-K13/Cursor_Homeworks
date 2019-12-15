package HW5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList<T extends Number & Comparable<? super T>> {
    public List<T> lisT = new ArrayList<T>();

    void add(T value) {

        lisT.add(value);
    }

    public List<T> returnList() {
        return this.lisT;
    }

    public T returnLargestValue() {
        if (lisT.isEmpty()) {
            System.out.println("List is empty");
        } else {
            return Collections.max(lisT);
        }
        return null;
    }

    public T returnSmallestValue() {
        if (lisT.isEmpty()) {
            System.out.println("List is empty");
        } else {
            return Collections.min(lisT);
        }
        return null;
    }

}

