package Class8HW_Loops;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        // 2) Create a program that will be asking user to apply for a credit card 10 times.
        // As soon you get an “yes” from a user program should stop asking.

        Scanner input = new Scanner(System.in);

        for (int i = 1; i <= 10; i++) {
            System.out.println("Do you want to apply for credit card ?");
            String applyCard = input.next();
            if (applyCard.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for applying");
                break;
            }

        }

    }

}

