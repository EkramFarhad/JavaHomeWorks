package Class17HW_Constractor;

public class Task3 {
    /*
    3) Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside
    same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.

    */


    String name;
    String lastName;
    int age;
    String jobTitle;
    String degree;

    private Task3(String sName, String sLastName, int sAge, String sJobTitle, String sDegree){

        name=sName;
        lastName=sLastName;
        age=sAge;
        jobTitle=sJobTitle;
        degree=sDegree;
    }

    protected Task3(String sName, String sLastName, int sAge, String sJobTitle){

        name=sName;
        lastName=sLastName;
        age=sAge;
        jobTitle=sJobTitle;
    }
    public Task3(String sName, String sLastName, int sAge){

        name=sName;
        lastName=sLastName;
        age=sAge;

    }
   Task3(String sName, String sLastName){

        name=sName;
        lastName=sLastName;

    }

    public void printInfo(){
        System.out.println("Name" + name+ "LastName"+ lastName + "Age" + age + "JobTitle"+jobTitle + "Degree" + degree);
    }

    //--------------------------------object of the class----------------------------//

    public static void main(String[] args) {


        Task3 task3InClassObject = new Task3(" Karim "," Nadim ",35," Doctor "," Master ");
        Task3 task3InClassObject2 = new Task3(" Karim "," Nadim ",35," Doctor "," Master ");

        task3InClassObject.printInfo();
        task3InClassObject2.printInfo();
    }







}
