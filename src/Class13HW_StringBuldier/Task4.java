package Class13HW_StringBuldier;

public class Task4 {
    //    4) How would you reverse a String word by word? for example
//        // input=>This is sentence i want to reverse
//        // output=>sihT si ecnetnes i tnaw ot esrever
    public static void main(String[] args) {

        String rev = "This is sentence i want to reverse";
        for (int i = rev.length() - 1; i >= 0; i--) {
            System.out.print(rev.charAt(i));

        }

    }
}
