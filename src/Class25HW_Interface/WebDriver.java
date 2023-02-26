package Class25HW_Interface;
/*

Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
 */

public interface WebDriver {

    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}

class ChromeDriver implements WebDriver {


    @Override
    public void openBrowser() {

        System.out.println("Open the browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close thr browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the window");

    }

    @Override
    public void findElement() {
        System.out.println("Find the Element");

    }
}

class firFoxDriver implements WebDriver{

    @Override
    public void openBrowser() {

        System.out.println("Open the next browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("Close the next browser");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maximize the next window");

    }

    @Override
    public void findElement() {
        System.out.println("find the next element");

    }
}
