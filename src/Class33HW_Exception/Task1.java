package Class33HW_Exception;

/* 1) How would handle InputMismatchException? Input Mismatch Exception when user enters mismatch value then programmer expected.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Only enter a whole number");
        try {
            int num1 = scanner.nextInt();
            System.out.println("Enter the second whole number");
            int num2 = scanner.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        } catch (InputMismatchException inp) {
            System.out.println("Mismatch Exception! Enter only a whole numbers");
        } finally {
            scanner.close();
        }
    }
}
