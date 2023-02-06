package Class19HW_Inheratance;

/*Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
 Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher that would have
 it their own features and behaviour. Test all 4 classes*/

public class Task3_Teacher {

    String firstName;
    String lastName;
    String id;
    String subject;

    void teach() {
        System.out.println(" Teachers are the skeleton of a country");
    }

}

class MathTeacher extends Task3_Teacher {

    int teachingHours;
    int experience;

   public static void math() {
        System.out.println("Math teachers play important roll in a society");
    }
}

class ChemistryTeacher extends  Task3_Teacher{

    int teachingHours;
    int experience;
    int timeInLibrary;

    void chemistry() {
        System.out.println(" Chemistry Teacher needs more time to get experience");
    }

}

class PianoTeacher extends Task3_Teacher {
    String instrument;

    void piano() {
        System.out.println(" Piano teachers always ask you to play");
    }
}
