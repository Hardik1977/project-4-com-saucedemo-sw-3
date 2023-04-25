package utilities;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {

    public void clickOnElement(By by) {
        //Method to find button Element and click
        driver.findElement(by).click();
    }

    public void sendTextToElement(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //Method to find Element
    public String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    public void countImagesOnWebPage(By by) {
        WebElement list = driver.findElement(by);
    }

}
