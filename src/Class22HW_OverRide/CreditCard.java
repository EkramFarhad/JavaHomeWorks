package Class22HW_OverRide;

/*
  Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate
  interest based on the given balance. Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
  Call the method by creating an object of each of the three classes.
*/

public class CreditCard {

    double balance;
    double interest;

    double calculate(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
        System.out.println(balance * interest / 100);
        return interest;
    }

}

class Visa extends CreditCard {

}

class AX extends CreditCard {

    double calculate(double balance, double interest) {
        this.balance = balance;
        this.interest = interest;
        System.out.println(balance * interest / 50);
        return interest;
    }


}


class Test {

    public static void main(String[] args) {

        System.out.println(" -------1st object--------");

        CreditCard creditCard = new CreditCard();
        creditCard.calculate(5000.5, 10.5);

        System.out.println(" -------2nd object--------");

        Visa visa = new Visa();
        visa.calculate(500, 10);

        System.out.println(" -------3rd object--------");

        AX ax = new AX();
        ax.calculate(5000.5, 10.5);


    }
}


