package Class11HW_ObjectOriantion;

import java.util.Arrays;

public class Task3_2DArray {
    public static void main(String[] args) {

        //2) Create 2D array of cars : american, german, korean, italian. Then retrieve all values
        // from that array using 2 different loops

        String[][] cars = {{"Mustang", "Chevrolet", "Ford", "Dodge"},
                {"BMW", "Mercedes_Benz", "Porsche", "Audi"},
                {"Kia", "Hyundai", "SsangYong", "Accent"},
                {"Lamborghini", "Ferrari", "Fiat", "Pagani"}

        };
//
        System.out.println("---------------Firs----------------");

        for (String[] car : cars) {
            for (String brand : car) {
                System.out.print(brand + " ");
            }

            System.out.println();


        }
        System.out.println("-----------Second--------------------");

        for (String[] motor : cars) {
            for (String motor2 : motor) {
                System.out.print(motor2 + " ");
            }
            System.out.println();

        }

        System.out.println("---------------Third----------------");

        for (int i = 0; i < cars.length; i++) {
            System.out.println(Arrays.toString(cars[i]) + " ");
        }


    }
}

