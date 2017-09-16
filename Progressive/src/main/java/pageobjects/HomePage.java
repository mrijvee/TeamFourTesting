package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='primary']/div/ul[1]/li[1]/span[1]/a")
    public static WebElement autoAndPropertyQuote;
    @FindBy(how = How.CSS, using = ".fake-hover>a")
    public static WebElement autoPluHomeBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='zipCode_ueno']")
    public static WebElement autoPropertyZip;
    @FindBy(how = How.XPATH, using = ".//*[@id='qsButton_ueno']")
    public static WebElement getAQuoteBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='NameAndAddressFormModel_FirstName_Value_Label']")
    public static WebElement autoPropertyFirstName;
    @FindBy(how = How.XPATH, using = ".//*[@id='NameAndAddressFormModel_MiddleInitial_Value_Label']")
    public static WebElement autoPropertyMiddleName;
    @FindBy(how = How.XPATH, using = ".//*[@id='NameAndAddressFormModel_LastName_Value_Label']")
    public static WebElement autoPropertyLastName;
    @FindBy(how = How.XPATH, using = ".//*[@id='NameAndAddressFormModel_MailingAddress_Value_Label']")
    public static WebElement autoPropertyAddress;
    @FindBy(how = How.XPATH, using = ".//*[@id='NameAndAddressFormModel_ApartmentUnit_Value_Label']")
    public static WebElement autoPropertyAptNum;
    @FindBy(how = How.XPATH, using = ".//*[@id='NameAndAddressFormModel_City_Value']")
    public static WebElement autoPropertyCity;
    @FindBy(how = How.XPATH, using = ".//*[@ng-show='dateModel.month.length == 0']")
    public static WebElement autoPropertyDOBMonth;
    @FindBy(how = How.XPATH, using = ".//*[@ng-show='dateModel.day.length == 0']")
    public static WebElement autoPropertyDOBDay;
    @FindBy(how = How.XPATH, using = ".//*[@ng-show='dateModel.year.length == 0']")
    public static WebElement autoPropertyDOBYear;
    @FindBy(how = How.XPATH, using = ".//*[@id='next']")
    public static WebElement autoPropertyStartQuoteBox;


    public void setAutoAndPropertyQuote(String clickAutoPlusHomeBox, String inputAutoPropertyZip, String inputAutoPropertyFirstName, String inputAutoPropertyMiddleName,
                                        String inputAutoPropertyLastName, int inputSuffix, String inputAutoPropertyAddress, String inputAutoPropertyAptNum,
                                        String inputAutoPropertyCity, String inputAutoPropertyDOBMonth, String inputAutoPropertyDOBDay,
                                        String inputAutoPropertyDOBYear) throws InterruptedException {
        autoAndPropertyQuote.click();
        autoPropertyZip.sendKeys(inputAutoPropertyZip);
        if (clickAutoPlusHomeBox.equalsIgnoreCase("auto + home")) {
            autoPluHomeBox.click();
        }
        getAQuoteBox.click();
        Thread.sleep(1500);
        autoPropertyFirstName.sendKeys(inputAutoPropertyFirstName);
        autoPropertyMiddleName.sendKeys(inputAutoPropertyMiddleName);
        autoPropertyLastName.sendKeys(inputAutoPropertyLastName);
        Select suffix = new Select(driver.findElement(By.xpath(".//*[@id='NameAndAddressFormModel_Suffix_Value']")));
        suffix.selectByIndex(inputSuffix);
        autoPropertyAddress.sendKeys(inputAutoPropertyAddress);
        autoPropertyAptNum.sendKeys(inputAutoPropertyAptNum);
        autoPropertyCity.sendKeys(inputAutoPropertyCity);
        autoPropertyDOBMonth.sendKeys(inputAutoPropertyDOBMonth);
        autoPropertyDOBDay.sendKeys(inputAutoPropertyDOBDay);
        autoPropertyDOBYear.sendKeys(inputAutoPropertyDOBYear);
        autoPropertyStartQuoteBox.click();
        Thread.sleep(1500);
    }
}
