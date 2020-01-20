package hw9.controller;

import hw9.divisions.SafeDivision;
import hw9.exeptions.CaughtExceptions;
import hw9.rethrown.RethrownException;

public class AppExecutor {

    public void runProgram() {
        //task1
        new CaughtExceptions().catchRuntimeException();
        new CaughtExceptions().catchIndexOutOfBoundsException();
        new CaughtExceptions().catchIOException();
        new CaughtExceptions().catchNullPointer();
        //task2
        new SafeDivision().runDivision();
        //task3
        new RethrownException().throwsAllException();

    }
}
