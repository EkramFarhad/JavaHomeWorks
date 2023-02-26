package Class29HW_ArrayList;

/*Create a Set of cities in which you want to make sure that insertion order is maintained.
Then remove any city that starts with “A”.*/

import java.util.TreeSet;

public class Task3 {
    public static void main(String[] args) {
        TreeSet<String> cities = new TreeSet<>();
        cities.add("California");
        cities.add("Kabul");
        cities.add("NewYork");
        cities.add("Sacramento");
        cities.add("Folsom");
        cities.add("Novato");
        cities.add("Afghanistan");

        System.out.println(cities);


        cities.removeIf(x -> x.startsWith("A"));
        System.out.println(cities);
    }
}
