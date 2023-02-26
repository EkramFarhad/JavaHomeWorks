package Class29HW_ArrayList;

import java.util.ArrayList;
import java.util.HashSet;

/*How can you remove all duplicates from ArrayList?*/


public class Task1 {
    public static void main(String[] args) {
       // ArrayList <String> arrayList = new ArrayList<>();

        HashSet<String> arrayList = new HashSet<>();
        arrayList.add("John");
        arrayList.add("Jane");
        arrayList.add("James");
        arrayList.add("Jasmine");
        arrayList.add("Jane");
        arrayList.add("James");

        System.out.println(arrayList);
    }


}
