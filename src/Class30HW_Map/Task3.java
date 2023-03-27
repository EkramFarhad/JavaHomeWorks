package Class30HW_Map;

/*Create a Map that will store Employee name and salary.
Write a logic to retrieve an employee who gets the highest salary. Output should be in the below format
John Smith=$100000*/

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> highSalary = new HashMap<>();
        highSalary.put("John Smith", 100);
        highSalary.put("Bob Tom", 500);
        highSalary.put("Katrina Joe", 1000);
        highSalary.put("Albert Neko", 2000);
        highSalary.put("Edison Champ", 20000);

        String employeeSalary = null;
        int highestSalary = Integer.MIN_VALUE;

        for (Map.Entry<String, Integer> name : highSalary.entrySet()) {

            if (name.getValue() > highestSalary) {
                highestSalary = name.getValue();
                employeeSalary = name.getKey();
            }

        }
        System.out.println(employeeSalary + "= $" + highestSalary);
    }
}
