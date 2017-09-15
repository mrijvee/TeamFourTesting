package testpageobjects;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class TestHomePage extends CommonAPI {

    @Test
    public void geicoClaimReport() throws InterruptedException {
        HomePage fileAReport = PageFactory.initElements(driver, HomePage.class);
        fileAReport.reportAClaim();
    }

    @Test
    public void getQuote() throws InterruptedException {
        HomePage retrieveQuote = PageFactory.initElements(driver, HomePage.class);
        retrieveQuote.setStartQuote();
    }

    @Test
    public void makeAPayment() throws InterruptedException {
        HomePage makePayment = PageFactory.initElements(driver, HomePage.class);
        makePayment.setMakeAPayment();
    }

    @Test
    public void geicoIDCard() throws InterruptedException {
        HomePage findIDCard = PageFactory.initElements(driver, HomePage.class);
        findIDCard.retrieveIDCard();
    }

}
