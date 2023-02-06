package Class16HW_Variables;

//2) Create a method that will take a String as a parameter and returns reversed String.
// Method should be available to all classes within your project and accessible by class name.
public class Task2 {

    public String reversedStr(String str) {

        for (int i = str.length() - 1; i >= 0; i--) {

            System.out.print(str.charAt(i) + " ");

        }
        return str;


    }

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        System.out.println(task2.reversedStr("Book"));


        //--------------------done by asghar---------------------

        /*

         public static String reverseStr(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args) {


      //if we are within the same class we
      //don't need the class name as well

        reverseStr("Monday");
    }


        */

    }



}
