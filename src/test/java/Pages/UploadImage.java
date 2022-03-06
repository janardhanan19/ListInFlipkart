package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

import java.util.Locale;

public class UploadImage {
    WebDriver driver;

    public UploadImage(WebDriver driver) {
        this.driver = driver;
    }

    public void uploadImageForListing(String product,String colour) {
        ////span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[@id='thumbnail_1']
        new GenericWrappers(driver)
                .clickWithXpath("//div[contains(@class,'styles__AddProductImage')]")
                .clickWithXpath("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div")
                .sleep(2000)
                .scrollToViewElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(2000)
                //.sendKeysWithXpath("//label/div/button[contains(@class,'BaseButton-sc-1')]/div","C:\\Users\\janar\\Desktop\\LISTING1\\D12BLUE.jpg")
//                .uploadAttachment("C:\\Users\\janar\\Desktop\\LISTING1\\D12BLUE.jpg")  //dynamic
                .fileUpload("C:\\Users\\janar\\Desktop\\LISTING1\\"+product+colour.toUpperCase()+".jpg", GenericWrappers.Action.WIN)
                .sleep(2000)
                .waitUntil("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[contains(@id,'thumbnail_1')]")
                .clickWithXpath("//span[text()='Product Photos']/parent::div/parent::div/parent::div/div[2]/div/div[contains(@id,'thumbnail_1')]")
                .sleep(3000)
                .scrollToViewElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(3000)
                .fileUpload("C:\\Users\\janar\\Desktop\\LISTING1\\"+colour.toUpperCase()+"BACK.jpg", GenericWrappers.Action.WIN)
                .sleep(5000)
                .actionMoveToElement("//span[text()='Product Photos']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .sleep(3000);
    }
}
