package hw11;

import hw11.module.MemoryLeakGenerator;

public class Main {
    public static void main(String[] args) {

        MemoryLeakGenerator leakGenerator = new MemoryLeakGenerator();
        leakGenerator.createArrays();
    }
}
