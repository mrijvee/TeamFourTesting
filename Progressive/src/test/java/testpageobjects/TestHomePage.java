package testpageobjects;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class TestHomePage extends CommonAPI{

    @Test
    public void testAutoAndPropertyQuote() throws InterruptedException {
        HomePage getAutoAndPropertyQuote = PageFactory.initElements(driver, HomePage.class);
        getAutoAndPropertyQuote.setAutoAndPropertyQuote("auto + home","11417", "Itachi", "Nagato",
                "Uchiha", 1,"32-72 Steinway St", "3", "Astoria",
                "10", "31", "1992");
    }
}
