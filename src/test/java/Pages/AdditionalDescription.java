package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class AdditionalDescription {

    WebDriver driver;

    public AdditionalDescription(WebDriver driver) {
        this.driver = driver;
    }

    public void fillAdditionalDescription() {
        new GenericWrappers(driver)
                .sleep(2000)
                .waitUntilElementIsPresent("//span[text()='Additional Description (Optional)']//parent::div/div[2]/button")
                .actionMoveToElement("//span[text()='Additional Description (Optional)']//parent::div/div[2]/button")
                .actionMouseClick()
                .selectByXpath("//select[@id='refiner_fit']", "Regular")
                .selectByXpath("//select[@id='fabric_care']", "Do not Iron on print/embroidery/embellishment")
                .selectByXpath("//select[@id='suitable_for']", "Western Wear")
                .scrollToViewElement("//div[text()='Search Keywords']")

                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div/div/input", "T-shirt for women")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[1]/button")
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[2]/div/input", "women t-shirt cotton")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[2]/button")
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[3]/div/input", "blue tshirt")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[3]/button")
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[4]/div/input", "women printed t-shirt")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[4]/button")
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[5]/div/input", "printed t-shirt")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[5]/button")

                .scrollToViewElement("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div/div/input")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div/div/input", "Fabric Type: Cotton Blend Premium Quality")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[1]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[2]/div/input", "Bio washed to offer comfort and smoothness")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[2]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[3]/div/input", "Care Instructions: Machine Wash")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[3]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[4]/div/input", "Fit: Comfort ; Occasion: Casual Wear")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[4]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[5]/div/input", "Sleeve: Short Sleeve Tshirt")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[5]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[6]/div/input", "Neck Type: Round Neck tshirt")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[6]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[7]/div/input", "Design: Printed")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[7]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[8]/div/input", "Sizes – S (36inches), M (38 inches), L (40 inches), XL (42 inches)")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[8]/button")

                .selectByXpath("//select[@id='trend']", "Graphic Prints")
                .selectByXpath("//select[@id='print_type']", "Graphic Print")
                .selectByXpath("//select[@id='print_coverage']", "Chest")
                .selectByXpath("//select[@id='print_coverage']", "Chest")
                .selectByXpath("//select[@id='sleeve']", "Half Sleeve")
                .selectByXpath("//select[@id='occasion']", "Casual")
                .actionMoveToElement("//span[text()='Additional Description (Optional)']/parent::div/div[2]/div/div/button")
                .actionMouseClick();
    }

    public void fillAdditionalDescriptionFK() {

        String des="RUSTIC INDI FASHION is a brand that intends to bring you closer to your roots. We take inspiration from the essence of India and carefully design products to make you stand out in the crowd.\n" +
                "\n" +
                "We offer an exclusive range of fashion that is made from high quality cotton blend fabric to give you the perfect combination of value, durability and design. \n" +
                "\n" +
                "Made from the heart, our products have the sole purpose of giving you the finest wearing experience. So go on and add this piece to your wardrobe.\n" +
                "\n" +
                "1) ROUND NECK - Round neck t-shirt give you the most comfort and can easily be styled with and kind of jacket.\n" +
                "\n" +
                "2) HALF SLEEVES - Half sleeves ensure the utility of the tshirt all year long. You can wear them all summers and style it with layers in winters for complete look.\n" +
                "\n" +
                "3) WASH CARE - Machine wash with like colours. Do not iron on print. Do not bleach.\n" +
                "\n" +
                "4) STYLING - This tshirt can be paired with jeans, shorts, leggings or any style you pick for your day. The unique print will be a perfect addition to your wardrobe.";

        new GenericWrappers(driver)
                .sleep(2000)
                .waitUntilElementIsPresent("//span[text()='Additional Description (Optional)']//parent::div/div[2]/button")
                .actionMoveToElement("//span[text()='Additional Description (Optional)']//parent::div/div[2]/button")
                .actionMouseClick()
                .sendKeysWithXpath("//textarea[@id='description']",des)
                .scrollToViewElement("//div[text()='Search Keywords']")

                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div/div/input", "T-shirt for women")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[1]/button")
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[2]/div/input", "women t-shirt cotton")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[2]/button")
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[3]/div/input", "blue tshirt")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[3]/button")
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[4]/div/input", "women printed t-shirt")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[4]/button")
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[5]/div/input", "printed t-shirt")
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[5]/button")


                .scrollToViewElement("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div/div/input")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div/div/input", "Fabric Type: Cotton Blend Premium Quality")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[1]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[2]/div/input", "Bio washed to offer comfort and smoothness")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[2]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[3]/div/input", "Care Instructions: Machine Wash")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[3]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[4]/div/input", "Fit: Comfort ; Occasion: Casual Wear")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[4]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[5]/div/input", "Sleeve: Short Sleeve Tshirt")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[5]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[6]/div/input", "Neck Type: Round Neck tshirt")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[6]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[7]/div/input", "Design: Printed")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[7]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[8]/div/input", "Sizes – S (36inches), M (38 inches), L (40 inches), XL (42 inches)")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[8]/button")
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[9]/div/input", "Product colours may vary slightly due to photographic lighting source or your monitor's settings ")
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[9]/button")

                .selectByXpath("//select[@id='trend']", "Graphic Prints")
                .selectByXpath("//select[@id='print_type']", "Graphic Print")
                .selectByXpath("//select[@id='print_coverage']", "Chest")
                .actionMoveToElement("//span[text()='Additional Description (Optional)']/parent::div/div[2]/div/div/button")
                .actionMouseClick();
    }
}
