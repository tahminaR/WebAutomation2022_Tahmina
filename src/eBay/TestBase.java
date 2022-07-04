package eBay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

//Configuration class
public class TestBase {


    public static WebDriver driver;
    String browserName = "chrome";
    String url = "https://www.ebay.com/";
    //String url = "http://automationpractice.com/index.php";


    @BeforeTest
    public void setUpAutomation() {
        System.out.println("***************** Automation Started *******************");
    }

    @AfterTest (alwaysRun = true)
    public void tearDownAutomation() {
      //  driver.close();
        System.out.println("***************** Automation End *******************");
    }


    @BeforeTest
    public void setUp() {
        if (this.browserName == "chrome") {
            setUpChromeBrowser();
        } else if (this.browserName == "fireFox") {
            setUpFireFoxBrowser();
        }
        //  navigate to ebay.com/
        driver.manage().window().maximize();
        driver.get(this.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(50));
        driver.manage().deleteAllCookies();

    }


    public static void setUpChromeBrowser() {
        String chromeDriverPath = "../WebAutomation2022_Tahmina/BrowserDriver/window/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        driver = new ChromeDriver();
    }

    public static void setUpFireFoxBrowser() {
        String fireFoxDriverPath = "../WebAutomation2022_Tahmina/BrowserDriver/window/chromedriver.exe";
        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
        driver = new FirefoxDriver();
    }

    //public static void navigateToYahoo() throws InterruptedException {
//        Thread.sleep(4000);
//        driver.navigate().to("https://www.yahoo.com/");
//        Thread.sleep(3000);
//    }
}
