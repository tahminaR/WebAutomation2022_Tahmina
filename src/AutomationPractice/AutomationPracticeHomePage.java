package AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutomationPracticeHomePage {

    static WebDriver driver;
    String browserName = "chrome";
    String url = "http://automationpractice.com/index.php";
    static String actualText;

    @BeforeTest
    public void setUpAutomation() {
        System.out.println(" Automation Started ");
    }

    @AfterTest
    public void tearDownAutomation() {
        //driver.close();
        System.out.println(" Automation End ");
    }


    @BeforeTest
    public void setUp() {
        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else {
            System.out.println("");
        }
        //  navigate to automationpractice.com/
        driver.get(this.url);
        driver.manage().window().maximize();
    }


    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../WebAutomation2022_Tahmina/BrowserDriver/window/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }


    /**
     * user should be able to shop from Women section
     */
    @Test
    public static void checkWomenLinkFunctionality() throws InterruptedException {
        // user should be able to click on Women button in automation practice home page
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a")).click();
        //user should be able to select the Size check box as M
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#layered_id_attribute_group_2")).click();
        Thread.sleep(6000);
        //user should be able to select the Color check box as Black
        driver.findElement(By.xpath("//*[@id=\"layered_id_attribute_group_11\"]")).click();
        //user should be able to select the Properties check box as Maxi Dress
        driver.findElement(By.cssSelector("#layered_id_feature_21")).click();
        Thread.sleep(7000);
        String expectedText = "WOMEN > SIZE M > COLOR BLACK > PROPERTIES MAXI DRESS";
        // user should be able to see error message display
        Thread.sleep(1000);
        String actualText = driver.findElement(By.cssSelector("#center_column > h1 > span.cat-name")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        driver.close();

    }

    /**
     *
     */
    @Test
    public static void checkShoppingCartFunctionality() throws InterruptedException {
        // user should be able to click on Women button in automation practice home page
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#block_top_menu > ul > li:nth-child(1) > a")).click();
        Thread.sleep(2000);
        //user should be able to select a dress ("Printed Dress")
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[4]/div/div[2]/h5/a")).click();
        //user should be able to increase Quantity of the product
        driver.findElement(By.xpath("//i[@class='icon-plus']")).click();
        //driver.findElement(By.xpath("")).click();
        driver.findElement(By.cssSelector("#color_24")).click();
        Thread.sleep(4000);
        //user should be able to click on Add to cart button
        driver.findElement(By.cssSelector("#add_to_cart > button")).click();
        Thread.sleep(6000);
        //user should be able to click on Proceed to checkout
        driver.findElement(By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_cart.col-xs-12.col-md-6 > div.button-container > a > span")).click();
        String expectedText = "SHOPPING-CART SUMMARY";
        // user should be able to see error message display
        Thread.sleep(5000);
        String actualText = driver.findElement(By.id("//*[@id=\"cart_title\"]/text()")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
    }

    /**
     *
     */
    @Test
    public static void checkContactUsElementFunctionality() throws InterruptedException {
        // user should be able to click on "Contact Us" link in automation practice home page
        Thread.sleep(1000);
        driver.findElement(By.id("contact-link")).click();
        Thread.sleep(2000);
        //user should be able to write message in text area
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("this is a dummy message, testing my automation test case.");
        //user should be able to select option from drop down list Subject Heading section as(customer service)
        driver.findElement(By.xpath("//option[@value='2']")).click();
        //user should be able to enter email address in text edit field/ email field
        driver.findElement(By.cssSelector("#email")).sendKeys("dummyEmail@dummy.com");
        Thread.sleep(2000);
        // user should be able to enter Order reference number in Order reference text/edit field
        driver.findElement(By.id("id_order")).sendKeys("3464157654Dummy");
        driver.findElement(By.id("submitMessage")).click();
        String expectedText = "CUSTOMER SERVICE - CONTACT US";
        // user should be able to see error message display
        Thread.sleep(5000);
        String actualText = driver.findElement(By.xpath("//h1[@class='page-heading bottom-indent']")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);

    }
}



















