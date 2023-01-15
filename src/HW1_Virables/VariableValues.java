package HW1_Virables;

public class VariableValues {

    public static void main(String[] args) {
        // actual values
        byte smallNum = 127;
        short medNum = 500;
        int medNum2 = 5000;
        long  longNum = 10000000l;
        float dec1 = 383124124134.183413131311533512412121243124314312412412412412412431243124134f;
        double dec2 = 6666.239485729;
        char oneChar = 'Y';
        boolean yes = true;
        String text = " Hello world ";

        // re assign values

        medNum = 700;
        medNum2 = 10000;
        longNum = 45678l;
        dec1 = 5544.34f;
        dec2 = 2345.345262;
        oneChar = 'N';
        yes = false;
        text = "Good Morning";

        // print out new value

        System.out.println(smallNum);
        System.out.println(medNum);
        System.out.println(medNum2);
        System.out.println(longNum);
        System.out.println(dec1);
        System.out.println(dec2);
        System.out.println(oneChar);
        System.out.println(yes);
        System.out.println(text);
    }
}
