package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.Utility;

public class LoginTest extends Utility {

    String baseUrl = "https://www.saucedemo.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        // 1 Enter “standard_user” username
        sendTextToElement(By.id("user-name"), "standard_user");
        //2 Enter “secret_sauce” password
        sendTextToElement(By.id("password"), "secret_sauce");
        //  Click on ‘LOGIN’ button
        clickOnElement(By.id("login-button"));
        String expectedText = "Products";
        String actualText = getTextFromElement((By.className("title")));
        //WebElement loginButton = driver.findElement(By.id("login-button"));
        // loginButton.click();
        // Verify the text “Products”
        Assert.assertEquals("PRODUCT text not displayed", expectedText, actualText);
    }

    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {

        // finding element and sending text to username field
        sendTextToElement(By.id("user-name"), "standard_user");
        //Find the password from password element
        sendTextToElement(By.name("password"), "secret_sauce");
        //Fidn an element to perform clicking function
        clickOnElement(By.name("login-button"));
        //List of images to check on webpage
        int numberCount = driver.findElements(By.xpath("//img[starts-with(@class,'inventory_item_img')]")).size();
        System.out.println("Total images are : " + numberCount);

    }
    @After
    public void tearDown() {
        closeBrowser();
    }
}
