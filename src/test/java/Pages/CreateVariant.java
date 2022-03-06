package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class CreateVariant {
    WebDriver driver;
    public CreateVariant(WebDriver driver) {
        this.driver = driver;
    }

    public void createVariantForListing(String size){
        new GenericWrappers(driver)
                .clickWithXpath("//button[text()='Create Variant']")
                .clickWithXpath("//div[text()='Size']/parent::div/div[2]/button[text()='Create New']")
                .selectByXpath("//select[@name='default']",size)
                .clickWithXpath("//button[text()='Create']")
                .clickWithXpath("//button[text()='Create Product Variant']")
                .sleep(2000);
    }
}
