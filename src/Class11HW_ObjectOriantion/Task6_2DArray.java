package Class11HW_ObjectOriantion;

public interface Task6_2DArray {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even
        // numbers in 3 rows and 4 columns. Develop a program which will identify/print the even numbers only.

        int[][] arr = {
                {10, 3, 20, 25},
                {27, 33, 40, 60},
                {31, 14, 2, 6}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }

            }
        }
    }
}
