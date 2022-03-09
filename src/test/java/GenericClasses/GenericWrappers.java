package GenericClasses;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class GenericWrappers {

    WebDriver driver;
    Actions actions;

    public GenericWrappers(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    public GenericWrappers() {

    }

    public GenericWrappers sendKeysWithXpath(String xpath, String value) {
        driver.findElement(By.xpath(xpath)).clear();
        driver.findElement(By.xpath(xpath)).sendKeys(value);
        return this;
    }

    public GenericWrappers clickWithXpath(String xpath) {
        if (xpath.contains("Create New") && xpath.contains("Size")) {
            try {
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                driver.findElement(By.xpath(xpath)).click();
            } catch (NoSuchElementException e) {
                new GenericWrappers(driver)
                        .clickWithXpathWhenEnabled("//button[text()='Create Variant']")
                        .sleep(2000)
                        .clickWithXpath("//div[text()='Size']/parent::div/div[2]/button[text()='Create New']");
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }
        } else if (xpath.contains("Create New") && xpath.contains("Brand Color")) {
            try {
                driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                driver.findElement(By.xpath(xpath)).click();
            } catch (NoSuchElementException e) {
                new GenericWrappers(driver)
                        .clickWithXpathWhenEnabled("//button[text()='Create Variant']")
                        .sleep(2000)
                        .clickWithXpath("//div[text()='Brand Color']/parent::div/div[2]/button[text()='Create New']");
                driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            }
        } else {
            driver.findElement(By.xpath(xpath)).click();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return this;
    }

    public GenericWrappers selectByXpath(String xpath, String value) {
        Select select = new Select(driver.findElement(By.xpath(xpath)));
        select.selectByValue(value);
        return this;
    }

    public GenericWrappers sleep(long time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public GenericWrappers actionMoveToElement(String xpath) {
        actions.moveToElement(driver.findElement(By.xpath(xpath)));
        return this;
    }

    public GenericWrappers closeDriver() {
        driver.close();
        return this;
    }

    public GenericWrappers scrollToViewElement(String xpath) {
        WebElement Element = driver.findElement(By.xpath(xpath));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Scrolling down the page till the element is found
        js.executeScript("arguments[0].scrollIntoView();", Element);
        return this;
    }

    public GenericWrappers actionMouseClick() {
        actions.click().build().perform();
        return this;
    }

    public GenericWrappers fileUpload(String filePath, Action type) {

        try {
            Thread.sleep(1000 * 2);

            StringSelection stringSelection = new StringSelection(filePath);
            Thread.sleep(1000 * 2);
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            Thread.sleep(3000);
            Robot robot = new Robot();
            if (type == Action.MAC) { // Apple's Unix-based operating system.
                driver.switchTo().window(driver.getWindowHandle());
                robot.delay(2000);
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
                robot.delay(500);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
                return this;
            } else if (type == Action.WIN || type == Action.LINUX) { // Ctrl + V to paste the content.

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);
            }

            robot.delay(1000 * 2);

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

    public GenericWrappers waitUntil(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        return this;
    }

    public GenericWrappers waitUntilElementIsPresent(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        return this;
    }

    public GenericWrappers waitUntilElementIsNotPresent(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath)));
        return this;
    }

    public GenericWrappers waitUntilElementIsVisible(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
        return this;
    }

    public boolean isButtonEnabled(String xpath) {
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

        return (driver.findElement(By.xpath(xpath)).isEnabled() && driver.findElement(By.xpath(xpath)).isDisplayed());
    }

    public GenericWrappers clickWithXpathWhenEnabled(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
        return this;
    }

    public enum Action {
        WIN, MAC, LINUX
    }

}
