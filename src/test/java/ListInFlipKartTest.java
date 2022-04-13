import Data.Data;
import GenericClasses.GenericWrappers;
import GenericClasses.InitialSetup;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class ListInFlipKartTest {
    public static String randomnumber = "";
    WebDriver driver;

    //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
    @BeforeMethod()
    public void setup() {
        String url = "https://seller.flipkart.com/sell-online/";
        System.setProperty("webdriver.chrome.driver", "/Users/jl/ListInFlipkart/chromedriver");
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test(dataProvider = "listingData",dataProviderClass = Data.class)
    public void test(String product, String sizes, String colour) {
        new InitialSetup(driver).initialSetupForListing("Shopsy");
        String[] colourVariant = colour.split(",");
        String productName = product;
        String[] updatedSizeVariants = sizes.split(",");

        for (int i = 0; i < colourVariant.length; i++) {
            if (i == 0) {
                for (int j = 0; j < updatedSizeVariants.length; j++) {
                    if (j != 0) {
                        new CreateVariant(driver).createSizeVariantForListing(updatedSizeVariants[j]);
                        new UploadImage(driver).uploadImageForListing(productName, colourVariant[i]);
                        new PriceStockData(driver).fillPriceStockData(productName, colourVariant[i], updatedSizeVariants[j] + randomnumber);
                        new ProductDescription(driver).fillProductDescription(productName, colourVariant[i], updatedSizeVariants[j]);
                    }
                    if (j == 0) {
                        new UploadImage(driver).uploadImageForListing(productName, colourVariant[i], true);
                        new PriceStockData(driver).fillPriceStockData(productName, colourVariant[i], updatedSizeVariants[j] + randomnumber, true);
                        new ProductDescription(driver).fillProductDescription(productName, colourVariant[i], updatedSizeVariants[j], true);
                        new AdditionalDescription(driver).fillAdditionalDescription();
                    }
                }
            } else {
                for (int j = 0; j < updatedSizeVariants.length; j++) {
                    new CreateVariant(driver).createColourVariantForListing(colourVariant[i], updatedSizeVariants[j]);
                    new UploadImage(driver).uploadImageForListing(productName, colourVariant[i]);
                    new PriceStockData(driver).fillPriceStockData(productName, colourVariant[i], updatedSizeVariants[j] + randomnumber);
                    new ProductDescription(driver).fillProductDescription(productName, colourVariant[i], updatedSizeVariants[j]);
                }
            }
        }
//        randomnumber = String.valueOf(Integer.valueOf(randomnumber) + 1);
    }

    @Test(dataProvider = "listingData",dataProviderClass = Data.class)
    public void testFlipKart(String product, String sizes, String colour) {
        new InitialSetup(driver).initialSetupForListing("FlipKart");
        String[] colourVariant = colour.split(",");
        String productName = product;
        String[] updatedSizeVariants = sizes.split(",");

        for (int i = 0; i < colourVariant.length; i++) {
            if (i == 0) {
                for (int j = 0; j < updatedSizeVariants.length; j++) {
                    if (j != 0) {
                        new CreateVariant(driver).createSizeVariantForListing(updatedSizeVariants[j]);
                        new PriceStockData(driver).fillPriceStockDataFK(productName,colourVariant[i],updatedSizeVariants[j]+ randomnumber);
                        new ProductDescription(driver).fillProductDescriptionFK(productName,colourVariant[i],updatedSizeVariants[j]);
                    }
                    if (j == 0) {
                        new UploadImage(driver).uploadImageForListingForFK(productName,colourVariant[i],true);
                        new PriceStockData(driver).fillPriceStockDataFK(productName,colourVariant[i],updatedSizeVariants[j]+ randomnumber,true);
                        new ProductDescription(driver).fillProductDescriptionFK(productName,colourVariant[i],updatedSizeVariants[j],true);
                        new AdditionalDescription(driver).fillAdditionalDescriptionFK();
                    }
                }
            } else {
                for (int j = 0; j < updatedSizeVariants.length; j++) {
                    new CreateVariant(driver).createColourVariantForListing(colourVariant[i], updatedSizeVariants[j]);
                    if(j==0) {
                        new UploadImage(driver).uploadImageForListingForFK(productName, colourVariant[i]);
                    }
                    new PriceStockData(driver).fillPriceStockDataFK(productName, colourVariant[i], updatedSizeVariants[j] + randomnumber);
                    new ProductDescription(driver).fillProductDescriptionFK(productName, colourVariant[i], updatedSizeVariants[j]);
                }
            }
        }
//        randomnumber = String.valueOf(Integer.valueOf(randomnumber) + 1);
    }

    @AfterMethod
    public void afterTest() {
        new GenericWrappers(driver)
                .closeDriver();
    }
}
