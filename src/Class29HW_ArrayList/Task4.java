package Class29HW_ArrayList;

import java.util.HashMap;
import java.util.Iterator;

/*Create a Set collection that will hold Objects of Student Type.
In this set we do not care about the insertion order. Each student object should have name and studentID.
Display name of each student.*/
public class Task4 {
    public static void main(String[] args) {


        HashMap<String, Integer> student = new HashMap<>();
        student.put("Ekram", 1);
        student.put("John", 10);
        student.put("Farhad", 2);
        student.put("Tom", 5);
        student.put("Safi", 22);
        student.put("Sam", 15);

        System.out.println(student);


    }
}
