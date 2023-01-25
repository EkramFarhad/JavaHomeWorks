package Class12HW_Method;

public class Task2 {
    /*
    2) Create a String and print it in reverse order (Sunday → yadnuS).
    */
    public static void main(String[] args) {

        String day = "Sunday";


        System.out.println("-----------First methode-----------");

        StringBuffer str = new StringBuffer(day);

        System.out.println(str.reverse());

        System.out.println("-----------Second methode-----------");

        int lent = day.length();
        String revers = "";
        for (int i = lent - 1; i >= 0; i--) {
            revers = revers + day.charAt(i);

        }
        System.out.println(revers);

        System.out.println("-------------Task by asghar------------------");
        String st = "Sunday";
        for (int i = st.length() - 1; i >= 0; i--) {
            System.out.print(st.charAt(i));
        }

    }
}
