package Class19HW_Inheratance;

/*Write program to inherit class A that has method printF which is static and call or reuse that method into class B*/

public class Task2 {
    String firstName;
    String lastName;
    void printF( String firstName, String lastName) {


        System.out.println(" First Name" + firstName + "Last Name" + lastName);
    }
}

class SecondClass extends Task2 {

    String fullName;

    void secondM() {

        System.out.println("Last Name" + fullName);
    }

}
