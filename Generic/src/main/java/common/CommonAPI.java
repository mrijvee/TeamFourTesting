package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class CommonAPI {

    public static WebDriver driver = null;

    @Parameters({"browserName", "os", "URL"})
    @BeforeMethod
    public void startingTheBrowser(String browserName, String os, String URL){
        System.out.println("Starting the browser");
        getLocalDriver(browserName, os);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
        driver.get(URL);
        driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver (String browserName, String os) {
        browserName = browserName.toLowerCase();
        os = os.toLowerCase();

        if (browserName.equalsIgnoreCase("chrome")) {
            if (os.equalsIgnoreCase("win")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver.exe");
            } else if (os.equalsIgnoreCase("mac") || os.equalsIgnoreCase("os x")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/driver/chromedriver");
            } else {
                System.err.println("ERROR: Invalid driver path");
            }
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            if (os.equalsIgnoreCase("win")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver.exe");
            } else if (os.equalsIgnoreCase("mac") || os.equalsIgnoreCase("os x")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/driver/geckodriver");

            } else {
                System.err.println("ERROR: Invalid driver path");
            }
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("ie")) {
            if (os.equalsIgnoreCase("win")) {
                System.setProperty("webdriver.ie.driver", "../Generic/driver/IEDriverServer.exe");
            } else if (os.equalsIgnoreCase("mac") || os.equalsIgnoreCase("os x")) {
                System.setProperty("webdriver.ie.driver", "../Generic/driver/IEDriverServer");

            } else {
                System.err.println("ERROR: Invalid driver path");
            }
            driver = new InternetExplorerDriver();
        }
        return driver;
    }

    @AfterMethod
    public void endingTheBrowser() throws InterruptedException {
        System.out.println("Ending the browser");
        Thread.sleep(1000);
        driver.close();
    }
}