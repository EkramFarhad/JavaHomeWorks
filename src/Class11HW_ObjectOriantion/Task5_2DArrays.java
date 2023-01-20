package Class11HW_ObjectOriantion;

public class Task5_2DArrays {
    public static void main(String[] args) {

        //Create a 2D array or integer type and store numbers in 3 rows and 3 columns. Print the sum of all numbers.

        int[][] num = {
                {1, 2, 3},
                {10, 20, 30},
                {100, 200, 300}
        };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                sum = sum + num[i][j];

            }
            System.out.println(sum);
        }
    }
}
