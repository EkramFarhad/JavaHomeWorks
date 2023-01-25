package Class13HW_StringBuldier;

public class Task2 {
    //    2) Create a String that should be combination of letters, numbers and special characters.
//    Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
    public static void main(String[] args) {

        String alphaN = " asdfghjkl1234567!@#$%^&*";
        System.out.println(alphaN.replaceAll("[^A-Za-z0-9]", "").length());

    }
}
