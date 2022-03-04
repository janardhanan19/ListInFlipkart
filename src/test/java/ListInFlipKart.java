import org.testng.annotations.Test;

import java.awt.*;

@Test
public class ListInFlipKart {


    public static void main(String[] args) throws AWTException, InterruptedException {
        String baseUrl = "https://seller.flipkart.com/sell-online/";
        //login
        new GenericWrappers(baseUrl)
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

                .sleep(1000)
                .clickWithXpath("//span[text()='Select Brand']")
                .clickWithXpath("//span[text()='Rustic Indi Fashion']")
                .clickWithXpath("//button[text()='Create New Listing']")
                .clickWithXpath("//div[contains(@class,'styles__AddProductImage')]")
                .clickWithXpath("//div[contains(@class,'styles__ImageWrapper')]")
                .sleep(2000)
//        new WebDriverWait(genericWrappers.driver, 30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")));
//        genericWrappers.clickWithXpath("//label/div/button[contains(@class,'BaseButton-sc-1')]/div");

                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(2000)

                .uploadAttachment("/Users/jl/Downloads/drive-download-20220303T120852Z-001/D12BLUE.jpg")  //dynamic
//                .sleep(5000)
//                .clickWithXpath("//div[contains(@class,'styles__BaseWaterMark')]")
//
//                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
//                .actionMouseClick()
//                .sleep(3000)
//
//                .uploadAttachment("/Users/jl/Downloads/drive-download-20220303T120852Z-001/BLUEBACK.jpg");  //dynamic

                .clickWithXpath("//span[text()='Price, Stock and Shipping Information']//parent::div/div/button")
                .sendKeysWithXpath("//input[@id='sku_id']","SP-D12-BLUE-S") //dynamic
                .selectByXpath("//select[@id='listing_status']","ACTIVE")
                .sendKeysWithXpath("//input[@id='mrp']","999")
                .sendKeysWithXpath("//input[@id='flipkart_selling_price']","199")

                .selectByXpath("//select[@id='service_profile']","NON_FBF")
                .selectByXpath("//select[@id='procurement_type']","REGULAR")
                .scrollToViewElement("//div[text()='Procurement SLA']")
                .sendKeysWithXpath("//input[@id='shipping_days']","1")
                .sendKeysWithXpath("//input[@id='stock_size']","10")
                .sendKeysWithXpath("//input[@id='local_shipping_fee_from_buyer']","0")
                .sendKeysWithXpath("//input[@id='zonal_shipping_fee_from_buyer']","0")
                .sendKeysWithXpath("//input[@id='national_shipping_fee_from_buyer']","0")
                .scrollToViewElement("//div[text()='Packaging details']")

                .sendKeysWithXpath("//input[@id='package_weight']","0.30")
                .sendKeysWithXpath("//input[@id='package_length']","36")
                .sendKeysWithXpath("//input[@id='package_breadth']","13")
                .sendKeysWithXpath("//input[@id='package_height']","0.5")
                .scrollToViewElement("//div[text()='Tax Code']")

                .sendKeysWithXpath("//input[@id='hsn']","61091000")
                .selectByXpath("//select[@id='tax_code']","GST_APPAREL")
                .selectByXpath("//select[@id='country_of_origin']","IN")
                .sendKeysWithXpath("//input[@id='manufacturer_details']","RUSTIC INDI FASHION")
                .sendKeysWithXpath("//input[@id='packer_details']","RUSTIC INDI FASHION")
                .sleep(1000)
                .actionMoveToElement("//span[text()='Price, Stock and Shipping Information']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .sleep(1000)
                .actionMoveToElement("//span[text()='Product Description']//parent::div/div[2]/button")
                .actionMouseClick()
                .sleep(1000)
                .sendKeysWithXpath("//input[@id='style_code']","D012")
                .selectByXpath("//select[@id='size']","S")
                .sendKeysWithXpath("//input[@id='color_code']","BLUE")
                .selectByXpath("//select[@id='fabric']","Cotton Blend")
                .selectByXpath("//select[@id='type']","Round Neck")
                .selectByXpath("//select[@id='ideal_for']","Women")
                .selectByXpath("//select[@id='pattern']","Graphic Print")
                .sendKeysWithXpath("//input[@id='number_of_contents_in_sales_package']","1")
                .selectByXpath("//select[@id='color']","Blue")
                .sleep(1000)
                .actionMoveToElement("//span[text()='Product Description']//parent::div/div[2]/div/div/button")
                .actionMouseClick()

                .actionMoveToElement("//span[text()='Additional Description (Optional)']//parent::div/div[2]/button")
                .actionMouseClick()
                .selectByXpath("//select[@id='refiner_fit']","Regular")
                .selectByXpath("//select[@id='fabric_care']","Do not Iron on print/embroidery/embellishment")
                .selectByXpath("//select[@id='suitable_for']","Western Wear")
                .scrollToViewElement("//div[text()='Search Keywords']")

                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div/div/input","T-shirt for women")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[1]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[2]/div/input","women t-shirt cotton")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[2]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[3]/div/input","blue tshirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[3]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[4]/div/input","women printed t-shirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[4]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[5]/div/input","printed t-shirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Search Keywords']//parent::div/parent::div/parent::div/div[2]/div/div[5]/button")


                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div/div/input","Fabric Type: Cotton Blend Premium Quality")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[1]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[2]/div/input","Bio washed to offer comfort and smoothness")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[2]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[3]/div/input","Care Instructions: Machine Wash")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[3]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[4]/div/input","Fit: Comfort ; Occasion: Casual Wear")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[4]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[5]/div/input","Sleeve: Short Sleeve Tshirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[5]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[6]/div/input","Neck Type: Round Neck tshirt")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[6]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[7]/div/input","Design: Printed")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[7]/button")
                .sleep(1000)
                .sendKeysWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[8]/div/input","Sizes – S (36inches), M (38 inches), L (40 inches), XL (42 inches)")
                .sleep(1000)
                .clickWithXpath("//div[text()='Key Features']//parent::div/parent::div/parent::div/div[2]/div/div[8]/button")
                .sleep(1000)




                .selectByXpath("//select[@id='trend']","Graphic Prints")
                .selectByXpath("//select[@id='print_type']","Graphic Print")
                .selectByXpath("//select[@id='print_coverage']","Chest")
                .selectByXpath("//select[@id='print_coverage']","Chest")
                .selectByXpath("//select[@id='sleeve']","Half Sleeve")
                .selectByXpath("//select[@id='occasion']","Casual")
                .actionMoveToElement("//span[text()='Additional Description (Optional)']/parent::div/div[2]/div/div/button")
                .actionMouseClick();



                //div[text()='Search Keywords']







    }
}
