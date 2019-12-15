package HW5;

public class FullList {
    public void fillingList() {
        MyList<Integer> IntList = new MyList<>();
        int value1 = -2;
        int value2 = 45;
        int value3 = 30;
        int value4 = -24;

        IntList.add(value1);
        IntList.add(value2);
        IntList.add(value3);
        IntList.add(value4);

        System.out.println("Maximum Int Value = " + IntList.returnLargestValue());
        System.out.println("Minimum Int Value = " + IntList.returnSmallestValue());
    }
}
