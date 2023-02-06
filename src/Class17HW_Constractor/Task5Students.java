package Class17HW_Constractor;

public class Task5Students {
    /*5) Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables. Print name & address
    of given  student using displayInfo method.
    */


    String name;
    String Address;

    Task5Students (String StudentName, String StudentAddress){

        name=StudentName;
        Address=StudentAddress;

    }

    public void displayInfo (){
        System.out.println("StudentName: " +name+ ", StudentAddress: " + Address);
    }

    //----------------------objectClass----------------------
    public static void main(String[] args) {

        Task5Students students = new Task5Students("Karima", "2925 sout carolina 09876");

        students.displayInfo();
    }

}
