package Class23HW_Polyemprphism;


import java.util.concurrent.Callable;

public class ComputerTester {

    public static void main(String[] args) {
        Computer[] com = {new HP(), new Dell(), new Lenovo(), new Apple()};

        for (Computer allComputers : com) {
            allComputers.screen();
            allComputers.hardDisc();
            allComputers.ram();
        }

    }
}
