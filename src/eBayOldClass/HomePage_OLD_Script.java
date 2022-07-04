package eBayOldClass;

public class HomePage_OLD_Script {
//
//    static WebDriver driver;
//    String browserName = "chrome";
//    String url = "https://www.ebay.com/";
//    static String actualText;
//
//    @BeforeTest
//    public void setUpAutomation() {
//        System.out.println("***************** Automation Started *******************");
//    }
//
//    @AfterTest
//    public void tearDownAutomation() {
//        System.out.println("***************** Automation End *******************");
//    }
//
//
//    @BeforeTest
//    public void setUp() {
//        if (this.browserName == "chrome") {
//            setUpChromeBrowser();
//        } else if (this.browserName == "fireFox") {
//            setUpFireFoxBrowser();
//        }
//        //  navigate to ebay.com/
//        driver.get(this.url);
//        driver.manage().window().maximize();
//    }
//
//
//    public static void setUpChromeBrowser() {
//        String chromeDriverPath = "../WebAutomation2022_Tahmina/BrowserDriver/window/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        driver = new ChromeDriver();
//    }
//
//    public static void setUpFireFoxBrowser() {
//        String fireFoxDriverPath = "../WebAutomation2022_Tahmina/BrowserDriver/window/chromedriver.exe";
//        System.setProperty("webdriver.gecko.driver", fireFoxDriverPath);
//        driver = new FirefoxDriver();
//    }
//
//    /**
//     * A Ebay user should be able to shop by category
//     */
//    @Test //1
//    public static void checkShopByCategoryLinkFunctionality() throws InterruptedException {
//        //Scenario: eBay's Home page "Shop by category" link Functionality Checking
//        //Given user on amazon Home page
//        //user should be able to click on Shop by category dropdown link
//        driver.findElement(By.xpath("//i[@id='gh-shop-ei']")).click();
//        Thread.sleep(2000);
//        //user should be able to click on Home and garden link
//        driver.findElement(By.cssSelector("#gh-sbc > tbody > tr > td:nth-child(3) > h3:nth-child(3) > a")).click();
//        Thread.sleep(2000);
//        //user should be able to click on End Tables from Furniture page (Furniture)
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[1]")).click();
//        Thread.sleep(3000);
//        //user should be able to click item from Shop by Shape section (End Tables)
//        driver.findElement(By.xpath("//section[1]//div[2]//a[5]//div[2]")).click();
//        Thread.sleep(2000);
//        //user should be able to click item from Shop by Shape section(Rectangular)
//        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[1]-0-1-12-list\"]/li[3]/div/a/div")).click();
//        Thread.sleep(2000);
//        //user should be able to select item from Best Selling section
//        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[1]-0-1-12-list\"]/li[3]/div/a/div")).click();
//        Thread.sleep(2000);
//        //user should be able to click on Add to cart
//        driver.findElement(By.xpath("//*[@id=\"s0-0-18-5-11-26-106-2[1]-atcBtn\"]")).click();
//        Thread.sleep(2000);
//        //user should be able to click on cart icon on the top of the page
//        driver.findElement(By.xpath("//i[@id='gh-cart-n']")).click();
//        Thread.sleep(2000);
//        // user should be able to see item has added and display subtotal of the product.
//        String expectedText = "Subtotal";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[4]/div/div[2]/div[4]/div[1]/span/span/span")).getText();
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//        driver.close();
//    }
//
//    /**
//     * A Ebay user should be able to successfully search in the search box functionality
//     *
//     * @throws InterruptedException
//     */
//
//
//    @Test //2
//    public static void checkEbaySearchBoxFunctionality() throws InterruptedException {
//        //Scenario: eBay's Home page search box Functionality Checking
//        //user should be able to successfully landed in the Ebay homepage
//        //user is able to enter valid product name in the search box
//        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("microwave oven");
//        Thread.sleep(2000);
//        //user is able to click non the search button
//        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//        Thread.sleep(2000);
//        // user should be able to see the  "Microwaves" word after landing in the homepage
//        String expectedText = "Microwaves";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[3]/ul/li[2]/span")).getText();
//        //verify user is successfully locate the "Microwaves" word
//        if (actualText.equals(expectedText)) {
//
//            System.out.println("Test case pass");
//        } else {
//            System.out.println("Test case fail");
//        }
//        Thread.sleep(1000);
//        driver.close();
//    }
//
//    /**
//     * this method will verify user can successfully remove product from shopping cart
//     */
//    @Test //3
//    public static void checkEbayRemovedButtonFunctionality() throws InterruptedException {
//
//        //user should be able to successfully land in the Ebay homepage
//        //user is able to click on Home & Garden link from ebay's home page
//        Thread.sleep(3000);
//        driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(6) > a")).click();
//        Thread.sleep(2000);
//        //user should be able to click in the furniture link after landing in the Home & Garden page
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[1]")).click();
//        Thread.sleep(2000);
//        //user should be able to click on End Tables from Furniture page
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[5]/div[2]")).click();
//        Thread.sleep(2000);
//        //user should be able to click item from Best Selling section
//        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[2]-0-1-12-list\"]/li[3]/div/a/div")).click();
//        Thread.sleep(2000);
//        //user should be able to click on Add to cart
//        driver.findElement(By.xpath("//*[@id=\"s0-0-18-5-11-26-106-2[1]-atcBtn\"]")).click();
//        Thread.sleep(1000);
//        //user should be able to click on cart icon on the top of the page
//        driver.findElement(By.xpath("//i[@id='gh-cart-n']")).click();
//        Thread.sleep(2000);
//        //user should be able to remove item from the shopping cart
//        driver.findElement(By.xpath("//button[@data-test-id='cart-remove-item']")).click();
//        Thread.sleep(2000);
//        // Verification
//        // user should be able to see item has removed successfully
//        String expectedText = "You don't have any items in your cart.";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div[1]/div/div[1]/span/span/span")).getText();
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//        driver.close();
//    }
//
//    /**
//     * This method will verify, user is able to see a proper massage display if any page/ product are missing
//     */
//
//    @Test //4
//    public static void itemPageMissing() throws InterruptedException {
//
//        //user should be able to successfully land in the Ebay homepage
//        //user is able to click on Toy link from ebay's home page
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[8]/a[1]")).click();
//        Thread.sleep(2000);
//        //user should be able to click in the Dolls & Teddy Bears link on Shop by Category section
//        driver.findElement(By.xpath("//a[2]//div[2]")).click();
//        Thread.sleep(2000);
//        //user should be able to click in the "Barbie Vintage Dolls" link on Category section
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[5]/div[2]")).click();
//        Thread.sleep(2000);
//        Thread.sleep(2000);
//        // Verification
//        // user should be able to see Massage display "page is missing" .
//        String expectedText = "Looks like this page is missing. If you still need help, visit our help pages.";
//        String actualText = driver.findElement(By.xpath("//div[contains(@class,'error-header status--4XX text--english')]//div//h1")).getText();
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//        driver.close();
//    }
//
//    /**
//     * eBay's shopping cart functionality should work properly
//     * this method will verify user can successfully add product in shopping cart
//     */
//
//    @Test //5
//    public static void shoppingCartFunctionality() throws InterruptedException {
//
//        //user should be able to successfully landed in the Ebay homepage
//        //user is able to click on Home & Garden link from ebay's home page
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]")).click();
//        Thread.sleep(2000);
//        //user should be able to click in the furniture link after landing in the Home & Garden page
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[1]")).click();
//        Thread.sleep(2000);
//        //user should be able to click on End Tables from Furniture page
//        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[5]/div[2]")).click();
//        Thread.sleep(2000);
//        //user should be able to click item from Shop by Shape section
//        driver.findElement(By.xpath("//section[@class='b-module b-carousel b-guidance b-display--landscape']//li[1]//a[1]//p[1]")).click();
//        Thread.sleep(2000);
//        //user should be able to select item from Best Selling section
//        driver.findElement(By.xpath("//section[@class='b-module b-carousel b-topproducts b-display--landscape']//li[1]//div[1]//a[1]//div[1]")).click();
//        Thread.sleep(2000);
//        //user should be able to click on Add to cart
//        driver.findElement(By.xpath("//*[@id=\"s0-0-18-5-11-26-106-2[1]-atcBtn\"]")).click();
//        Thread.sleep(4000);
//        //user should be able to click on cart icon on the top of the page
//        driver.findElement(By.xpath("//i[@id='gh-cart-n']")).click();
//        Thread.sleep(2000);
//        // Verification
//        // user should be able to see item Subtotal in shopping cart page
//        String expectedText = "Subtotal";
//        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[4]/div/div[2]/div[4]/div[1]/span/span/span")).getText();
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//        driver.close();
//    }
//    /**
//     * this method will verify sign in functionality with Invalid credential unsuccessful
//     */
//
//    @Test //6
//    public static void checkEbaySignInFunctionalityWithInvalidCredential() throws InterruptedException {
////user should be able to successfully landed in the Ebay homepage
//        //user should be able to find the text "My Ebay" in the Ebay Homepage top of the right corner
//        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).getText();
//        Thread.sleep(2000);
//        //user should be able to click on the "My Ebay button"
//        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
//        Thread.sleep(2000);
//        //user should be able to enter the email address in the "username or email address" box
//        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("tahmina");
//        Thread.sleep(2000);
//        //user should be able to click on the continue button
//        driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).submit();
//        Thread.sleep(2000);
//        // Verification
//        //user should not be able to successfully log in with invalid credential
//        String expectedText = "Get help signing in";
//        // user should be able to see error message display
//        Thread.sleep(2000);
//        String actualText = driver.findElement(By.xpath("//h1[@id='get-user-intro-header']")).getText();
//        Thread.sleep(2000);
//        Assert.assertEquals(actualText, expectedText, "log in unsuccessful ");
//
//        Thread.sleep(1000);
//        driver.close();
//    }
//    /**
//     * this method will verify sign in functionality with Valid credential successful
//     */
//
//    @Test //7
//    public static void checkEbaySignInFunctionalityWithValidCredential() throws InterruptedException {
//        //user should be able to successfully landed in the Ebay homepage
//        //user should be able to find the text "My Ebay" in the Ebay Homepage top of the right corner
//        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).getText();
//        Thread.sleep(3000);
//        //user should be able to click on the "My Ebay button"
//        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
//        Thread.sleep(1000);
//        //user should be able to enter the email address in the "username or email address" box
//        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("tahmina@gmail.com");
//        Thread.sleep(1000);
//        driver.findElement(By.xpath("//*[@id=\"signin-continue-btn\"]")).submit();
//        Thread.sleep(2000);
//        // enter the password in the "password" box
//        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("meena1212");
//        Thread.sleep(1000);
//        //click on the sign-in button
//        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
//        Thread.sleep(1000);
//        //a user should be able to successfully log in the user-homepage and user should see his/her name in the top left of the ebay homepage
//        String expectedText = "tahmina";
//        Thread.sleep(1000);
//        String actualText = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/b[1]")).getText();
//        Thread.sleep(2000);
//        //when the user see his/her name in the ebay homepage then user is successfully logged in
//        if (actualText.equals(expectedText)) {
//
//            System.out.println("Test case pass");
//        } else {
//            System.out.println("Test case fail");
//        }
//        driver.close();
//    }
//
//    /**
//     * user story: eBay help and contact button should work properly
//     * This test method verify successfully click in the help and contact button and landed on the "customer service" page
//     */
//    @Test //8
//    public static void checkCustomerServiceLinkFunctionality() throws InterruptedException {
//        //user should be able to successfully landed in the Ebay homepage
//        Thread.sleep(2000);
//        //user should be able to click on Help & Contact link
//        driver.findElement(By.xpath("//a[@href='https://ocsnext.ebay.com/ocs/home']")).click();
//        Thread.sleep(2000);
//        String actualText = driver.findElement(By.xpath("//td[@id='gh-title']")).getText();
//        //user should be able to see Customer Service page display
//        Thread.sleep(2000);
//        String expectedText = "Customer Service";
//        if (actualText.equals(expectedText)) {
//            System.out.println("Test Pass");
//        } else {
//            System.out.println("Test Fail");
//        }
//        Thread.sleep(1000);
//        driver.close();
//    }
//
//    /**
//     * user should be able to get product from Advanced Search link
//     */
//    @Test //9
//    public static void eBayHomePageAdvancedSearchFunctionality() throws InterruptedException {
//        //Scenario: eBay's Home page "Advance" link Functionality Checking
//        //Given user on amazon Home page
//        //user should be able to click on Advanced Search link on top of the ebay's home page right corner
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
//        Thread.sleep(3000);
//        //user should be able to enter/type in edit box (Wedding dress)
//        driver.findElement(By.xpath("//*[@id=\"_nkw\"]")).sendKeys("Wedding dress");
//        Thread.sleep(1000);
//        //user should be able to enter/type in edit box (Red)
//        driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys("Red");
//        Thread.sleep(1000);
//        //user should be able to click on search button
//        driver.findElement(By.cssSelector("#adv_search_from > fieldset:nth-child(2) > div.adv-s.mb.space-top > button")).click();
//        Thread.sleep(1000);
//        //user should be able to select checkBox size (As L)
//        driver.findElement(By.id("e1-29")).click();
//        Thread.sleep(2000);
//        //user should be able to select Sleeve Length checkBox(As Long Sleeve)
//        driver.findElement(By.id("e1-41")).click();
//        Thread.sleep(2000);
//        //user should be able to click on the selected link
//        driver.findElement(By.cssSelector("#item44aa224953 > h3 > a")).click();
//        Thread.sleep(2000);
//        //user should be able to click on "Add to Cart"
//        driver.findElement(By.xpath("//*[@id=\"atcRedesignId_btn\"]")).click();
//        // Verification
//        //user should not be able to see pop up window display (Continue without personalizing)
//        String expectedText = "Continue without personalizing?";
//        // user should be able to see error message display
//        Thread.sleep(2000);
//        String actualText = driver.findElement(By.cssSelector("#CUSTOMIZATION0-0-12-0-dialog-title > span")).getText();
//
//        Assert.assertEquals(actualText, expectedText, "popup window not displayed");
//
//        Thread.sleep(1000);
//        driver.close();
//    }
//
//
//
//    /**
//     * @throws InterruptedException
//     */
//    @Test //10
//    public static void eBayHomePageCartIconFunctionality() throws InterruptedException {
//        //Scenario: eBay's Home page "shopping Cart Icon" link Functionality Checking
//        //Given user on amazon Home page
//        //user should be able to click on shopping Cart Icon
//        Thread.sleep(3000);
//        driver.findElement(By.xpath("//a[@aria-label='Your shopping cart']//*[name()='svg']")).click();
//        Thread.sleep(2000);
//        //user should be able to click on shopping Cart Icon
//        String expectedText = "You don't have any items in your cart.";
//        // user should be able to see error message display
//        Thread.sleep(1000);
//        String actualText = driver.findElement(By.xpath("//div[@class='font-title-3']//span//span//span")).getText();
//
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//        driver.close();
//
//    }
//
//    /**
//     * should navigate and display a massage when search with invalid product item
//     */
//
//
//    @Test //11
//    public static void checkSearchBoxFunctionalityWithInvalidProduct() throws InterruptedException {
//        //Scenario: eBay's Home page "shopping Cart Icon" link Functionality Checking
//        //Given user on amazon Home page
//        // user is able to successfully landed in ebay's home page
//        Thread.sleep(2000);
//        // user should be able to enter valid product in searchBox field
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("kdfgjdkfhgksdjgh");
//        // user should be able to click on search button
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
//
//        Thread.sleep(2000);
//        //user should be able to click on shopping Cart Icon
//        String expectedText = "No exact matches found";
//        // user should be able to see error message display
//        Thread.sleep(2000);
//        String actualText = driver.findElement(By.xpath("//h3[@class='srp-save-null-search__heading']")).getText();
//
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//        driver.close();
//
//    }
//
//    /**
//     *  should display valid product
//     */
//    @Test //12
//    public static void checkSearchBoxFunctionalityWithValidProductOnEbay() throws InterruptedException {
//
//        // user is able to successfully landed in ebay's home page
//        Thread.sleep(2000);
//        // user should be able to enter valid product in searchBox field
//        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("home decoration");
//        // user should be able to click on search button
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
//        Thread.sleep(2000);
//        // user should be able to click on Home Décor link
//        driver.findElement(By.className("a-icon a-icon-checkbox")).click();
//        Thread.sleep(2000);
//        // user should be able to click on "Floral & Garden" checkBox
//        driver.findElement(By.xpath("//input[@aria-label='Floral & Garden']")).click();
//        Thread.sleep(2000);
//        // user should be able to click on "Office" checkBox
//        driver.findElement(By.xpath("//input[@aria-label='Office']")).click();
//        // Verification
//        //user should be able to see the page display with results for home decoration
//        String expectedText = "results for home decoration";
//        String actualText = driver.findElement(By.id("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1")).getText();
//        //successfully navigate to result page
//        System.out.println("Actual Text : " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found ");
//        Thread.sleep(1000);
//        driver.close();
//    }
//
}
