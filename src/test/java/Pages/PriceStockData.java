package Pages;

import GenericClasses.GenericWrappers;
import org.openqa.selenium.WebDriver;

public class PriceStockData {
    WebDriver driver;

    public PriceStockData(WebDriver driver) {
        this.driver = driver;
    }

    public void fillPriceStockData(String product, String colour, String size) {
        fillPriceStockData(product, colour, size, false);
    }

    public void fillPriceStockData(String product, String colour, String size, boolean firstTime) {


        new GenericWrappers(driver)
                .sleep(3000)
                .waitUntil("//span[text()='Price, Stock and Shipping Information']//parent::div/div/button")
                .clickWithXpath("//span[text()='Price, Stock and Shipping Information']//parent::div/div/button")
                .sendKeysWithXpath("//input[@id='sku_id']", "SP-" + product + "-" + colour + "-" + size);
        if (firstTime) {
            new GenericWrappers(driver)
                    .selectByXpath("//select[@id='listing_status']", "ACTIVE");
        }
        new GenericWrappers(driver)
                .sendKeysWithXpath("//input[@id='mrp']", "999")
                .sendKeysWithXpath("//input[@id='flipkart_selling_price']", "199");
        if (firstTime) {

            new GenericWrappers(driver)
                    .selectByXpath("//select[@id='service_profile']", "NON_FBF")
                    .selectByXpath("//select[@id='procurement_type']", "REGULAR");
        }
        new GenericWrappers(driver)
                .scrollToViewElement("//div[text()='Procurement SLA']")
                .sendKeysWithXpath("//input[@id='shipping_days']", "1")
                .sendKeysWithXpath("//input[@id='stock_size']", "10");
        if (firstTime) {
            new GenericWrappers(driver)
                    .selectByXpath("//select[@id='shipping_provider']", "FLIPKART")
                    .sendKeysWithXpath("//input[@id='local_shipping_fee_from_buyer']", "0")
                    .sendKeysWithXpath("//input[@id='zonal_shipping_fee_from_buyer']", "0")
                    .sendKeysWithXpath("//input[@id='national_shipping_fee_from_buyer']", "0")
                    .scrollToViewElement("//div[text()='Packaging details']")

                    .sendKeysWithXpath("//input[@id='package_weight']", "0.30")
                    .sendKeysWithXpath("//input[@id='package_length']", "36")
                    .sendKeysWithXpath("//input[@id='package_breadth']", "13")
                    .sendKeysWithXpath("//input[@id='package_height']", "0.5")
                    .scrollToViewElement("//div[text()='Tax Code']")

                    .sendKeysWithXpath("//input[@id='hsn']", "61091000")
                    .selectByXpath("//select[@id='tax_code']", "GST_APPAREL")
                    .selectByXpath("//select[@id='country_of_origin']", "IN")
                    .sendKeysWithXpath("//input[@id='manufacturer_details']", "RUSTIC INDI FASHION")
                    .sendKeysWithXpath("//input[@id='packer_details']", "RUSTIC INDI FASHION")
                    .sleep(1000);
        }
        new GenericWrappers(driver)
                .actionMoveToElement("//span[text()='Price, Stock and Shipping Information']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .sleep(5000);
    }
}

