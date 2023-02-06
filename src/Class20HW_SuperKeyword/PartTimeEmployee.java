package Class20HW_SuperKeyword;

public class PartTimeEmployee extends Employee {
    String noBenefits;
    int noRetirement;

    PartTimeEmployee(String firstName, String lastName, int idNumber, String noBenefits, int noRetirement) {
        super(firstName, lastName, idNumber);
        this.noBenefits = noBenefits;
        this.noRetirement = noRetirement;
    }

    void partTimeEmployeeInfo() {
        System.out.println("This is the part time employee info" + "No Benefits" + noBenefits + " No Retirement " + noRetirement);
    }

}
