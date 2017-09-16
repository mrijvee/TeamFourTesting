package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutoInsurance extends CommonAPI{

    @FindBy(how = How.XPATH, using = ".//input[@id='zip']")
    public static WebElement enterNewZip;
    @FindBy(how = How.XPATH, using = ".//*[@id='submit']")
    public static WebElement getFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='content']/section[3]/div/div/div/div/a[2]/span[1]")
    public static WebElement discountsForAges50AndUp;
    @FindBy(how = How.XPATH, using = ".//*[@id='BVRRRatingsHistogramButtonScript_h8ck63w8dxe4sqnsgww7nmsvl_ID']/img")
    public static WebElement reviews;
    @FindBy(how = How.XPATH, using = ".//*[@id='firstName']")
    public static WebElement firtNameForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='lastName']")
    public static WebElement lastNameForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='street']")
    public static WebElement addressForFreeQuote;



    public void setGetFreeQuote(String inputZipCode) throws InterruptedException {
        enterNewZip.sendKeys(inputZipCode);
        getFreeQuote.click();
        Thread.sleep(1500);

    }

    public void setDiscountsForAges50AndUp() {
        discountsForAges50AndUp.click();
        Actions customerReviews = new Actions(driver);
        customerReviews.moveToElement(reviews).perform();
    }

}
