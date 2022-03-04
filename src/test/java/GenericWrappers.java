import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class GenericWrappers {

    WebDriver driver;
    Actions actions;

    GenericWrappers(String url){
        System.setProperty("webdriver.chrome.driver","/Users/jl/Documents/GitHub/ListingToFlipKart/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(url);
        driver.manage().window().maximize();
        actions = new Actions(driver);
    }

    public GenericWrappers sendKeysWithXpath(String xpath,String value){
        driver.findElement(By.xpath(xpath)).sendKeys(value);
        return this;
    }
    public GenericWrappers clickWithXpath(String xpath){
        driver.findElement(By.xpath(xpath)).click();
        return this;
    }

    public GenericWrappers selectByXpath(String xpath,String value){
        Select select=new Select(driver.findElement(By.xpath(xpath)));
        select.selectByValue(value);
        return this;
    }

    public GenericWrappers sleep(long time){
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public GenericWrappers actionMoveToElement(String xpath){
        actions.moveToElement(driver.findElement(By.xpath(xpath)));
        return this;
    }

    public GenericWrappers closeDriver(){
        driver.close();
        return this;
    }

    public GenericWrappers scrollToViewElement(String xpath){
        WebElement Element = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        return this;
    }

    public GenericWrappers actionMouseClick(){
        actions.click().build().perform();
        return this;
    }

    public GenericWrappers uploadAttachment(String filePath){

//File Need to be imported
        File file = new File(filePath);
        StringSelection stringSelection= new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
// Cmd + Tab is needed since it launches a Java app and the browser looses focus
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_TAB);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_TAB);
        robot.delay(1000);
//Open Goto window
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(KeyEvent.VK_G);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        robot.keyRelease(KeyEvent.VK_G);
//Paste the clipboard value
        robot.keyPress(KeyEvent.VK_META);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_META);
        robot.keyRelease(KeyEvent.VK_V);

//Press Enter key to close the Goto window and Upload window
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        robot.delay(1000);
        return this;
    }
}
