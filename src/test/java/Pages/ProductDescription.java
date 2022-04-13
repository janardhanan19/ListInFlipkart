package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class ProductDescription {

    WebDriver driver;

    public ProductDescription(WebDriver driver) {
        this.driver = driver;
    }

    public void fillProductDescription(String product, String colour, String size) {
        fillProductDescription(product, colour, size, false);
    }

    public void fillProductDescription(String product, String colour, String size, boolean firstTime) {
        new GenericWrappers(driver)
                .sleep(2000)
                .waitUntilElementIsVisible("//span[text()='Product Description']//parent::div/div[2]/button")
                .actionMoveToElement("//span[text()='Product Description']//parent::div/div[2]/button")
                .actionMouseClick();
        if (firstTime) {
            new GenericWrappers(driver)
                    .waitUntilElementIsVisible("//input[@id='style_code']")
                    .sendKeysWithXpath("//input[@id='style_code']", product.charAt(0) + "0" + product.substring(1));
        }
        new GenericWrappers(driver)
                .selectByXpath("//select[@id='size']", size)
                .scrollToViewElement("//input[@id='color_code']")
                .sendKeysWithXpath("//input[@id='color_code']", colour);
        if (firstTime) {
            new GenericWrappers(driver)
                    .selectByXpath("//select[@id='fabric']", "Cotton Blend")
                    .selectByXpath("//select[@id='type']", "Round Neck")
                    .selectByXpath("//select[@id='ideal_for']", "Women")
                    .selectByXpath("//select[@id='pattern']", "Graphic Print")
                    .sendKeysWithXpath("//input[@id='number_of_contents_in_sales_package']", "1");
        }
        new GenericWrappers(driver)
                .sleep(1000)
                .selectByXpath("//select[@id='color']", colour)
                .sleep(3000)
                .waitUntilElementIsVisible("//span[text()='Product Description']//parent::div/div[2]/div/div/button")
                .actionMoveToElement("//span[text()='Product Description']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .sleep(1000)
                .waitUntilElementIsPresent("//span[contains(text(),'Product Description')]/parent::div/div[2]/button");
    }

    public void fillProductDescriptionFK(String product, String colour, String size) {
        fillProductDescriptionFK(product, colour, size, false);
    }

    public void fillProductDescriptionFK(String product, String colour, String size, boolean firstTime) {
        if(firstTime) {
            new GenericWrappers(driver)
                    .sleep(2000)
                    .waitUntilElementIsVisible("//span[text()='Product Title']//parent::div/div[2]/button")
                    .actionMoveToElement("//span[text()='Product Title']//parent::div/div[2]/button")
                    .actionMouseClick()
                    .sendKeysWithXpath("//input[@id='seller_title']", "RUSTIC INDI FASHION Women's Cotton Regular Fit Printed T-Shirt")
                    .actionMoveToElement("//span[text()='Product Title']//parent::div/div[2]/div/div/button")
                    .actionMouseClick()
                    .sleep(1000)
                    .waitUntilElementIsPresent("//span[contains(text(),'Product Title')]/parent::div/div[2]/button");
        }


        new GenericWrappers(driver)
                .sleep(2000)
                .waitUntilElementIsVisible("//span[text()='Product Description']//parent::div/div[2]/button")
                .actionMoveToElement("//span[text()='Product Description']//parent::div/div[2]/button")
                .actionMouseClick();

        if (firstTime) {
            new GenericWrappers(driver)
                    .selectByXpath("//select[@id='type']","Round Neck")
                    .waitUntilElementIsVisible("//input[@id='style_code']")
                    .sendKeysWithXpath("//input[@id='style_code']", "FK-"+product.charAt(0) + "0" + product.substring(1));
        }
        new GenericWrappers(driver)
                .selectByXpath("//select[@id='size']", size)
                .selectByXpath("//select[@id='pattern']", "Printed")
                .scrollToViewElement("//select[@id='color']")
                .sleep(2000)
                .selectByXpath("//select[@id='color']", colour);
        if (firstTime) {
            new GenericWrappers(driver)
                    .selectByXpath("//select[@id='fabric']", "Cotton Blend")
                    .sendKeysWithXpath("//input[@id='color_code']",colour)
                    .selectByXpath("//select[@id='ideal_for']", "Women")
                    .selectByXpath("//select[@id='sleeve']", "Half Sleeve")
                    .selectByXpath("//select[@id='occasion']", "Casual")
                    .sendKeysWithXpath("//input[@id='number_of_contents_in_sales_package']", "1")
                    .selectByXpath("//select[@id='fabric_care']", "Do not Iron on print/embroidery/embellishment")
                    .selectByXpath("//select[@id='refiner_fit']", "Regular")
                    .selectByXpath("//select[@id='suitable_for']", "Western Wear");
        }
        new GenericWrappers(driver)
                .waitUntilElementIsVisible("//span[text()='Product Description']//parent::div/div[2]/div/div/button")
                .actionMoveToElement("//span[text()='Product Description']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .sleep(1000)
                .waitUntilElementIsPresent("//span[contains(text(),'Product Description')]/parent::div/div[2]/button");
    }
}
