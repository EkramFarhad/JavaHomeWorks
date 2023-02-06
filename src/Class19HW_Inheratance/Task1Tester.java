package Class19HW_Inheratance;

public class Task1Tester {
    public static void main(String[] args) {

        Task1 classA = new Task1();
        classA.make="BMW";
        classA.model="i7";
        classA.year=2023;
        classA.basicModel();
        System.out.println("-----------------------");

        ClassB classB = new ClassB();
        classB.make="BMW";
        classB.model="i7s";
        classB.year=2023;
        classB.term="sType";
        classB.colorSelection="White";
        classB.sModel();
        System.out.println("------------------------");

        ClassC classC = new ClassC();
        classC.make="BMW";
        classC.model="i7ss";
        classC.year=2023;
        classC.term="luxury";
        classC.lastModel();



    }
}
