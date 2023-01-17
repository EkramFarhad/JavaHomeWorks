package Class2HW_ifCondations;

public class ifElse2 {
    public static void main(String[] args) {
        /*
          Create a Java program and store values of mortgage rate and mortgage price.
          First, program should check if rate is higher than 4.5 user will not buy a house,
          otherwise user will consider buying. Once user decides to buy a house,
          if price of the house is larger than 200000 than user will take a loan,
          otherwise user will pay cash.
         */

        Double mortgageRate = 4.1;
        int mortgagePrice = 200001;

        if (mortgageRate >= 4.5) {
            System.out.println("Sorry I will not buy the house for now");
        } else {
            System.out.println("Ok, I consider to buy the hose");
            if (mortgagePrice > 200000) {
                System.out.println("I need to take loan to make the deal");
            } else {
                System.out.println("I pay cash");
            }
        }
    }
}
