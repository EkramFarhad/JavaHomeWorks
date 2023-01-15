package HW1_Virables;

public class SimpleMath {
    public static void main(String[] args) {
        double num1 = 10.5;
        double num2 = 10.5;
        double num3 = 3.9;

        // first and long option
        System.out.println("The Addition of 2 numbers"+ " " + num1 + " "+"and"+" " + num2 + " "+"is equal to"+"" +
                " "+ (num1+num2));
       // second option
        System.out.println("The Addition of 2 numbers 10.5 and 10.5 is equal to " + (num1+num2));
        System.out.println("The Subtraction of 2 numbers 10.5 and 10.5 is equal to " + (num1-num2));
        System.out.println("The Multiplication of 2 numbers 10.5 and 10.5 is equal to " + num1 *num2);
        System.out.println("The Division of 2 numbers 10.5 and 10.5 is equal to " + num1/num2);
        System.out.println("The Square of 3.9 is " + num3*num3 );

    }
}
