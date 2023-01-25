package Class12HW_Method;


public class Task1 {
    /*
    1) Create a String and if the String is not empty perform the following:
    if the String has an odd number of characters and has 3 or more characters,
    print the character in the middle of the String.For Example String str=hello =>l
    */
    public static void main(String[] args) {

        String str="Java";
        if(!str.isEmpty()){
            //str.length()%2!=0 checks if number of characters are odd
            if(str.length()%2!=0&& str.length()>3){
                int middle=str.length()/2;
                System.out.println(str.charAt(middle));
            }
        }




    }
}
