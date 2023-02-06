package Class13HW_StringBuldier;

public class Task3 {
//    3) You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
//    How would you find out how many sentences are in that String?

    public static void main(String[] args) {

        String sentence ="Is it saturday? Is it raining? Do we have a Java Class today?";

        String[] str =sentence.split("[?]");
        System.out.println(str.length);
        System.out.println(str[2].trim());
        System.out.println(str[0].trim());
        System.out.println(str[1].trim());


    }
}
