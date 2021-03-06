package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class UploadImage {
    WebDriver driver;

    public UploadImage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadImageForListing(String product, String colour) {
        uploadImageForListing(product, colour, false);
    }

    public void uploadImageForListing(String product, String colour, boolean firstTime) {
        if (!firstTime) {
            new GenericWrappers(driver)
                    .actionMoveToElement("//button[text()='Create Variant']/following-sibling::i")
                    .actionMouseClick()
                    .sleep(2000);
        }
        new GenericWrappers(driver)
                .clickWithXpath("//div[contains(@class,'styles__AddProductImage')]")
                .clickWithXpath("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div")
                .sleep(2000)
                .scrollToViewElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(2000)
                .fileUpload("/Users/jl/Downloads/drive/" + product + colour.toUpperCase() + ".jpg", GenericWrappers.Action.MAC)
                .sleep(2000)
//                .waitUntilElementIsNotPresent("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .waitUntil("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[contains(@id,'thumbnail_1')]")
                .clickWithXpath("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[contains(@id,'thumbnail_1')]")
//                .waitUntilElementIsNotPresent("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .scrollToViewElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(2000)
                .fileUpload("/Users/jl/Downloads/drive/" + colour.toUpperCase() + "BACK.jpg", GenericWrappers.Action.MAC)
                .sleep(5000)
//                .waitUntilElementIsNotPresent("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//span[text()='Product Photos']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .waitUntilElementIsPresent("//span[contains(text(),'Product Photos')]/parent::div/div[2]/button");
    }

    public void uploadImageForListingForFK(String product, String colour) {
        uploadImageForListingForFK(product, colour, false);
    }

    public void uploadImageForListingForFK(String product, String colour, boolean firstTime) {
        if (!firstTime) {
            new GenericWrappers(driver)
                    .actionMoveToElement("//button[text()='Create Variant']/following-sibling::i")
                    .actionMouseClick()
                    .sleep(2000);
        }
        new GenericWrappers(driver)
                .clickWithXpath("//div[contains(@class,'styles__AddProductImage')]")
                .clickWithXpath("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div")
                .sleep(2000)
                .scrollToViewElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(2000)
                .fileUpload("/Users/jl/Downloads/drive/" + product + colour.toUpperCase() + ".jpg", GenericWrappers.Action.MAC)
                .sleep(2000)
//                .waitUntilElementIsNotPresent("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .waitUntil("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[contains(@id,'thumbnail_1')]")
                .clickWithXpath("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[contains(@id,'thumbnail_1')]")
//                .waitUntilElementIsNotPresent("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .scrollToViewElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(2000)
                .fileUpload("/Users/jl/Downloads/drive/" + colour.toUpperCase() + "BACK.jpg", GenericWrappers.Action.MAC)
                .sleep(5000)
//                .waitUntilElementIsNotPresent("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .waitUntil("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[contains(@id,'thumbnail_2')]")
                .clickWithXpath("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[contains(@id,'thumbnail_2')]")
//                .waitUntilElementIsNotPresent("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .scrollToViewElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(2000)
                .fileUpload("/Users/jl/Downloads/drive/" + "SIZE CHART.jpg", GenericWrappers.Action.MAC)
                .sleep(5000)
                .actionMoveToElement("//span[text()='Product Photos']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .waitUntilElementIsPresent("//span[contains(text(),'Product Photos')]/parent::div/div[2]/button");
    }

}
