package Class23HW_Polyemprphism;

/*
Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.
*/

public class Computer {

    void screen(){
        System.out.println("All computer has screen");
    }
    void hardDisc(){
        System.out.println("All computer has hard disc");
    }
    void ram (){
        System.out.println("All computer has ram");
    }


}

class Apple extends Computer {
    @Override
    public void screen() {
        System.out.println("Mackbooks are good in charging");

    }
}

class Lenovo extends Computer{

    @Override
    void screen() {
        System.out.println("it is a nice computer");
    }

    @Override
    void hardDisc() {
        super.hardDisc();
    }

    @Override
    void ram() {
        super.ram();
    }
}
class HP extends Computer{

    @Override
    void screen() {
        super.screen();
    }

    @Override
    void hardDisc() {
        super.hardDisc();
    }

    @Override
    void ram() {
        super.ram();
    }
}
class Dell extends Computer{

    @Override
    void screen() {
        super.screen();
    }

    @Override
    void hardDisc() {
        super.hardDisc();
    }

    @Override
    void ram() {
        super.ram();
    }
}
