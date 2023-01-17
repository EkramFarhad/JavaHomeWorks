package Class9HW_Array;

public class Task5 {
    public static void main(String[] args) {

        int[] num = new int [5];

        num[0] = 5;
        num[1] = 10;
        num[2] = 20;
        num[3] = 30;
        num[4] = 40;

        int sum =0;
        for(int i =0; i<num.length;i++){
            sum=sum+num[i];
        }
        System.out.println(sum);
    }
}
