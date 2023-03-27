package Class30HW_Map;

/*Create a Person class with following private fields: name, lastName, age, salary.
Variables should be initialized through constructor.
Inside the class also create a method to print user details.
In Test Class create a Map that will store key in ascending order.
In that map store personId and a Person Object. Print each object details.*/

import java.util.Map;
import java.util.TreeMap;

public class Task2 {
// just and empty class
}

class Person {

    private String name;
    private String lastName;
    private int age;
    private double salary;

    public Person(String name, String lastName, int age, double salary) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void printDetails() {
        System.out.println("Name " + name + " Last Name " + lastName + " Age " + age + " Salary " + salary);
    }
}

class Test {

    public static void main(String[] args) {

        Map<Integer, Person> store = new TreeMap<>();
        store.put(1, new Person("Bob", "Farhad", 25, 2000));
        store.put(2, new Person("Sharif", "karim", 40, 5000));

        for (Map.Entry<Integer, Person> print : store.entrySet()) {
            System.out.println(print.getKey());
            print.getValue().printDetails();

        }

    }
}