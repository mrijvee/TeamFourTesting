package testPageObject;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.TwitterHomePage;

public class TestHomePage extends CommonAPI {

    @Test
    public void positiveSignIn(){
        TwitterHomePage positiveLogin = PageFactory.initElements(driver, TwitterHomePage.class);
        positiveLogin.logInProcess("saha4311@gmail.com", "Yes171717");
    }
    @Test
    public void negativesignUpProcess() {
        TwitterHomePage signup = PageFactory.initElements(driver, TwitterHomePage.class);
        signup.signupprocess("sukanta saha", "saha4311", "blablabla");
    }
    @Test
    public void twwetONTwitter(){
        TwitterHomePage createTweet = PageFactory.initElements(driver, TwitterHomePage.class);
        createTweet.logInProcess("saha4311@gmail.com", "Yes171717");
        createTweet.tweetProcess("Slenium Sucks");
    }
    @Test
    public void gifOnTwitter(){
        TwitterHomePage createTweet = PageFactory.initElements(driver, TwitterHomePage.class);
        createTweet.logInProcess("saha4311@gmail.com", "Yes171717");
        createTweet.tweetProcess("Slenium Sucks");
        createTweet.gifProcess("Love");
    }
    @Test
    public void insertEmoji(){
        TwitterHomePage createTweet = PageFactory.initElements(driver, TwitterHomePage.class);
        createTweet.logInProcess("saha4311@gmail.com", "Yes171717");
        createTweet.tweetProcess("Slenium Sucks");
        createTweet.pollAdd();
    }
    @Test
    public void profilecheck(){
        TwitterHomePage createTweet = PageFactory.initElements(driver, TwitterHomePage.class);
        createTweet.logInProcess("saha4311@gmail.com", "Yes171717");
        createTweet.profileSettings();
    }
    @Test
    public void profileClick(){
        TwitterHomePage createTweet = PageFactory.initElements(driver, TwitterHomePage.class);
        createTweet.logInProcess("saha4311@gmail.com", "Yes171717");
        createTweet.profileSettings();
        createTweet.clickProfile();
    }
    @Test
    public void settingPrivacy(){
        TwitterHomePage createTweet = PageFactory.initElements(driver, TwitterHomePage.class);
        createTweet.logInProcess("saha4311@gmail.com", "Yes171717");
        createTweet.profileSettings();
        createTweet.settingProfile();
    }
    @Test
    public void GohelpCenter(){
        TwitterHomePage createTweet = PageFactory.initElements(driver, TwitterHomePage.class);
        createTweet.logInProcess("saha4311@gmail.com", "Yes171717");
        createTweet.profileSettings();
        createTweet.setHelpCenterBox();
    }
    @Test
    public void GoKeyBoardshortcut() {
        TwitterHomePage helpCenter = PageFactory.initElements(driver, TwitterHomePage.class);
        helpCenter.logInProcess("saha4311@gmail.com", "Yes171717");
        helpCenter.profileSettings();
        helpCenter.goKeyboardShortCut();
    }

    @Test
    public void LogOutProcess() {
        TwitterHomePage logoutOption = PageFactory.initElements(driver, TwitterHomePage.class);
        logoutOption.logInProcess("saha4311@gmail.com", "Yes171717");
        logoutOption.profileSettings();
        logoutOption.goLogOut();
    }

    @Test
    public void messageBoxCheck() throws InterruptedException {
        TwitterHomePage messages = PageFactory.initElements(driver, TwitterHomePage.class);
        messages.logInProcess("saha4311@gmail.com", "Yes171717");
        messages.goMessages();
    }



    @Test
    public void sendMessage() throws InterruptedException {
        TwitterHomePage messages = PageFactory.initElements(driver, TwitterHomePage.class);
        messages.logInProcess("saha4311@gmail.com", "Yes171717");
        messages.goMessages();
        messages.gostartCoversation();
        Thread.sleep(15000);
    }
    @Test
    public void SearchPerson() throws InterruptedException {
        TwitterHomePage messages = PageFactory.initElements(driver, TwitterHomePage.class);
        messages.logInProcess("saha4311@gmail.com", "Yes171717");
        messages.goMessages();
        messages.gostartCoversation();
        messages.goEnterPersonName("Gadhi");
        Thread.sleep(15000);
    }
    @Test
    public void checkNotification() throws InterruptedException {
        TwitterHomePage notification = PageFactory.initElements(driver, TwitterHomePage.class);
        notification.logInProcess("saha4311@gmail.com", "Yes171717");
        notification.goNotification();

    }
}