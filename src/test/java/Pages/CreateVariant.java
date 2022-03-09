package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class CreateVariant {
    WebDriver driver;

    public CreateVariant(WebDriver driver) {
        this.driver = driver;
    }

    public void createSizeVariantForListing(String size) {
        new GenericWrappers(driver)
                .sleep(2000)
                .clickWithXpathWhenEnabled("//button[text()='Create Variant']")
                .clickWithXpath("//div[text()='Size']/parent::div/div[2]/button[text()='Create New']")
                .selectByXpath("//select[@name='default']", size)
                .clickWithXpath("//button[text()='Create']")
                .clickWithXpath("//button[text()='Create Product Variant']")
                .actionMoveToElement("//button[text()='Create Variant']/following-sibling::i")
                .actionMouseClick()
                .sleep(2000);
    }

    public void createColourVariantForListing(String colour, String size) {
        new GenericWrappers(driver)
                .sleep(2000)
                .actionMoveToElement("//button[text()='Create Variant']/following-sibling::i")
                .actionMouseClick()
                .sleep(2000)
                .clickWithXpathWhenEnabled("//button[text()='Create Variant']")
                .clickWithXpath("//div[text()='Brand Color']/parent::div/div[2]/button[text()='Create New']")
                .sleep(2000)
                .sendKeysWithXpath("//input[@placeholder='Enter New Brand Color']", colour)
                .clickWithXpath("//button[text()='Create']")
                .clickWithXpath("//button[text()='" + size + "']")
                .clickWithXpath("//button[text()='Create Product Variant']")
                .actionMoveToElement("//button[text()='Create Variant']/following-sibling::i")
                .actionMouseClick()
                .sleep(1000);
    }
}
