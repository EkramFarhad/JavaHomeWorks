package Class15HW_Method;

public class Task2 {

    int OddOrEventNumber(int num) {

        if (num % 2 == 0) {
            System.out.println("Even Number");
            return num;

        } else {
            System.out.println("Odd Number");
            return num;

        }

    }

    public static void main(String[] args) {
        Task2 secondTask = new Task2();
        int number = secondTask.OddOrEventNumber(20);
        System.out.println(number);
    }

}
