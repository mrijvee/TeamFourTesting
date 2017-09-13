package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GeicoHomePage extends CommonAPI{

    @FindBy(how = How.CSS, using = "#claim-btn")
    public static WebElement claimReport;

    @FindBy(how = How.CSS, using = "#zip")
    public static WebElement geicoZipCode;

    @FindBy(how = How.XPATH, using = ".//*[@id='accessibility-main-content']/div[2]/div/div[1]/div/div/ul/li[1]/a")
    public static WebElement makePayments;

    public void reportAClaim() throws InterruptedException {
        claimReport.click();
        Thread.sleep(2000);
    }

    public void zipCodeToGetQuote() throws InterruptedException {
        geicoZipCode.sendKeys("11417");
        Thread.sleep(2000);
    }

    public void makePayments() {

    }

}
