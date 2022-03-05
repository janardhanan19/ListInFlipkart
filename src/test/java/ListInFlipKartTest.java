import GenericClasses.GenericWrappers;
import GenericClasses.InitialSetup;
import Pages.AdditionalDescription;
import Pages.PriceStockData;
import Pages.ProductDescription;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

@Test
public class ListInFlipKartTest {
    WebDriver driver;

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

        new GenericWrappers(driver)
                .clickWithXpath("//div[contains(@class,'styles__AddProductImage')]")
                .clickWithXpath("//div[contains(@class,'styles__ImageWrapper')]")
                .sleep(2000)
                .scrollToViewElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(2000)
                  //.sendKeysWithXpath("//label/div/button[contains(@class,'BaseButton-sc-1')]/div","C:\\Users\\janar\\Desktop\\LISTING1\\D12BLUE.jpg")
//                .uploadAttachment("C:\\Users\\janar\\Desktop\\LISTING1\\D12BLUE.jpg")  //dynamic
                .fileUpload("C:\\Users\\janar\\Desktop\\LISTING1\\D12BLUE.jpg", GenericWrappers.Action.WIN)
                .sleep(5000)
                .clickWithXpath("//div[contains(@class,'styles__ImageWrapper')]")

                .actionMoveToElement("//label/div/button[contains(@class,'BaseButton-sc-1')]/div")
                .actionMouseClick()
                .sleep(3000)
                .fileUpload("C:\\Users\\janar\\Desktop\\LISTING1\\BLUEBACK.jpg", GenericWrappers.Action.WIN)
                .sleep(3000)
                .actionMoveToElement("//span[text()='Product Photos']//parent::div/div[2]/div/div/button")
                .actionMouseClick()
                .sleep(3000);

        //.uploadAttachment("/Users/jl/Downloads/drive-download-20220303T120852Z-001/BLUEBACK.jpg");  //dynamic

        new PriceStockData(driver).fillPriceStockData();
        new ProductDescription(driver).fillProductDescription();
        new AdditionalDescription(driver).fillAdditionalDescription();

    }
}
