package Class17HW_Constractor;

public class Task4 {
    /*4)Write program that have static constructor and observe result.*/

    String firstName;
    String lastName;
    int age;
    String jobTitle;

    Task4(String employeeFirstName, String employeeLastName, int employeeAge, String employeeJobTitle) {

        firstName = employeeFirstName;
        lastName = employeeLastName;
        age = employeeAge;
        jobTitle = employeeJobTitle;

    }

    public void printInfo() {

        System.out.println("FirstName: " + firstName + " LastName: " + lastName + " Age: " + age + " JobTitle: " + jobTitle);

    }


    void main(String[] args) {

        Task4 task4 = new Task4("John", "Robit", 34, "Driver");
        task4.printInfo();

        Task4 task41 = new Task4("Cristian", "Ronaldo", 45, "Footballer");
        task41.printInfo();


    }

}
