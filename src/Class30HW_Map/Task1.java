package Class30HW_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*Create a map of Best Buy store. Place
item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
Retrieve all keys and values from a Best Buy map using EntrySet.*/
public class Task1 {

    public static void main(String[] args) {

        Map<Integer, String> bestBuyStore = new HashMap<>();
        bestBuyStore.put(1, "Computer");
        bestBuyStore.put(3, "Phone");
        bestBuyStore.put(6, "Watch");
        bestBuyStore.put(4, "Printer");

       Set<Map.Entry<Integer, String>> all = bestBuyStore.entrySet();
        System.out.println(all);

        for(Map.Entry<Integer, String> i: all){
            System.out.println(i);

        }


    }
}
