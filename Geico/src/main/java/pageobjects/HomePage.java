package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#claim-btn")
    private static WebElement claimReport;
    @FindBy(how = How.CSS, using = "#zip")
    private static WebElement enterZip;
    @FindBy(how = How.CSS, using = "#submitButton")
    private static WebElement startQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='accessibility-main-content']/div[2]/div/div[1]/div/div/ul/li[1]/a")
    private static WebElement makeAPayment;
    @FindBy(how = How.XPATH, using = ".//*[@id='accessibility-main-content']/div[2]/div/div[1]/div/div/ul/li[2]/a")
    private static WebElement getIDCard;
    @FindBy(how = How.XPATH, using = ".//*[@id='footer-links-secondary']/ul/li[4]/a")
    private static WebElement contactUs;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[1]/a")
    private static WebElement questionRegardingPayment;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[2]/a")
    private static WebElement questionRegardingUserPass;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[3]/a")
    private static WebElement questionRegardingOnlineAccount;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[4]/a")
    private static WebElement questionRegardingCoverageAndDeductible;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[5]/a")
    private static WebElement questionRegardingAccidentForgiveness;
    @FindBy(how = How.CSS, using = ".icon-search.right-icons-separator")
    private static WebElement search;
    @FindBy(how = How.XPATH, using = ".//.//*[@id='primary-navigation']/div[6]/form/input")
    private static WebElement inputValue;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[6]/form/button")
    private static WebElement searchSubmit;
    @FindBy(how = How.XPATH, using = ".//*[@id='header-right-links']/ul[1]/li[1]/a/span[2]")
    private static WebElement updateZip;
    @FindBy(how = How.NAME, using = "user-zip")
    private static WebElement enterNewZip;
    @FindBy(how = How.CSS, using = "#geo-submit")
    private static WebElement submitUpdate;
    @FindBy(how = How.XPATH, using = ".//*[@id='header-left-links']/ul[1]/li[1]/a")
    private static WebElement productLists;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/a/span[2]")
    private static WebElement vehicleInsurance;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[2]/a/span[2]")
    private static WebElement propertyInsurance;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[3]/a/span[2]")
    private static WebElement businessInsurance;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[4]/a/span[2]")
    private static WebElement additionalnsurance;



    public void reportAClaim() throws InterruptedException {
        claimReport.click();
        Thread.sleep(1000);
    }

    public void setStartQuote() throws InterruptedException {
        enterZip.sendKeys("11417");
        startQuote.click();
        Thread.sleep(1000);
    }

    public void setMakeAPayment() throws InterruptedException {
        makeAPayment.click();
        Thread.sleep(1000);
    }

    public void retrieveIDCard() throws InterruptedException {
        getIDCard.click();
        Thread.sleep(1000);
    }

    public void setContactUs() throws InterruptedException {
        contactUs.click();
        Thread.sleep(1000);
        questionRegardingPayment.click();
        Thread.sleep(1000);
        driver.navigate().back();
        questionRegardingUserPass.click();
        Thread.sleep(1000);
        driver.navigate().back();
        questionRegardingOnlineAccount.click();
        Thread.sleep(1000);
        driver.navigate().back();
        questionRegardingCoverageAndDeductible.click();
        Thread.sleep(1000);
        driver.navigate().back();
        questionRegardingAccidentForgiveness.click();
        Thread.sleep(1000);
    }

    public void setSearch() throws InterruptedException {
        Actions searchGeico = new Actions(driver);
        searchGeico.moveToElement(search).perform();
        Thread.sleep(1000);
        inputValue.sendKeys("GEICO Careers");
        Thread.sleep(1000);
        searchSubmit.click();
        Thread.sleep(1000);
    }

    public void setUpdateZip()  {
        Actions updateZipCode = new Actions(driver);
        updateZipCode.moveToElement(updateZip).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enterNewZip.sendKeys("11416");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        submitUpdate.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public WebElement productsDropDown(String setVehicleInsurance, String setPropertyInsurance,
                                   String setBusinessInsurance) throws InterruptedException {
        Actions getListOfProducts = new Actions(driver);
        getListOfProducts.moveToElement(productLists).perform();
        Thread.sleep(1000);
        if (setVehicleInsurance.equalsIgnoreCase("vehicle insurance")) {
            getListOfProducts.moveToElement(vehicleInsurance).perform();
            Thread.sleep(1000);
        } else if (setPropertyInsurance.equalsIgnoreCase("property insurance")) {
            getListOfProducts.moveToElement(propertyInsurance).perform();
            Thread.sleep(1000);
        } else if (setBusinessInsurance.equalsIgnoreCase("business insurance")) {
            getListOfProducts.moveToElement(businessInsurance).perform();
            Thread.sleep(1000);
        } else {
            getListOfProducts.moveToElement(additionalnsurance).perform();
            Thread.sleep(1000);
        }
        return additionalnsurance;
    }
}


