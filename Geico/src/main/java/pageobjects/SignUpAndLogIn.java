package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;


public class SignUpAndLogIn extends CommonAPI {

    @FindBy(how = How.XPATH, using = ".//*[@id='header-right-links']/ul[1]/li[2]/a/span")
    public static WebElement logInAndSignUpHover;
    @FindBy(how = How.XPATH, using = ".//*[@id='manage_ecams_form']/ul/li[2]/a")
    public static WebElement createAccountBox;
    @FindBy(how = How.XPATH, using = ".//*[@id='form:policyNumber']")
    public static WebElement policyNumber;
    @FindBy(how = How.XPATH, using = ".//*[@id='form:dateOfBirth']")
    public static WebElement dob;
    @FindBy(how = How.XPATH, using = ".//*[@id='form:zipCode']")
    public static WebElement zipCode;
    @FindBy(how = How.XPATH, using = ".//*[@id='form:continue']")
    public static WebElement signUpSubmitBox;
    @FindBy(how = How.NAME, using = "userName")
    public static WebElement userName;
    @FindBy(how = How.NAME, using = "userPassword")
    public static WebElement userPassword;
    @FindBy(how = How.XPATH, using = ".//*[@id='manageSubmit']")
    public static WebElement logInBox;

    public void setSignUpHover(String inputPolicyNum, String inputDOB, String inputZipCode) throws InterruptedException {
        Actions signUp = new Actions(driver);
        signUp.moveToElement(logInAndSignUpHover).perform();
        Thread.sleep(1500);
        createAccountBox.click();
        Thread.sleep(1500);
        policyNumber.sendKeys(inputPolicyNum);
        dob.sendKeys(inputDOB);
        zipCode.sendKeys(inputZipCode);
        Thread.sleep(1500);
        signUpSubmitBox.click();
        Thread.sleep(1500);
    }

    public void setLogInBox(int inputAccessYourPolicyDropDown, String inputUserName, String inputUserPass) throws InterruptedException {
        Actions signUp = new Actions(driver);
        signUp.moveToElement(logInAndSignUpHover).perform();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Select accessYourPolicyDropDown = new Select(driver.findElement(By.xpath(".//*[@id='manage_select']")));
        accessYourPolicyDropDown.selectByIndex(inputAccessYourPolicyDropDown);
        Thread.sleep(1500);
        userName.sendKeys(inputUserName);
        userPassword.sendKeys(inputUserPass);
        logInBox.click();
        Thread.sleep(1500);
    }
}
