package Class13HW_StringBuldier;

public class Task1 {

    //    1) Create a String that will hold a sentence. Write a program to get a new String without any spaces.
    public static void main(String[] args) {

        String str = "I love to learn Java but it is not easy";
        str = str.replaceAll("I love to learn Java but it is not easy", "I try my best to learn JAVA.");

        System.out.println(str.replaceAll("[^A-Za-z0_9]", ""));

    }
}
