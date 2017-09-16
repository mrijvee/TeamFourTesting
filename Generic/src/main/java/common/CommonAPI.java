package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

class CommonAPI {
    public static WebDriver driver = null;

    public void whitespaces(){}

    public void setUp(String browserName, String os, String URL){
        System.out.println("session is going to start");
        getLocalDriver(browserName, os);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(URL);
        driver.manage().window().maximize();
    }

    public WebDriver getLocalDriver (String browserName, String os){
        browserName= browserName.toLowerCase();
        os = os.toLowerCase();

        if (browserName.contains("chrome")) {
            if (os.contains("win")) {
                System.setProperty("webdriver.chrome.driver", "../generic/driver/chromedriver.exe");
            }else if (os.contains("mac") || os.contains("os x")){
                System.setProperty("webdriver.chrome.driver", "../generic/driver/chromedriver");
            }else{
                System.err.println("ERROR: Invalid driver path");
            }
            driver = new ChromeDriver();

        }else if (os.contains("firefox")) {
            if (os.contains("win")) {
                System.setProperty("webdriver.gecko.driver", "../generic/driver/geckodriver.exe");
            }else if (os.contains("mac") || os.contains("os x")) {
                System.setProperty("webdriver.gecko.driver", "../generic/driver/geckodriver");

            }else {
                System.err.println("ERROR: Invalid driver path");

            }
            driver = new FirefoxDriver();
        }
        return driver;
    }
    public void finishUp(){
        System.out.println("session is over");
        driver.close();
    }
}

