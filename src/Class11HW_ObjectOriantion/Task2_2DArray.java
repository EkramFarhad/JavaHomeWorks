package Class11HW_ObjectOriantion;

import java.util.Arrays;

public class Task2_2DArray {

    //) Create a 2D array(shorter way) in which first array will consist of 4 names
    // and second array will contain grades. Then your program should print name of the
    // students that has A and B grade (edited)
    //[7:00 PM]

    public static void main(String[] args) {

        String[][] name = {

                {"Alex", "Padilla", "Mike", "Susan"},
                {"A", "B", "C", "D"},

        };

        System.out.print(name[0][0] +" ");
        System.out.println(name[1][0]);

        System.out.print(name[0][1]+" ");
        System.out.println(name[1][1]);

    }
}
