package Class20HW_SuperKeyword;
/*Create an Employee class that will have variables and methods. Constructor that should initialize instance variables
Create 2 subclasses FullTime and PartTime Employees that should have own variables and methods.
Create a Tester Subclass from FullTime Employee and add some features and methods to the Tester Class.
Test your code!*/

public class Employee {
    String firstName;
    String lastName;
    int idNumber;

    Employee(String firstName, String lastName, int idNumber){
        this.firstName=firstName;
        this.lastName=lastName;
        this.idNumber=idNumber;
    }

    void EmployeeInfo (){
        System.out.println(" First Name " + firstName + "Last Name" + lastName + "Employee ID " + idNumber);
    }
}
