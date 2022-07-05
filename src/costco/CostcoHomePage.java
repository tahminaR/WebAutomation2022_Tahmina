package costco;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CostcoHomePage extends Base {
    /**
     * user should be able to create account with valid credential
     */

    public static void createAccount() throws InterruptedException {
        //Given user on costco Home page
        Thread.sleep(2000);
        // user should be able to create an account successfully
        //click on Register/SignIn button
        driver.findElement(By.xpath("//a[@id='header_sign_in']")).click();
        //click on create account button
        driver.findElement(By.xpath("//a[@id='createAccount']")).click();
        //enter valid email address
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mahbubur_rashid69@yahoo.com");
        //enter valid password
        driver.findElement(By.xpath("//input[@id='newPassword']")).sendKeys("testAuto$1997");
        //Re-enter valid password to confirm
        driver.findElement(By.xpath("//input[@id='reenterPassword']")).sendKeys("testAuto$1997");
        //click on continue button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='continue']")).click();
        //verify user able to create account successfully
        String expectedText = "Commack";
        Thread.sleep(3000);
        String actualText = driver.findElement(By.xpath("//button[@aria-label='Commack, current warehouse']")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found");

    }

    /**
     * sign-In Functionality With Valid Credentials
     *
     * @throws InterruptedException
     */
    public static void signInFunctionalityWithValidCredentials() throws InterruptedException {
        // click on sign-In
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='header_sign_in']")).click();
        // enter valid email address
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("mahbubur_rashid69@yahoo.com");
        //enter valid password
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("testAuto$1997");
        //click on sign in button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='next']")).click();
        //verify user able to SignIn successfully
        String expectedText = "Commack";
        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath("//button[@aria-label='Commack, current warehouse']")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found");

    }


/**
 * sign-In Functionality With In Valid Credentials
 * @throws InterruptedException
 */
    public static void signInFunctionalityWithInValidCredentials() throws InterruptedException {
        // click on sign-In
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id='header_sign_in']")).click();
        // enter valid email address
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys("mahbubur_rashid69@yahoo.com");
        //enter In-valid password
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("bestAuto$111");
        //click on sign in button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@id='next']")).click();
        Thread.sleep(3000);
        //verify user should not be able to Sign-In with invalid password
        String expectedText = "The email address and/or password you entered are invalid.";
        Thread.sleep(5000);
        //String actualText = driver.findElement(By.xpath("(//p[@data-i18n='[html]your passwo'])[1]")).getText();
        String actualText = driver.findElement(By.xpath("//div[@class='error pageLevel']//p[@data-i18n='[html]your passwo']")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found");

    }

    /**
     * User should be able to Sign Out successfully
     *
     * @throws InterruptedException
     */

    public static void signOutFunctionality() throws InterruptedException {
        Thread.sleep(2000);
        // user should be able to Sign-In //Calling sign in Method
        signInFunctionalityWithValidCredentials();
        //click on Account
        driver.findElement(By.xpath("//li[@class='list-group-item']//button[@id='myaccount-react-d']")).click();
        // click on sign-out
        Thread.sleep(10000);
        driver.findElement(By.xpath("//span[contains(text(),'Sign Out')]")).click();
//      driver.findElement(By.xpath("//span[normalize-space()='Sign Out']")).click();
        Thread.sleep(3000);
        String expectedText = "Sign In / Register";
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//a[@id='header_sign_in']")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found");
        Thread.sleep(5000);
    }

    /**
     * Verify Grocery WebElement From Costco Home Page
     *
     */
    public void groceryWebElement() throws InterruptedException {
        //Given user on Costco Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Grocery link on Costco's Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("(//a[@href='/grocery-household.html'])[7]"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Organic link (Inside Grocery link)
        driver.findElement(By.xpath("(//a[@href='/organic-groceries.html'])[3]")).click();
        Thread.sleep(3000);
        //Click on Sort by: drop down list
        driver.findElement(By.xpath("//select[@id='sort_by'and@name='sortBy']")).click();
        Thread.sleep(3000);
        //select "Newest" from drop down list
        driver.findElement(By.xpath("//option[@automation-id='sortByDropDownOptions_LW_NEWEST']")).click();
        Thread.sleep(6000);
        // Click on All clear link to clear all Filter Results
        driver.findElement(By.xpath("//a[@class='clear-filter'and@automation-id='clearAllLink']")).click();
        Thread.sleep(4000);




    }
}