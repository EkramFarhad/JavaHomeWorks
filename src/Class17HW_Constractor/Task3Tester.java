package Class17HW_Constractor;

public class Task3Tester {
    /*
    3) Write a java class that have 4 constructors with 4 different access levels of
    constructors(private,public,default,protected) and create 4 objects of this class: 1 - inside
    same class; 2 - from outside the class; 3 - from different class inside different package  and observe result.
    */

    public static void main(String[] args) {
        Task3 task3SamePackage = new Task3(" Naweed "," Farid ",44," Carpenter ");
        task3SamePackage.printInfo();
    }

}
