package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI{

    @FindBy(how = How.CSS, using = "#claim-btn")
    public static WebElement claimReport;
    @FindBy(how = How.CSS, using = "#zip")
    public static WebElement enterZip;
    @FindBy(how = How.CSS, using = "#submitButton")
    public static WebElement startQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='accessibility-main-content']/div[2]/div/div[1]/div/div/ul/li[1]/a")
    public static WebElement makeAPayment;
    @FindBy(how = How.XPATH, using = ".//*[@id='accessibility-main-content']/div[2]/div/div[1]/div/div/ul/li[2]/a")
    public static WebElement getIDCard;

    public void reportAClaim() throws InterruptedException {
        claimReport.click();
        Thread.sleep(2000);
    }

    public void setStartQuote() throws InterruptedException {
        enterZip.sendKeys("11417");
        startQuote.click();
        Thread.sleep(2000);
    }

    public void setMakeAPayment() throws InterruptedException {
        makeAPayment.click();
        Thread.sleep(2000);
    }

    public void retrieveIDCard() throws InterruptedException {
        getIDCard.click();
        Thread.sleep(2000);
    }
}
