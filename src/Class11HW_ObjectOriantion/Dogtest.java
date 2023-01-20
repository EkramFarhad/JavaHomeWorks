package Class11HW_ObjectOriantion;

public class Dogtest {
    public static void main(String[] args) {
        Dog husky = new Dog();

        husky.name = "Tom";
        husky.color = "White";
        husky.eyeColor = "Blue";
        husky.dogSound();


        Dog bullDog = new Dog();
        bullDog.name = "Shamtalo";
        bullDog.color = "White";
        bullDog.height = 31;
        bullDog.weight = 100;
        bullDog.dogSound();


        Dog labrador = new Dog();

        labrador.name = "Padilla";
        labrador.color = "Yellow";
        labrador.eyeColor = "black";
        labrador.dogSound();


    }
}
