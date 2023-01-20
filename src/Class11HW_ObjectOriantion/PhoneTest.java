package Class11HW_ObjectOriantion;

public class PhoneTest {

    public static void main(String[] args) {

        Phone iphone = new Phone();

        iphone.name = "ProMax";
        iphone.carriarLocked = false;
        iphone.color = "White";
        iphone.company = "apple";
        iphone.screenSize = 7.3;
        iphone.testQuality();


        Phone pixel = new Phone();
        pixel.name = "Pixel 5";
        pixel.company = "Google";
        pixel.color = "red";
        pixel.globalShipping();


        Phone samsung = new Phone();
        samsung.company = "Samsung";
        samsung.color = "Black";
        samsung.screenSize = 5.4;
        samsung.name = "note3";
        samsung.globalShipping();
        samsung.testQuality();
        samsung.carriarLocked = true;
    }
}
