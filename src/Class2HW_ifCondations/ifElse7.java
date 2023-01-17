package Class2HW_ifCondations;

public class ifElse7 {
    public static void main(String[] args) {
        /*
        Write a program to ask user to enter numbers of worked years and annual salary.
        If user worked for more or equals to 5 years than user is eligible for the bonus,
        otherwise he is not. Once user is eligible and salary is larger than 50000 than
        bonus = 5000, otherwise bonus=3000.
        */

        int user = 5;
        int salary = 50001 ;

        if (user >= 5){
            System.out.println("you are illegible for bonus");
            if(salary > 50000){
                System.out.println("your bonus is 5000");
            }else{
                System.out.println("your bonus is 3000");
            }
        }else{
            System.out.println("Sorry you are not illegible for bonus");
        }
    }
}
