package Class2HW_ifCondations;

public class ifElse4 {
    public static void main(String[] args) {
        /*
         You are DMV representative, and you need to ask customer their age.
         If they are 18 and older you will issue a driver licence to them,
         otherwise you will offer them to get a learners permit.
        */

     int age = 17;
     if(age >= 18){
         System.out.println("your are qualify to get your driver licence");
     }else{
         System.out.println("Sorry, now you are under age. Only you can get the permit.");
        }
    }
}
