package Class12HW_Method;

import java.util.Scanner;

public class Task3 {
    /*

    3) Write a program that reads two people's first
    names and if they're expecting boy or girl?
    Based on the input suggests a name for a baby:
    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? boy
    Suggested baby name: DANRY

    Example Output:
    Mom’s first name? Mary
    Dad’s first name? Daniel
    Boy or Girl? girl
    Suggested baby name: MAIEL
    */
    public static void main(String[] args) {
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Mom's First name");
//        String mom = input.next();
//        System.out.println("Dad's First name");
//        String dad = input.next();
//        System.out.println("Boy or Girl ?");
//        String babeName = input.next();
//        if (babeName.equalsIgnoreCase("Boy")) {
//            System.out.println("DANRY");
//        } else if (babeName.equalsIgnoreCase("Girl")) {
//            System.out.println("MAIEL");
//        } else {
//            System.out.println("Please type only Girl or Boy.");

//        }


        String dadsName="Zafar";
        String momsName="Hamid";
        String expectation="girl";
        String firstHalf="";
        String secondHalf="";
        if(expectation.equalsIgnoreCase("boy")){
            firstHalf=dadsName.substring(0,dadsName.length()/2);
            secondHalf=momsName.substring(momsName.length()/2);

        }else {
            firstHalf=momsName.substring(0,momsName.length()/2);
            secondHalf=dadsName.substring(dadsName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);


    }
}
