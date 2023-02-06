package Class19HW_Inheratance;

/*Write program for multilevel inheritance where class C inherits from class B and Class B inherits from Class A.*/

public class Task1 {
    String make;
    String model;
    int year;

    void basicModel() {
        System.out.println("Make "+ make + " Model " + model + " Year " + year);
    }
}

class ClassB extends Task1 {

    String term;
    String colorSelection;

    void sModel() {
        System.out.println("Make "+ make + " Model " + model + " Year " + year + " Term " +term +
                " ColorSelection " + colorSelection);
    }
}

class ClassC extends ClassB {

    String luxury;

    void lastModel() {
        System.out.println("Make "+ make + " Model " + model + " Year " + year + " Term " +term +
                " ColorSelection" + colorSelection + " luxury" + luxury);
    }
}
