package testpageobjects;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.HomePage;

public class TestHomePage extends CommonAPI {

//    @Test
//    public void testReportAClaim() throws InterruptedException {
//        HomePage fileAReport = PageFactory.initElements(driver, HomePage.class);
//        fileAReport.reportAClaim();
//    }
//
//    @Test
//    public void testSetStartQuote() throws InterruptedException {
//        HomePage retrieveQuote = PageFactory.initElements(driver, HomePage.class);
//        retrieveQuote.setStartQuote("11417");
//    }
//
//    @Test
//    public void testSetMakeAPayment() throws InterruptedException {
//        HomePage makePayment = PageFactory.initElements(driver, HomePage.class);
//        makePayment.setMakeAPayment();
//    }
//
//    @Test
//    public void testRetrieveIDCard() throws InterruptedException {
//        HomePage findIDCard = PageFactory.initElements(driver, HomePage.class);
//        findIDCard.retrieveIDCard();
//    }
//
//    @Test
//    public void testSetContactUs() throws InterruptedException {
//        HomePage contactGeico = PageFactory.initElements(driver, HomePage.class);
//        contactGeico.setContactUs();
//    }
//
//    @Test
//    public void testSetSearch() throws InterruptedException {
//        HomePage geicoSearch = PageFactory.initElements(driver, HomePage.class);
//        geicoSearch.setSearch();
//    }
//
//    @Test
//    public void testSetUpdateLocation() throws InterruptedException {
//        HomePage locationUpdate = PageFactory.initElements(driver, HomePage.class);
//        locationUpdate.setUpdateLocation();
//    }

//    @Test
//    public void testSetProductsHover() throws InterruptedException {
//        HomePage testProductsHover = PageFactory.initElements(driver, HomePage.class);
//        testProductsHover.productsHover("vehicle insurance", "", "", "",
//                "", "", "", "", "",
//                "", "sharing");
//    }

//    @Test
//    public void testGeicoCareers() {
//        HomePage testCareers = PageFactory.initElements(driver, HomePage.class);
//        testCareers.geicoCareers();
//    }

//    @Test
//    public void testInformationHover() throws InterruptedException {
//        HomePage hoverInformation = PageFactory.initElements(driver, HomePage.class);
//        hoverInformation.informationHover("", "save", "", "", "", "");
//    }

    @Test
    public void testFindAnAgent() {
        HomePage locateAnAgent = PageFactory.initElements(driver, HomePage.class);
        try {
            locateAnAgent.setFindAnAgent("32-72 Steinway St", 25);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}