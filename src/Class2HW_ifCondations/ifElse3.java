package Class2HW_ifCondations;

public class ifElse3 {
    public static void main(String[] args) {
        /*
         You are a loan specialist, and you need to ask user what is the amount of loan is needed.
         If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
         */

        int loanAmount = 200001;

        if(loanAmount <= 200000){
            System.out.println("Ok, I pay you the money");
        }else{
            System.out.println("Sorry, I can't pay you More than 200K.");
        }


    }
}
