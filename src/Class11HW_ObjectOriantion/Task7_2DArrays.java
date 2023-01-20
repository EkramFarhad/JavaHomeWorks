package Class11HW_ObjectOriantion;

import java.util.Arrays;

public class Task7_2DArrays {

    //Create 2D array of countries: north america countries, south america countries,
    // europe countries, asian countries, african countries. Then print all values from that
    // array using 2 different loops and calculate how many total countries been stored
    public static void main(String[] args) {

        String[][] countries = {
                {"USA", "Mexico", "Jamaica", "Canada", "El Salvador"},
                {"Argentina", "Ecuador", "Suriname", "Brazil", "Chile", "Peru"},
                {"Albania", "Hungary", "Italy", "Brazil", "France", "Peru"},
                {"Afghanistan", "UAE", "China", "Russia", "Iran", "North Korea"}

        };

        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {

                System.out.print(countries[i][j] + " ");

            }
            System.out.println();

        }

        System.out.println("--------------------------");

        for (String[] arr : countries) {
            for (String numbers : arr) {
                System.out.print(numbers + " ");
            }
            System.out.println();

        }

        System.out.println("-------------------------");


        for (int i = 0; i < countries.length; i++) {
            System.out.println(Arrays.toString(countries[i]));

        }

    }
}
