package Class20HW_SuperKeyword;

public class FullTimeEmployee extends Employee {

    String fullBenefits;
    int retirement;


    FullTimeEmployee(String firstName, String lastName, int idNumber, String fullBenefits, int retirement) {
        super(firstName, lastName, idNumber);
        this.fullBenefits = fullBenefits;
        this.retirement = retirement;
    }

    void fullTimeEmployeeIngo() {

        System.out.println("This is the full time employee info" + fullBenefits + " Retirement " + retirement);
    }

}
