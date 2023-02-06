package Class17HW_Constractor;

public class Task4Tester {
    /*4)Write program that have static constructor and observe result.*/
    public static void main(String[] args) {

        Task4 task4 = new Task4("John","Robit",34,"Driver");
        task4.printInfo();

        Task4 task41 = new Task4("Cristian","Ronaldo", 45,"Footballer");
        task41.printInfo();



    }


}
