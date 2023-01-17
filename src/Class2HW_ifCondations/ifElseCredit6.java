package Class2HW_ifCondations;

public class ifElseCredit6 {
    public static void main(String[] args) {
        /*
        Create a Java program that will ask if user has a credit card or not.
        If you user does not have a credit card then offer them. If they do have one ask
        what is balance on the card? If balance of the card is larger than 1000, tell them
        to pay off immediately, otherwise you can tell them that they can spend more.
         */

        boolean credit= true;
        int balance = 1000;

        if (credit == true){
            System.out.println("What is the balance of the card?");
            if(balance >= 1000){
                System.out.println("Pleas pay off your balance immediately.");
            }else{
                System.out.println("you can spend more");
            }
        }else{
            System.out.println("Do want to have a credit card?");
        }
    }
}
