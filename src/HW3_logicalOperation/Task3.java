package HW3_logicalOperation;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter Your Grade");
        double score = input.nextDouble();

        if (score >= 90 && score == 100) {
            System.out.println("Grade A");

        } else if (score >= 70 && score < 90) {
            System.out.println("Grade B");

        } else if (score >= 50 && score < 70) {
            System.out.println("Grade C");

        } else if (score <= 49) {
            System.out.println("Grade F");
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
