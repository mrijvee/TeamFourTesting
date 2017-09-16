package testpageobjects;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.SignUpAndLogIn;

public class TestSignUpAndLogIn extends CommonAPI {

//    @Test
//    public void testSignUp() {
//        SignUpAndLogIn signUp = PageFactory.initElements(driver, SignUpAndLogIn.class);
//        try {
//            signUp.setSignUpHover("543216", "10/31/1994", "11238");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    @Test
    public void testSignIn() throws InterruptedException {
        SignUpAndLogIn signIn = PageFactory.initElements(driver, SignUpAndLogIn.class);
        signIn.setLogInBox(8, "Sasuke", "Uchiha123$");
    }
}
