import GenericClasses.GenericWrappers;
import GenericClasses.InitialSetup;
import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class ListInFlipKartTest {
    WebDriver driver;
//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
    @BeforeTest()
    public void setup(){
        String url = "https://seller.flipkart.com/sell-online/";
        System.setProperty("webdriver.chrome.driver","C:\\ListInFlipkart\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    @Test()
    public void test()  {
        new InitialSetup(driver).initialSetupForListing();

        GenericWrappers genericWrappers=new GenericWrappers(driver);
        new UploadImage(driver).uploadImageForListing("D12","Blue");
        //.uploadAttachment("/Users/jl/Downloads/drive-download-20220303T120852Z-001/BLUEBACK.jpg");  //dynamic

        new PriceStockData(driver).fillPriceStockData("D12","Blue","S15");
        new ProductDescription(driver).fillProductDescription("D12","Blue","S");
        new AdditionalDescription(driver).fillAdditionalDescription();

//        new CreateVariant(driver).createVariantForListing("M");
//        new UploadImage(driver).uploadImageForListing("D12","Blue");
//        new PriceStockData(driver).fillPriceStockData("D12","Blue","M6");
//        new ProductDescription(driver).fillProductDescription("D12","Blue","M");
//
//        new CreateVariant(driver).createVariantForListing("L");
//        new UploadImage(driver).uploadImageForListing("D12","Blue");
//        new PriceStockData(driver).fillPriceStockData("D12","Blue","L4");
//        new ProductDescription(driver).fillProductDescription("D12","Blue","L");
//
//        new CreateVariant(driver).createVariantForListing("XL");
//        new UploadImage(driver).uploadImageForListing("D12","Blue");
//        new PriceStockData(driver).fillPriceStockData("D12","Blue","XL4");
//        new ProductDescription(driver).fillProductDescription("D12","Blue","XL");

        String[] sizeVariants={"M","L","XL"};

        for (int i=0;i<sizeVariants.length;i++) {
            new CreateVariant(driver).createVariantForListing(sizeVariants[i]);
            new UploadImage(driver).uploadImageForListing("D12","Blue");
            new PriceStockData(driver).fillPriceStockData("D12","Blue",sizeVariants[i]+"45");
            new ProductDescription(driver).fillProductDescription("D12","Blue",sizeVariants[i]);
        }


    }
}
