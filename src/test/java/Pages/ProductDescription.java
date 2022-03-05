package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class ProductDescription {

    WebDriver driver;
    public ProductDescription(WebDriver driver){
        this.driver=driver;
    }

    public void fillProductDescription(String product,String colour,String size){
        new GenericWrappers(driver)
                .actionMoveToElement("//span[text()='Product Description']//parent::div/div[2]/button")
                .actionMouseClick()
                .sleep(1000)
                .sendKeysWithXpath("//input[@id='style_code']",product.substring(0,1)+"0"+product.substring(1))
                .selectByXpath("//select[@id='size']",size)
                .sendKeysWithXpath("//input[@id='color_code']",colour)
                .selectByXpath("//select[@id='fabric']","Cotton Blend")
                .selectByXpath("//select[@id='type']","Round Neck")
                .selectByXpath("//select[@id='ideal_for']","Women")
                .selectByXpath("//select[@id='pattern']","Graphic Print")
                .sendKeysWithXpath("//input[@id='number_of_contents_in_sales_package']","1")
                .selectByXpath("//select[@id='color']",colour)
                .sleep(1000)
                .actionMoveToElement("//span[text()='Product Description']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .sleep(3000);
    }
}
