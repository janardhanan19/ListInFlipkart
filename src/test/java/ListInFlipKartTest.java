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
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
    }

    public String randomnumber="146";

    @Test()
    public void test()  {
        new InitialSetup(driver).initialSetupForListing();

        GenericWrappers genericWrappers=new GenericWrappers(driver);
        new UploadImage(driver).uploadImageForListing("D12","Blue");

        new PriceStockData(driver).fillPriceStockData("D12","Blue","S"+randomnumber);
        new ProductDescription(driver).fillProductDescription("D12","Blue","S");
        new AdditionalDescription(driver).fillAdditionalDescription();

        String[] sizeVariants={"M","L","XL"};
        String[] colourVariant={"Pink","White","Yellow"};

        for (int i=0;i<sizeVariants.length;i++) {
            new CreateVariant(driver).createSizeVariantForListing(sizeVariants[i]);
            new UploadImage(driver).uploadImageForListing("D12","Blue");
            new PriceStockData(driver).fillPriceStockData("D12","Blue",sizeVariants[i]+randomnumber);
            new ProductDescription(driver).fillProductDescription("D12","Blue",sizeVariants[i]);
        }

        String[] updatedSizeVariants={"S","M","L","XL"};

        for (int i=0;i<colourVariant.length;i++) {
            for (int j = 0; j < updatedSizeVariants.length; j++) {
                new CreateVariant(driver).createColourVariantForListing(colourVariant[i],updatedSizeVariants[j] );
                new UploadImage(driver).uploadImageForListing("D12",colourVariant[i]);
                new PriceStockData(driver).fillPriceStockData("D12",colourVariant[i],updatedSizeVariants[j]+randomnumber);
                new ProductDescription(driver).fillProductDescription("D12",colourVariant[i],updatedSizeVariants[j]);
            }
        }

    }
}
