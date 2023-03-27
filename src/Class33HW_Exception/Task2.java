package Class33HW_Exception;


import java.util.ArrayList;
import java.util.List;

/*2) Create a static method that will return a List of Exceptions.
Inside your method create objects of 4 exception classes using try and catch blocks and store them inside your list.
Call your method inside main and print name and details of all Exception objects.*/
public class Task2 {
    public static void main(String[] args) {

        List<Exception> exceptionList = listOfExceptions();
        System.out.println(exceptionList.getClass());


    }


    //=====================================================

    public static List<Exception> listOfExceptions() {

        List<Exception> exceptionList = new ArrayList<>();

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            exceptionList.add(aioobe);
            System.out.println(aioobe + " ==> The value has been entered is maybe more or less than index of current array".toUpperCase());
            System.out.println("------------------------------------------------------------------------------------------");
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException npe) {
            exceptionList.add(npe);
            System.out.println(npe + " ==> The string has null value".toUpperCase());
            System.out.println("------------------------------------------------------------------------------------------");
        }

        try {
            System.out.println(10 / 0);
        } catch (ArithmeticException ae) {
            exceptionList.add(ae);
            System.out.println(ae + " ==> The value can not divide by Zero".toUpperCase());
            System.out.println("------------------------------------------------------------------------------------------");
        }
        try {
            String str = "HelloWorld";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException nfe) {
            exceptionList.add(nfe);
            System.out.println(nfe + " ==> Number OF Format Exception".toUpperCase());
            System.out.println("------------------------------------------------------------------------------------------");


        }

        return exceptionList;

    }
}