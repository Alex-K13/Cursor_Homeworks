package hw11.module;

public class MemoryLeakGenerator {
    public void createArrays() {
        int arraySize = 20;

        while (true) {
            System.out.println("Available memory (in bytes): " + Runtime.getRuntime().freeMemory());
            int[] fillMemory = new int[arraySize];
            arraySize = arraySize * 5;
        }
    }
}