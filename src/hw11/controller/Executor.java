package hw11.controller;

import hw11.module.MemoryLeakGenerator;

public class Executor {
    public void runProgram() {
        MemoryLeakGenerator leakGenerator = new MemoryLeakGenerator();
        leakGenerator.createArrays();
    }
}
