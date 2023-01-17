package Class3HW_logicalOperation;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter your heights in inches?");
        double height = input.nextDouble();

        if (height <= 60) {
            System.out.println(" Your heights is short");
        }
        if (height > 60 && height <= 72) {
            System.out.println(" Your height is medium");
        } else if (height > 72) {
            System.out.println("Your height is long ");
        }
    }
}
