package pageobjects;



import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;

import static common.CommonAPI.driver;

public class TwitterHomePage extends CommonAPI {

    @FindBy(name = "session[password]")
    public static WebElement signInPassword;
    @FindBy(name = "session[username_or_email]")
    public static WebElement signInNameBox;
    @FindBy(xpath = ".//*[@id='signin-dropdown']/div[3]/form/input[1]")
    public static WebElement submitLoginButton;
    @FindBy(xpath = ".//*[@id='page-container']/div[2]/div/div/div[1]/div[3]/div[1]/div[3]/a")
    public static WebElement signUpButton;
    @FindBy(name = "user[name]")
    public static WebElement signUpNameBox;
    @FindBy(name = "user[email]")
    public static WebElement signUpEmaillBox;
    @FindBy(name = "user[user_password]")
    public static WebElement signUpPasswordBox;
    @FindBy(xpath = ".//input[@class='signup EdgeButton EdgeButton--primary EdgeButton--large submit']")
    public static WebElement submitSingupButton;
    @FindBy(xpath = ".//*[@id='global-new-tweet-button']")
    public static WebElement tweetBox;
    @FindBy(xpath = ".//*[@id='tweet-box-global']")
    public static WebElement composeNewTweet;
    @FindBy(xpath = ".//*[@id='global-tweet-dialog-dialog']/div[2]/div[4]/form/div[3]/div[1]/span[2]/div/button")
    public static WebElement gifBox;
    @FindBy(xpath = ".//*[@id='global-tweet-dialog-dialog']/div[2]/div[4]/form/div[3]/div[1]/span[2]/div/div/div[2]/div[1]/input")
    public static WebElement gifSearchBox;
    @FindBy(xpath = ".//*[@id='global-tweet-dialog-dialog']/div[2]/div[4]/form/div[3]/div[1]/span[3]/div/button")
    public static WebElement pollAddBox;
    @FindBy(xpath = ".//*[@id='global-tweet-dialog-dialog']/div[2]/div[4]/form/div[2]/div[2]/div[2]/div[3]/div/button")
    public static WebElement EmojiBox;
    @FindBy(xpath = ".//*[@id='global-tweet-dialog-dialog']/div[2]/div[4]/form/div[2]/div[2]/div[2]/div[3]/div/div/div[2]/span[2]/div[2]/div[2]/div[3]/div/button[4]")
    public static WebElement selectEmojiBox;
    @FindBy(xpath = ".//*[@id='user-dropdown-toggle']")
    public static WebElement profileLogo;
    @FindBy(xpath = ".//*[@id='user-dropdown']/div/ul/li[3]/a")
    public static WebElement profileBox;
    @FindBy(xpath = ".//*[@id='user-dropdown']/div/ul/li[10]/a")
    public static WebElement settenigAndPrivacy;
    @FindBy(xpath = ".//*[@id='user-dropdown']/div/ul/li[11]/a")
    public static WebElement helpCenterBox;
    @FindBy(xpath = ".//*[@id='user-dropdown']/div/ul/li[12]/button")
    public static WebElement keybboardShortCutBox;
    @FindBy(xpath = ".//*[@id='signout-button']/button")
    public static WebElement logOutBox;
    @FindBy(xpath = ".//*[@id='global-actions']/li[4]/a/span[2]")
    public static WebElement messageBox;
    @FindBy(xpath = ".//*[@id='dm_dialog-dialog']/div[2]/div[2]/div[3]/div/div[4]/div/div[2]/button")
    public static WebElement startConcersationBox;
    @FindBy(xpath = ".//*[@id='dm_dialog-dialog']/div[3]/div[1]/div/div[2]/div[2]/div/ul[1]/li/textarea")
    public static WebElement enterNameBox;
    @FindBy(css = ".text")
    public static WebElement notificationBox;




    public void logInProcess(String name, String inputPassword){
        signInNameBox.sendKeys(name);
        signInPassword.sendKeys(inputPassword);
        submitLoginButton.click();
    }
    public void signupprocess(String name, String email, String password){
        signUpButton.click();
        signUpNameBox.sendKeys(name);
        signUpEmaillBox.sendKeys(email);
        signUpPasswordBox.sendKeys(password);
        submitSingupButton.click();
    }
    public void tweetProcess(String input){
        tweetBox.click();
        composeNewTweet.sendKeys(input);
    }
    public void gifProcess(String input){
        gifBox.click();
        gifSearchBox.sendKeys(input);

    }
    public void pollAdd(){
        pollAddBox.click();
        EmojiBox.click();
        selectEmojiBox.click();
    }
    public void ProfileSetting(){

    }
    public void profileSettings(){
        profileLogo.click();
    }
    public void clickProfile(){
        profileBox.click();
    }
    public void settingProfile(){
        settenigAndPrivacy.click();
    }
    public void setHelpCenterBox(){
        helpCenterBox.click();
    }
    public void goKeyboardShortCut(){
        keybboardShortCutBox.click();
    }
    public void goLogOut(){
        logOutBox.click();
    }
    public void goMessages() throws InterruptedException {
        messageBox.click();
        Thread.sleep(1500);
    }
    public void gostartCoversation() throws InterruptedException {
        startConcersationBox.click();
        Thread.sleep(1500);
    }
    public void goEnterPersonName(String input) throws InterruptedException {
        enterNameBox.sendKeys(input);
        Thread.sleep(1500);
    }
    public void goNotification() throws InterruptedException {
        notificationBox.click();
        Thread.sleep(1500);
    }

}
