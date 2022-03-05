package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class AdditionalDescription {

    WebDriver driver;
    public AdditionalDescription(WebDriver driver){
        this.driver=driver;
    }

    public void fillAdditionalDescription() {
        new GenericWrappers(driver)
                .actionMoveToElement("//span[text()='Additional Description (Optional)']//parent::div/div[2]/button")
                .actionMouseClick()
                .selectByXpath("//select[@id='refiner_fit']", "Regular")
                .selectByXpath("//select[@id='fabric_care']", "Do not Iron on print/embroidery/embellishment")
                .selectByXpath("//select[@id='suitable_for']", "Western Wear")
                .scrollToViewElement("//div[text()='Search Keywords']")

                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div/div/input", "T-shirt for women")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[1]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[2]/div/input", "women t-shirt cotton")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[2]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[3]/div/input", "blue tshirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[3]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[4]/div/input", "women printed t-shirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[4]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[5]/div/input", "printed t-shirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[5]/button")

                .scrollToViewElement("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div/div/input")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div/div/input", "Fabric Type: Cotton Blend Premium Quality")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[1]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[2]/div/input", "Bio washed to offer comfort and smoothness")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[2]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[3]/div/input", "Care Instructions: Machine Wash")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[3]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[4]/div/input", "Fit: Comfort ; Occasion: Casual Wear")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[4]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[5]/div/input", "Sleeve: Short Sleeve Tshirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[5]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[6]/div/input", "Neck Type: Round Neck tshirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[6]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[7]/div/input", "Design: Printed")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[7]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[8]/div/input", "Sizes – S (36inches), M (38 inches), L (40 inches), XL (42 inches)")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[8]/button")
                .sleep(1000)

                .selectByXpath("//select[@id='trend']", "Graphic Prints")
                .selectByXpath("//select[@id='print_type']", "Graphic Print")
                .selectByXpath("//select[@id='print_coverage']", "Chest")
                .selectByXpath("//select[@id='print_coverage']", "Chest")
                .selectByXpath("//select[@id='sleeve']", "Half Sleeve")
                .selectByXpath("//select[@id='occasion']", "Casual")
                .actionMoveToElement("//span[text()='Additional Description (Optional)']/parent::div/div[2]/div/div/button")
                .actionMouseClick();
    }
}
