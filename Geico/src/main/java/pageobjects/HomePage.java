package pageobjects;

import common.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends CommonAPI {

    @FindBy(how = How.CSS, using = "#claim-btn")
    public static WebElement claimReport;
    @FindBy(how = How.CSS, using = "#zip")
    public static WebElement enterZip;
    @FindBy(how = How.CSS, using = "#submitButton")
    public static WebElement startQuote;
    @FindBy(how = How.XPATH, using = ".//*[@id='accessibility-main-content']/div[2]/div/div[1]/div/div/ul/li[1]/a")
    public static WebElement makeAPayment;
    @FindBy(how = How.XPATH, using = ".//*[@id='accessibility-main-content']/div[2]/div/div[1]/div/div/ul/li[2]/a")
    public static WebElement getIDCard;
    @FindBy(how = How.XPATH, using = ".//*[@id='footer-links-secondary']/ul/li[4]/a")
    public static WebElement contactUs;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[1]/a")
    public static WebElement questionRegardingPayment;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[2]/a")
    public static WebElement questionRegardingUserPass;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[3]/a")
    public static WebElement questionRegardingOnlineAccount;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[4]/a")
    public static WebElement questionRegardingCoverageAndDeductible;
    @FindBy(how = How.XPATH, using = ".//*[@id='form-contents']/div/ul/li[5]/a")
    public static WebElement questionRegardingAccidentForgiveness;
    @FindBy(how = How.CSS, using = ".icon-search.right-icons-separator")
    public static WebElement search;
    @FindBy(how = How.XPATH, using = ".//.//*[@id='primary-navigation']/div[6]/form/input")
    public static WebElement inputValue;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[6]/form/button")
    public static WebElement searchSubmit;
    @FindBy(how = How.XPATH, using = ".//*[@id='header-right-links']/ul[1]/li[1]/a/span[2]")
    public static WebElement updateZip;
    @FindBy(how = How.NAME, using = "user-zip")
    public static WebElement enterNewZip;
    @FindBy(how = How.CSS, using = "#geo-submit")
    public static WebElement submitUpdate;
    @FindBy(how = How.XPATH, using = ".//*[@id='header-left-links']/ul[1]/li[1]/a")
    public static WebElement productLists;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/a/span[2]")
    public static WebElement vehicleInsurance;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[2]/a/span[2]")
    public static WebElement propertyInsurance;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[3]/a/span[2]")
    public static WebElement businessInsurance;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[4]/a/span[2]")
    public static WebElement additionalnsurance;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/div/ul/li[1]/a")
    public static WebElement vehiclelnsuranceAuto;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/div/ul/li[2]/a/span")
    public static WebElement vehiclelnsuranceMotorcycle;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/div/ul/li[3]/a/span")
    public static WebElement vehiclelnsuranceATV;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/div/ul/li[4]/a/span")
    public static WebElement vehiclelnsuranceRV;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/div/ul/li[5]/a/span")
    public static WebElement vehiclelnsuranceBoatOrPWC;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/div/ul/li[6]/a/span")
    public static WebElement vehiclelnsuranceCollectorAuto;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[2]/ul/li[1]/div/ul/li[7]/a/span")
    public static WebElement vehiclelnsuranceRideSharing;
    @FindBy(how = How.XPATH, using = ".//*[@id='footer-links-secondary']/ul/li[3]/a")
    public static WebElement careers;
    @FindBy(how = How.XPATH, using = ".//*[@id='lower-search']/div/p[2]/a/button")
    public static WebElement currentOpeningJobs;
    @FindBy(how = How.XPATH, using = ".//*[@id='header-left-links']/ul[1]/li[2]/a")
    public static WebElement informationLists;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[3]/ul/li[1]/a/span[2]")
    public static WebElement claimsAndIncidents;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[3]/ul/li[2]/a/span[2]")
    public static WebElement waysToSave;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[3]/ul/li[3]/a/span[2]")
    public static WebElement toolsAndResources;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[3]/ul/li[4]/a/span[2]")
    public static WebElement aboutGeico;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[3]/ul/li[5]/a/span[2]")
    public static WebElement webAndMobile;
    @FindBy(how = How.XPATH, using = ".//*[@id='primary-navigation']/div[3]/ul/li[6]/a/span[2]")
    public static WebElement contactUsHover;
    @FindBy(how = How.XPATH, using = ".//*[@id='agents_link']/a")
    public static WebElement findAnAgent;
    @FindBy(how = How.XPATH, using = ".//*[@id='address']")
    public static WebElement findAgentViaAddress;
    @FindBy(how = How.XPATH, using = ".//*[@id='address_submit']")
    public static WebElement findAgentSubmit;
    @FindBy(how = How.XPATH, using = ".//*[@id='state_submit']")
    public static WebElement browserByStateSubmit;


    public void reportAClaim() throws InterruptedException {
        claimReport.click();
        Thread.sleep(1500);
    }

    public void setStartQuote(String inputZipCode) throws InterruptedException {
        enterZip.sendKeys(inputZipCode);
        startQuote.click();
        Thread.sleep(1500);
    }

    public void setMakeAPayment() throws InterruptedException {
        makeAPayment.click();
        Thread.sleep(1500);
    }

    public void retrieveIDCard() throws InterruptedException {
        getIDCard.click();
        Thread.sleep(1500);
    }

    public void setContactUs() throws InterruptedException {
        contactUs.click();
        Thread.sleep(1500);
        questionRegardingPayment.click();
        Thread.sleep(1500);
        driver.navigate().back();
        questionRegardingUserPass.click();
        Thread.sleep(1500);
        driver.navigate().back();
        questionRegardingOnlineAccount.click();
        Thread.sleep(1500);
        driver.navigate().back();
        questionRegardingCoverageAndDeductible.click();
        Thread.sleep(1500);
        driver.navigate().back();
        questionRegardingAccidentForgiveness.click();
        Thread.sleep(1500);
    }

    public void setSearch() throws InterruptedException {
        Actions searchGeico = new Actions(driver);
        searchGeico.moveToElement(search).perform();
        Thread.sleep(1000);
        inputValue.sendKeys("GEICO Careers");
        Thread.sleep(1000);
        searchSubmit.click();
        Thread.sleep(1000);
        System.out.println(driver.getTitle());
    }

    public void setUpdateLocation()  {
        Actions updateZipCode = new Actions(driver);
        updateZipCode.moveToElement(updateZip).perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        enterNewZip.sendKeys("11416");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        submitUpdate.click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void productsHover(String setVehicleInsurance, String setPropertyInsurance, String setBusinessInsurance, String setAdditionalInsurance,
                              String setVehiclelnsuranceAuto, String setVehiclelnsuranceMotorcycle, String setVehiclelnsuranceATV,
                              String setVehiclelnsuranceRV, String setVehiclelnsuranceBoatOrPWC, String setVehiclelnsuranceCollectorAuto,
                              String setVehiclelnsuranceRideSharing) throws InterruptedException {
        Actions getListOfProducts = new Actions(driver);
        getListOfProducts.moveToElement(productLists).perform();
        Thread.sleep(1500);
        if (setVehicleInsurance.equalsIgnoreCase("vehicle insurance")) {
            getListOfProducts.moveToElement(vehicleInsurance).perform();
            Thread.sleep(1500);
            Actions vehicleInsuranceHover = new Actions(driver);
            vehicleInsuranceHover.moveToElement(vehicleInsurance);
            if (setVehiclelnsuranceAuto.contains("auto")) {
                vehicleInsuranceHover.moveToElement(vehiclelnsuranceAuto).perform();
                vehiclelnsuranceAuto.click();
                Thread.sleep(1500);
            }
            else if (setVehiclelnsuranceMotorcycle.contains("motorcycle")) {
                vehicleInsuranceHover.moveToElement(vehiclelnsuranceMotorcycle).perform();
                vehiclelnsuranceMotorcycle.click();
                Thread.sleep(1500);
            }
            else if (setVehiclelnsuranceATV.contains("ATV")) {
                vehicleInsuranceHover.moveToElement(vehiclelnsuranceATV).perform();
                vehiclelnsuranceATV.click();
                Thread.sleep(1500);
            }
            else if (setVehiclelnsuranceRV.contains("RV")) {
                vehicleInsuranceHover.moveToElement(vehiclelnsuranceRV).perform();
                vehiclelnsuranceRV.click();
                Thread.sleep(1500);
            }
            else if (setVehiclelnsuranceBoatOrPWC.contains("boat")) {
                vehicleInsuranceHover.moveToElement(vehiclelnsuranceBoatOrPWC).perform();
                vehiclelnsuranceBoatOrPWC.click();
                Thread.sleep(1500);
            }
            else if (setVehiclelnsuranceCollectorAuto.contains("collector")) {
                vehicleInsuranceHover.moveToElement(vehiclelnsuranceCollectorAuto).perform();
                vehiclelnsuranceCollectorAuto.click();
                Thread.sleep(1500);
            }
            else if (setVehiclelnsuranceRideSharing.contains("sharing")) {
                vehicleInsuranceHover.moveToElement(vehiclelnsuranceRideSharing).perform();
                vehiclelnsuranceRideSharing.click();
                Thread.sleep(1500);
            }
        } else if (setPropertyInsurance.equalsIgnoreCase("property insurance")) {
            getListOfProducts.moveToElement(propertyInsurance).perform();
            Thread.sleep(1500);
        } else if (setBusinessInsurance.equalsIgnoreCase("business insurance")) {
            getListOfProducts.moveToElement(businessInsurance).perform();
            Thread.sleep(1500);
        } else if (setAdditionalInsurance.equalsIgnoreCase("additional insurance")){
            getListOfProducts.moveToElement(additionalnsurance).perform();
            Thread.sleep(1500);
        }
    }

    public void geicoCareers() {
        careers.click();
        currentOpeningJobs.click();
    }

    public void informationHover(String setClaimsAndIncidents, String setWaysToSave, String setToolsAndResources, String setAboutGeico,
                                 String setWebAndMobile, String setContactUsHover) throws InterruptedException {
        Actions informationHover = new Actions(driver);
        informationHover.moveToElement(informationLists).perform();
        Thread.sleep(1500);
        if (setClaimsAndIncidents.contains("claims")) {
            informationHover.moveToElement(claimsAndIncidents).perform();
            Thread.sleep(1500);
        }
        else if (setWaysToSave.contains("save")) {
            informationHover.moveToElement(waysToSave).perform();
            Thread.sleep(1500);
        }
        else if (setToolsAndResources.contains("resources")) {
            informationHover.moveToElement(toolsAndResources).perform();
            Thread.sleep(1500);
        }
        else if (setAboutGeico.contains("about")) {
            informationHover.moveToElement(aboutGeico).perform();
            Thread.sleep(1500);
        }
        else if (setWebAndMobile.contains("mobile")) {
            informationHover.moveToElement(webAndMobile).perform();
            Thread.sleep(1500);
        }
        else if (setContactUsHover.contains("contact")) {
            informationHover.moveToElement(contactUsHover).perform();
            Thread.sleep(1500);
        }
    }

    public void setFindAnAgent(String inputFindAgentViaAddress, int inputBrowseByState) throws InterruptedException {
        findAnAgent.click();
        Thread.sleep(1500);
        findAgentViaAddress.sendKeys(inputFindAgentViaAddress);
        Thread.sleep(1500);
        findAgentSubmit.click();
        Thread.sleep(1500);
        Select browseByState = new Select(driver.findElement(By.xpath(".//*[@id='state_select']")));
        browseByState.selectByIndex(inputBrowseByState);
        Thread.sleep(1500);
        browserByStateSubmit.click();
        Thread.sleep(1500);
    }
}



