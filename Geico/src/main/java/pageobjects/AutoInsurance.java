package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AutoInsurance extends CommonAPI{

    @FindBy(how = How.XPATH, using = ".//input[@id='zip']")
    public static WebElement enterNewZip;
    @FindBy(how = How.XPATH, using = ".//*[@id='submit']")
    public static WebElement getFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='content']/section[3]/div/div/div/div/a[2]/span[1]")
    public static WebElement discountsForAges50AndUp;
    @FindBy(how = How.XPATH, using = ".//*[@id='readLink']/a")
    public static WebElement customerReviews;
    @FindBy(how = How.XPATH, using = ".//*[@id='firstName']")
    public static WebElement firstNameForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='lastName']")
    public static WebElement lastNameForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='street']")
    public static WebElement addressForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='apt']")
    public static WebElement aptNumberForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='date-monthdob']")
    public static WebElement monthDOBForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='date-daydob']")
    public static WebElement dayDOBForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='date-yeardob']")
    public static WebElement yearDOBForFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='btnSubmit']")
    public static WebElement submitToGetFreeQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='vehicleForm']/div[1]/div[16]/div[2]/div/div/div/label[1]")
    public static WebElement carOwned;
    @FindBy(how = How.XPATH, using = ".//*[@id='vehicleForm']/div[1]/div[16]/div[2]/div/div/div/label[2]")
    public static WebElement carFinanced;
    @FindBy(how = How.XPATH, using = ".//*[@id='vehicleForm']/div[1]/div[16]/div[2]/div/div/div/label[3]")
    public static WebElement carLeased;
    @FindBy(how = How.XPATH, using = ".//*[@id='vehicleForm']/div[1]/div[17]/div[3]/div[2]/div/div/div/label[1]")
    public static WebElement vehicleForCommuting;
    @FindBy(how = How.XPATH, using = ".//*[@id='vehicleForm']/div[1]/div[17]/div[3]/div[2]/div/div/div/label[2]")
    public static WebElement vehicleForPleasure;
    @FindBy(how = How.XPATH, using = ".//*[@id='vehicleForm']/div[1]/div[17]/div[3]/div[2]/div/div/div/label[3]")
    public static WebElement vehicleForBusiness;
    @FindBy(how = How.XPATH, using = ".//*[@id='milesDriven']")
    public static WebElement milesDrivenToWorkOrSchool;
    @FindBy(how = How.XPATH, using = ".//*[@id='btnSubmit']")
    public static WebElement autoInsuranceSubmit;


    public void setGetFreeQuote(String inputZipCode, String inputFirstNameForFreeQuote, String inputLastNameForFreeQuote,
                                String inputAddressForFreeQuote, String inputAptNumberForFreeQuote, String inputMonthDOBForFreeQuote,
                                String inputDayDOBForFreeQuote, String inputYearDOBForFreeQuote, int inputYear, int inputMake, int inputModel,
                                int inputAntiTheft, String inputCarOwned, String inputCarFinanced, String inputCarLeased,
                                String inputVehicleForCommuting, String inputVehicleForPleasure, String inputVehicleForBusiness,
                                int inputDaysDrivenToWorkOrSchool, String inputMilesDrivenToWorkOrSchool, int inputAnnualMileage,
                                int inputTypeOfBusinessUse, int inputMaritalStatus) throws InterruptedException {
        enterNewZip.sendKeys(inputZipCode);
        getFreeQuote.click();
        Thread.sleep(1500);
        firstNameForFreeQuote.sendKeys(inputFirstNameForFreeQuote);
        lastNameForFreeQuote.sendKeys(inputLastNameForFreeQuote);
        addressForFreeQuote.sendKeys(inputAddressForFreeQuote);
        aptNumberForFreeQuote.sendKeys(inputAptNumberForFreeQuote);
        monthDOBForFreeQuote.sendKeys(inputMonthDOBForFreeQuote);
        dayDOBForFreeQuote.sendKeys(inputDayDOBForFreeQuote);
        yearDOBForFreeQuote.sendKeys(inputYearDOBForFreeQuote);
        submitToGetFreeQuote.click();
        Thread.sleep(1500);
        Select year = new Select(driver.findElement(By.xpath(".//*[@id='vehicleYear']")));
        year.selectByIndex(inputYear);
        Thread.sleep(1500);
        Select make = new Select(driver.findElement(By.xpath(".//*[@id='vehicleMake']")));
        make.selectByIndex(inputMake);
        Thread.sleep(1500);
        Select model = new Select(driver.findElement(By.xpath(".//*[@id='vehicleModel']")));
        model.selectByIndex(inputModel);
        Thread.sleep(1500);
        Select antiTheft = new Select(driver.findElement(By.xpath(".//*[@id='antiTheftDevice']")));
        antiTheft.selectByIndex(inputAntiTheft);
        Thread.sleep(1500);
        if (inputCarOwned.equalsIgnoreCase("owned")) {
            carOwned.click();
        } else if (inputCarFinanced.equalsIgnoreCase("financed")) {
            carFinanced.click();
        } else if (inputCarLeased.equalsIgnoreCase("leased")) {
            carLeased.click();
        }
        if (inputVehicleForCommuting.equalsIgnoreCase("commute")) {
            vehicleForCommuting.click();
            Thread.sleep(1500);
            Select daysDrivenToWorkOrSchool = new Select(driver.findElement(By.cssSelector("#daysDriven")));
            model.selectByIndex(inputDaysDrivenToWorkOrSchool);
            Thread.sleep(1500);
            milesDrivenToWorkOrSchool.sendKeys(inputMilesDrivenToWorkOrSchool);
            Thread.sleep(1500);
            Select annualMileage = new Select(driver.findElement(By.xpath(".//*[@id='annualMileage']")));
            annualMileage.selectByIndex(inputAnnualMileage);
            Thread.sleep(1500);
            autoInsuranceSubmit.click();
            Thread.sleep(1500);
//            Select maritalStatus = new Select(driver.findElement(By.xpath(".//*[@id='maritalStatus']")));
//            maritalStatus.selectByIndex(inputMaritalStatus);
        } else if (inputVehicleForPleasure.equalsIgnoreCase("pleasure")) {
            vehicleForPleasure.click();
            Thread.sleep(1500);
            Select annualMileage = new Select(driver.findElement(By.xpath(".//*[@id='annualMileage']")));
            annualMileage.selectByIndex(inputAnnualMileage);
            Thread.sleep(1500);
        } else if (inputVehicleForBusiness.equalsIgnoreCase("business")) {
            vehicleForBusiness.click();
            Thread.sleep(1500);
            Select typeOfBusinessUse = new Select(driver.findElement(By.xpath(".//*[@id='typeOfBusinessUse']")));
            typeOfBusinessUse.selectByIndex(inputTypeOfBusinessUse);
            Thread.sleep(1500);
            Select annualMileage = new Select(driver.findElement(By.xpath(".//*[@id='annualMileage']")));
            annualMileage.selectByIndex(inputAnnualMileage);
            Thread.sleep(1500);
        }
    }

    public void setDiscountsForAges50AndUp()  {
        discountsForAges50AndUp.click();
        customerReviews.click();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
