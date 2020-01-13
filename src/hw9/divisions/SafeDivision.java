package hw9.divisions;

import java.util.Scanner;

public class SafeDivision {
    Scanner scan;

    public SafeDivision() {
        this.scan = new Scanner(System.in);
    }

    private void divisionTheValues() {
        System.out.print("write A : ");
        int a = this.scan.nextInt();
        System.out.print("write B : ");
        int b = this.scan.nextInt();
        if (b == 0) {
            throw new ArithmeticException("The divisor cannot be zero");
        } else {
            System.out.println("A/B = " + a / b);
        }
    }

    public void showResult() {
        try {
            this.divisionTheValues();
        } catch (ArithmeticException var2) {
            System.err.println(var2.getMessage());
            System.out.println("Write another B ");
            this.divisionTheValues();
        }

    }
}
