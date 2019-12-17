package HW5;

public class FullList {
    public void start() {
        MyList<Integer> arrayList = new MyList<>();

        fillingList(arrayList);

        System.out.println("Maximum Int Value = " + arrayList.returnLargestValue());
        System.out.println("Minimum Int Value = " + arrayList.returnSmallestValue());

    }

    private void fillingList(MyList<Integer> arrayList) {
        int value1 = -2;
        int value2 = 45;
        int value3 = 30;
        int value4 = -24;

        arrayList.add(value1);
        arrayList.add(value2);
        arrayList.add(value3);
        arrayList.add(value4);
    }
}
