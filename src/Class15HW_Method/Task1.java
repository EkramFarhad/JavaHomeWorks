package Class15HW_Method;

public class Task1 {

    int largeNum(int num1, int num2) {

        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }

    }

    public static void main(String[] args) {
        Task1 firstTask = new Task1();
        int largeNumber = firstTask.largeNum(50, 70);
        System.out.println(largeNumber);
    }
}
