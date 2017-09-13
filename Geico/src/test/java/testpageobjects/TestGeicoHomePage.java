package testpageobjects;

import common.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjects.GeicoHomePage;

public class TestGeicoHomePage extends CommonAPI {

    @Test
    public void geicoClaimReport() throws InterruptedException {
        GeicoHomePage fileAReport = PageFactory.initElements(driver, GeicoHomePage.class);
        fileAReport.reportAClaim();
    }

    @Test
    public void zipCodeForQuote() throws InterruptedException {
        GeicoHomePage enterZip = PageFactory.initElements(driver, GeicoHomePage.class);
        enterZip.zipCodeToGetQuote();
    }

}
