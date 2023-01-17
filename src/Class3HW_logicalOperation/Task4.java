package Class3HW_logicalOperation;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your month of birth to see the season.");
        String birthMonth = input.next();

        if (birthMonth.equalsIgnoreCase("December") || birthMonth.equalsIgnoreCase("January")
                || birthMonth.equalsIgnoreCase("February") || birthMonth.equalsIgnoreCase("March")) {
            System.out.println("Your birth month is at the WINTER.");

        } else if (birthMonth.equalsIgnoreCase("April") || birthMonth.equalsIgnoreCase("May") || birthMonth.equalsIgnoreCase("June")) {
            System.out.println("Your birth month is at the SPRING.");

        } else if (birthMonth.equalsIgnoreCase("July") || birthMonth.equalsIgnoreCase("August") || birthMonth.equalsIgnoreCase("September")) {
            System.out.println("Your birth month is at the SUMMER.");

        } else if (birthMonth.equalsIgnoreCase("October") || birthMonth.equalsIgnoreCase("November")) {
            System.out.println("Your birth month is at the FALL.");

        } else {
            System.out.println("Please Enter a Valid Month.");

        }

    }

}/**/


