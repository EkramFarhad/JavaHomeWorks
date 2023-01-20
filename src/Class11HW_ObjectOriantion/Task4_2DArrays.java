package Class11HW_ObjectOriantion;

import java.util.Arrays;

public class Task4_2DArrays {

    //) Using 2D array create a grocery list.
    //Inside you should have an array of veggies, fruits, dairy and sweets.
    // Retrieve all values from that array using 2 different loops

    public static void main(String[] args) {

        String[][] groceryList = {
                {"Broccoli", "Celery", "Potato", "Tomato"},
                {"Apple", "Banana", "Apricot", "Cherry"},
                {"Milk", "Butter", "Cheese", "Yogurt"},
                {"Cake", "Pie", "Ice Cream", "Cookie"}
        };

        System.out.println("-------------First--------------");

        for (int i = 0; i < groceryList.length; i++) {
            for (int j = 0; j < groceryList[i].length; j++) {

                System.out.print(groceryList[i][j] + " ");
            }

            System.out.println();
        }

        System.out.println("-------------Second--------------");

        for (String[] gro : groceryList) {
            for (String groLis : gro) {
                System.out.print(groLis + " ");
            }
            System.out.println();
        }

        System.out.println("--------------Third-------------");

        for (int i = 0; i < groceryList.length; i++) {

            System.out.println(Arrays.toString(groceryList[i]));
        }
    }
}
