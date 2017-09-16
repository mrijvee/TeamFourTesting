package testpageobjects;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.AutoInsurance;

public class TestAutoInsurance extends CommonAPI {

    @Test
    public void testSetGetFreeQuote() throws InterruptedException {
        AutoInsurance testGetFreeQuote = PageFactory.initElements(driver, AutoInsurance.class);
        testGetFreeQuote.setGetFreeQuote("11367", "Naruto", "Uzumaki",
                "65-30 Kissena Blvd", "", "10",
                "31", "1993", 1, 39, 11, 7,
                "owned", "", "", "commute", "",
                "", 7, "30", 4, 3,
                1);
    }

    @Test
    public void testSetDiscountsForAges50AndUp() {
        AutoInsurance discountsForTheElderly = PageFactory.initElements(driver, AutoInsurance.class);
        discountsForTheElderly.setDiscountsForAges50AndUp();
    }
}
