package HW4_Loops;

public class Task5 {
    public static void main(String[] args) {

           /*
        5) Print the following pattern:
        55555
        4444
        333
        22
        1
        */

        for (int i = 5; i > 0; i--) {
            for (int a = i; a > 0; a--) {
                System.out.print(i + " ");
            }
            System.out.println();


        }

    }

}
