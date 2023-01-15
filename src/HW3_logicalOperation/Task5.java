package HW3_logicalOperation;

public class Task5 {
    public static void main(String[] args) {

        boolean a, b, c;
        a = b = c = true;

        if( !a || ( b && c ) ) {
            System.out.println("If executed");
        } else {
            System.out.println("else executed");
        }
    }
    }

