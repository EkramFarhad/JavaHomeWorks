package Class16HW_Variables;

//1) Create a method that will accept an array as parameters and will return a sum of all elements from that array.
// Method should be visibly only within same package and accessible by the creating an instance of the class
public class Task1 {

    int sumAllElements(int[] num) {

        int sum = 0;

        for (int array : num) {

            sum += array;
        }
        return sum;


    }

    public static void main(String[] args) {

        int[] number = {23, 33, 45, 54};
        Task1 task1 = new Task1();
        System.out.println(task1.sumAllElements(number));


    }
}
