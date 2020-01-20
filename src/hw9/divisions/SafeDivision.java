package hw9.divisions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SafeDivision {
    int divided;
    Scanner scan = new Scanner(System.in);

    public void runDivision() {
        try {
            System.out.print("write  divided A : ");
            this.divided = scan.nextInt();
            printResult();
        } catch (InputMismatchException e) {
            System.out.println("Divided incorrect. Try again");
            scan.next();
            runDivision();
        }
    }

    public void printResult() {
        try {
            System.out.print("write divider B : ");
            double divider = scan.nextInt();
            if (divider == 0) {
                System.out.println("Divider cannot be zero. Try again.");
                throw new ArithmeticException();
            }
            System.out.println("Divisions = " + divided / divider);
        } catch (ArithmeticException e) {
            printResult();
        }
    }
}


