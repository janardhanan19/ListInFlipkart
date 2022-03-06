package GenericClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

public class GenericWrappers {

    WebDriver driver;
    Actions actions;

    public GenericWrappers(WebDriver driver){
        this.driver=driver;
        actions = new Actions(driver);
    }

    public GenericWrappers() {

    }

    public GenericWrappers sendKeysWithXpath(String xpath,String value){
        driver.findElement(By.xpath(xpath)).clear();
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
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_TAB);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_TAB);
//        robot.delay(1000);
////Open Goto window
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_SHIFT);
//        robot.keyPress(KeyEvent.VK_G);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_SHIFT);
//        robot.keyRelease(KeyEvent.VK_G);
////Paste the clipboard value
//        robot.keyPress(KeyEvent.VK_META);
//        robot.keyPress(KeyEvent.VK_V);
//        robot.keyRelease(KeyEvent.VK_META);
//        robot.keyRelease(KeyEvent.VK_V);
//
////Press Enter key to close the Goto window and Upload window
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(1000);
//        robot.keyPress(KeyEvent.VK_ENTER);
//        robot.keyRelease(KeyEvent.VK_ENTER);
//        robot.delay(1000);
        return this;
    }

    public enum Action {
        WIN, MAC, LINUX, SEND_KEYS, FILE_DETECTOR;
    }
    public GenericWrappers fileUpload( String filePath, Action type) {

            try {
                Thread.sleep( 1000 * 5 );

                StringSelection stringSelection= new StringSelection(filePath);
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

                Robot robot = new Robot();
                if( type == Action.MAC ) { // Apple's Unix-based operating system.

                    robot.keyPress(KeyEvent.VK_META);
                    robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_G);
                    robot.keyRelease(KeyEvent.VK_G);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    robot.keyRelease(KeyEvent.VK_META);

                    // Paste the clipBoard content - Command ⌘ + V.
                    robot.keyPress(KeyEvent.VK_META);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_META);

                    // Press Enter (GO - To bring up the file.)
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    return this;
                } else if ( type == Action.WIN || type == Action.LINUX ) { // Ctrl + V to paste the content.

                    robot.keyPress(KeyEvent.VK_CONTROL);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_CONTROL);
                }

                robot.delay( 1000 * 4 );

                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                return this;
            } catch (AWTException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        return this;
    }

    public GenericWrappers waitUntil(String xpath){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        return this;
    }


    public GenericWrappers waitUntilElementIsVisible(String xpath){
        WebDriverWait wait = new WebDriverWait(driver,30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(xpath))));
        return this;
    }

}
