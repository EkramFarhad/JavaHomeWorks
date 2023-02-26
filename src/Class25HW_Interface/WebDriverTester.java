package Class25HW_Interface;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver[] browser = {new firFoxDriver(), new ChromeDriver()};

        for (int i = 0; i < browser.length; i++) {

            WebDriver web = browser[i];
            web.openBrowser();
            web.closeBrowser();
            web.maximizeWindow();
            web.findElement();

            System.out.println("-----------------forEach loop----------");

            for (WebDriver dr : browser) {
                dr.openBrowser();
                dr.closeBrowser();
                dr.maximizeWindow();
                dr.findElement();
            }

        }


    }
}
