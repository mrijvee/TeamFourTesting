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

    @Test
    public void geicoContactUs() throws InterruptedException {
        HomePage contactGeico = PageFactory.initElements(driver, HomePage.class);
        contactGeico.setContactUs();
    }

    @Test
    public void searchBox() throws InterruptedException {
        HomePage geicoSearch = PageFactory.initElements(driver, HomePage.class);
        geicoSearch.setSearch();
    }

    @Test
    public void updateLocation() throws InterruptedException {
        HomePage locationUpdate = PageFactory.initElements(driver, HomePage.class);
        locationUpdate.setUpdateZip();
    }

    @Test
    public void findProductLists() {
        HomePage listOfProducts = PageFactory.initElements(driver, HomePage.class);
        try {
            listOfProducts.productsDropDown("", "", "");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
