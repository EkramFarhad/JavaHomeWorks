package Class13HW_StringBuldier;

public class Task5 {
        //    5) How would you check if String is palindrome or not? aba=> true
        //Abbc =>false
    public static void main(String str) {

        StringBuilder st=new StringBuilder(str);
        st.reverse();
        String reversedStr=st.toString();
        if(str.equals(reversedStr)){
            System.out.println(str+" is palindrome");
        }else{
            System.out.println(str+"Not is palindrome");
        }

    }
}
