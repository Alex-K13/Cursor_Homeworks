package hw9.exeptions;


import java.io.IOException;

public class CaughtExceptions {
    public void catchRuntimeException() {
        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            System.err.println("Caught RuntimeException ");
            e.printStackTrace();
        }
    }

    public void catchIndexOutOfBoundsException() {
        try {
            throw new ArrayIndexOutOfBoundsException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Caught ArrayIndexOutOfBoundsException ");
            e.printStackTrace();
        }
    }

    public void catchIOException() {

        try {
            throw new IOException();
        } catch (IOException e) {
            System.err.println("Caught IOException ");
            e.printStackTrace();
        }
    }

    public void catchNullPointer() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            System.err.println("Caught NullPointerException ");
            e.printStackTrace();
        }
    }
}
