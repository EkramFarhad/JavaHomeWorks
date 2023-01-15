package HW3_logicalOperation;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter a number to find out the day.");
        int day = input.nextInt();

        if (day <= 5) {
            System.out.println("It is a weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("It is weekend");
        } else {
            System.out.println("Invalid day");
        }
    }
}
