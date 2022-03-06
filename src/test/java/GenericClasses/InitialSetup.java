package GenericClasses;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class InitialSetup {
    WebDriver driver;
    public InitialSetup(WebDriver driver){
        this.driver=driver;
    }

    public void initialSetupForListing(){
        //login
        new GenericWrappers(driver)
                .clickWithXpath("//span[text()='Login for existing sellers']")
                .sendKeysWithXpath("//input[@class='styles__StyledInput-sc-6fhdqq-0 gEzlIS user-input']", "9871687049")
                .clickWithXpath("//span[text()='Next']")
                .sendKeysWithXpath("//input[@placeholder='Enter password']", "Shopsy@123")
                .clickWithXpath("//span[text()='Login']")

                //navigate to listing
                .sleep(2000)
                .actionMoveToElement("//li[@id='Listings']")
                .actionMoveToElement("//a[text()='Add New Listings']")
                .actionMouseClick()

                .sleep(3000)
                .clickWithXpath("//div[@class=\"__floater__body\"]//button[@title=\"Last\"]")
                .clickWithXpath("//div[@class=\"__floater__body\"]//button[@title=\"Don't show again\"]")
                .clickWithXpath("//button[@data-testid='group-buttons-btn-1']/span")
                .clickWithXpath("//button[text()='Add a Single Listing']")
                .sleep(2000)
                .clickWithXpath("//button[text()='Close']")
                .clickWithXpath("//div[contains(@class,'styles__VerticalCard')]")

                .sleep(4000)
                .clickWithXpath("//span[text()='Select Brand']")
                .clickWithXpath("//span[text()='Rustic Indi Fashion']")
                .clickWithXpath("//button[text()='Create New Listing']");

    }
}
