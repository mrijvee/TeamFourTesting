package testpageobjects;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.AutoInsurance;

public class TestAutoInsurance extends CommonAPI {

    @Test
    public void testSetGetFreeQuote() throws InterruptedException {
        AutoInsurance testGetFreeQuote = PageFactory.initElements(driver, AutoInsurance.class);
        testGetFreeQuote.setGetFreeQuote("11238");
    }

//    @Test
//    public void testSetDiscountsForAges50AndUp() {
//        AutoInsurance discountsForTheElderly = PageFactory.initElements(driver, AutoInsurance.class);
//        discountsForTheElderly.setDiscountsForAges50AndUp();
//    }
}
