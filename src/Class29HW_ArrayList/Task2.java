package Class29HW_ArrayList;

import java.util.Iterator;
import java.util.TreeSet;

/*eCreate a Set collection in which you need to add names of the countries.
In this set we want all objects to be sorted in alphabetical order. Using 2
different ways retrieve all elements from set.*/
public class Task2 {

    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Russian");
        countries.add("Afghanistan");
        countries.add("Taiwan");
        countries.add("Dubai");

        System.out.println(countries);

        System.out.println("-------------");

        for(String s: countries){
            System.out.print(s+ " ");
        }

        // Iterator practice only not in task
        System.out.println("----------------");

        Iterator <String> itr = countries.iterator();

//        System.out.println(itr.next());
//        System.out.println(itr.hasNext());
//        System.out.println(itr.next());
//        itr.remove();
//        System.out.println(itr.hasNext());
//        System.out.println(itr.next());

        System.out.println("-------------");

        for (Iterator<String> it = itr; it.hasNext(); ) {
            String str = it.next();
            System.out.println(str);


        }


    }

}
