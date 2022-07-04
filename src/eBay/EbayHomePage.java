package eBay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

// Action Method Class: All type of business action/ behaviour ot automate any test case
public class EbayHomePage extends TestBase {


    static String actualText;


    /**
     * A Ebay user should be able to shop by category
     * Author: Tahmina
     */
    //1
    public static void checkShopByCategoryLinkFunctionality() throws InterruptedException {
        //Scenario: eBay's Home page "Shop by category" link Functionality Checking
        //Given user on amazon Home page
        //user should be able to click on Shop by category dropdown link
        driver.findElement(By.xpath("//i[@id='gh-shop-ei']")).click();
        Thread.sleep(2000);
        //user should be able to click on Home and garden link
        driver.findElement(By.cssSelector("#gh-sbc > tbody > tr > td:nth-child(3) > h3:nth-child(3) > a")).click();
        Thread.sleep(2000);
        //user should be able to click on End Tables from Furniture page (Furniture)
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[1]")).click();
        Thread.sleep(3000);
        //user should be able to click item from Shop by Shape section (End Tables)
        driver.findElement(By.xpath("//section[1]//div[2]//a[5]//div[2]")).click();
        Thread.sleep(2000);
        //user should be able to click item from Shop by Shape section(Rectangular)
        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[1]-0-1-12-list\"]/li[3]/div/a/div")).click();
        Thread.sleep(2000);
        //user should be able to select item from Best Selling section
        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[1]-0-1-12-list\"]/li[3]/div/a/div")).click();
        Thread.sleep(2000);
        //user should be able to click on Add to cart
        driver.findElement(By.xpath("//*[@id=\"s0-0-18-5-11-26-106-2[1]-atcBtn\"]")).click();
        Thread.sleep(2000);
        //user should be able to click on cart icon on the top of the page
        driver.findElement(By.xpath("//i[@id='gh-cart-n']")).click();
        Thread.sleep(2000);
        // user should be able to see item has added and display subtotal of the product.
        String expectedText = "Subtotal";
        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[4]/div/div[2]/div[4]/div[1]/span/span/span")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        driver.close();
    }

    /**
     * A Ebay user should be able to successfully search in the search box functionality
     * This method should the product in Amazon search box
     * Author: Tahmina
     */


   //2
    public static void checkEbaySearchBoxFunctionality() throws InterruptedException {
        //Scenario: eBay's Home page search box Functionality Checking
        //user should be able to successfully landed in the Ebay homepage
        //user is able to enter valid product name in the search box
        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("microwave oven");
        Thread.sleep(2000);
        //user is able to click non the search button
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
        Thread.sleep(2000);
        // user should be able to see the  "Microwaves" word after landing in the homepage
        String expectedText = "Microwaves";
        String actualText = driver.findElement(By.xpath("//*[@id=\"x-refine__group__0\"]/ul/li/ul/li[3]/ul/li[2]/span")).getText();
        //verify user is successfully locate the "Microwaves" word
        if (actualText.equals(expectedText)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        Thread.sleep(1000);
        driver.close();
    }

    /**
     * this method will verify user can successfully REMOVE product from shopping cart
     * Author: Tahmina
     */
    //3
    public static void checkEbayRemovedButtonFunctionality() throws InterruptedException {

        //user should be able to successfully land in the Ebay homepage
        //user is able to click on Home & Garden link from ebay's home page
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(6) > a")).click();
        Thread.sleep(2000);
        //user should be able to click in the furniture link after landing in the Home & Garden page
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[1]")).click();
        Thread.sleep(2000);
        //user should be able to click on End Tables from Furniture page
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[5]/div[2]")).click();
        Thread.sleep(2000);
        //user should be able to click item from Best Selling section
        driver.findElement(By.xpath("//*[@id=\"s0-28_1-9-0-1[2]-0-1-12-list\"]/li[3]/div/a/div")).click();
        Thread.sleep(2000);
        //user should be able to click on Add to cart
        driver.findElement(By.xpath("//*[@id=\"s0-0-18-5-11-26-106-2[1]-atcBtn\"]")).click();
        Thread.sleep(1000);
        //user should be able to click on cart icon on the top of the page
        driver.findElement(By.xpath("//i[@id='gh-cart-n']")).click();
        Thread.sleep(2000);
        //user should be able to remove item from the shopping cart
        driver.findElement(By.xpath("//button[@data-test-id='cart-remove-item']")).click();
        Thread.sleep(2000);
        // Verification
        // user should be able to see item has removed successfully
        String expectedText = "You don't have any items in your cart.";
        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[3]/div[1]/div/div[1]/span/span/span")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        driver.close();
    }

    /**
     * This method will verify, user is able to see a proper massage display if any page/ product are missing
     * Author: Tahmina
     */

    //4
    public static void itemPageMissing() throws InterruptedException {

        //user should be able to successfully land in the Ebay homepage
        //user is able to click on Toy link from ebay's home page
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='mainContent']/div[@class='hl-cat-nav']/ul[@class='hl-cat-nav__container']/li[8]/a[1]")).click();
        Thread.sleep(2000);
        //user should be able to click in the Dolls & Teddy Bears link on Shop by Category section
        driver.findElement(By.xpath("//a[2]//div[2]")).click();
        Thread.sleep(2000);
        //user should be able to click in the "Barbie Vintage Dolls" link on Category section
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[5]/div[2]")).click();
        Thread.sleep(2000);
        Thread.sleep(2000);
        // Verification
        // user should be able to see Massage display "page is missing" .
        String expectedText = "Looks like this page is missing. If you still need help, visit our help pages.";
        String actualText = driver.findElement(By.xpath("//div[contains(@class,'error-header status--4XX text--english')]//div//h1")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        driver.close();
    }

    /**
     * eBay's shopping cart functionality should work properly
     * this method will verify user can successfully add product in "shopping cart"
     * Author: Tahmina
     */

    //5
    public static void shoppingCartFunctionality() throws InterruptedException {

        //user should be able to successfully landed in the Ebay homepage
        //user is able to click on Home & Garden link from ebay's home page
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]")).click();
        Thread.sleep(2000);
        //user should be able to click in the furniture link after landing in the Home & Garden page
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[1]/div[1]")).click();
        Thread.sleep(2000);
        //user should be able to click on End Tables from Furniture page
        driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[2]/a[5]/div[2]")).click();
        Thread.sleep(2000);
        //user should be able to click item from Shop by Shape section
        driver.findElement(By.xpath("//section[@class='b-module b-carousel b-guidance b-display--landscape']//li[1]//a[1]//p[1]")).click();
        Thread.sleep(2000);
        //user should be able to select item from Best Selling section
        driver.findElement(By.xpath("//section[@class='b-module b-carousel b-topproducts b-display--landscape']//li[1]//div[1]//a[1]//div[1]")).click();
        Thread.sleep(2000);
        //user should be able to click on Add to cart
        driver.findElement(By.xpath("//*[@id=\"s0-0-18-5-11-26-106-2[1]-atcBtn\"]")).click();
        Thread.sleep(4000);
        //user should be able to click on cart icon on the top of the page
        driver.findElement(By.xpath("//i[@id='gh-cart-n']")).click();
        Thread.sleep(2000);
        // Verification
        // user should be able to see item Subtotal in shopping cart page
        String expectedText = "Subtotal";
        String actualText = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div/div[4]/div/div[2]/div[4]/div[1]/span/span/span")).getText();
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        driver.close();
    }

    /**
     * this method will verify sign in functionality with Invalid credential unsuccessful
     */

    //6
    public static void checkEbaySignInFunctionalityWithInvalidCredential() throws InterruptedException {
//user should be able to successfully landed in the Ebay homepage
        //user should be able to find the text "My Ebay" in the Ebay Homepage top of the right corner
        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).getText();
        Thread.sleep(2000);
        //user should be able to click on the "My Ebay button"
        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
        Thread.sleep(2000);
        //user should be able to enter the email address in the "username or email address" box
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("tahmina");
        Thread.sleep(2000);
        //user should be able to click on the continue button
        driver.findElement(By.xpath("//button[@id='signin-continue-btn']")).submit();
        Thread.sleep(2000);
        // Verification
        //user should not be able to successfully log in with invalid credential
        String expectedText = "Get help signing in";
        // user should be able to see error message display
        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath("//h1[@id='get-user-intro-header']")).getText();
        Thread.sleep(2000);
        Assert.assertEquals(actualText, expectedText, "log in unsuccessful ");

        Thread.sleep(1000);
        driver.close();
    }

    /**
     * this method will verify sign in functionality with Valid credential successful
     */

    //7
    public static void checkEbaySignInFunctionalityWithValidCredential() throws InterruptedException {
        //user should be able to successfully landed in the Ebay homepage
        //user should be able to find the text "My Ebay" in the Ebay Homepage top of the right corner
        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).getText();
        Thread.sleep(3000);
        //user should be able to click on the "My Ebay button"
        driver.findElement(By.xpath("//*[@id=\"gh-eb-My\"]/div/a[1]")).click();
        Thread.sleep(1000);
        //user should be able to enter the email address in the "username or email address" box
        driver.findElement(By.xpath("//*[@id=\"userid\"]")).sendKeys("tahmina@gmail.com");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//*[@id=\"signin-continue-btn\"]")).submit();
        Thread.sleep(2000);
        // enter the password in the "password" box
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("meena1212");
        Thread.sleep(1000);
        //click on the sign-in button
        driver.findElement(By.xpath("//*[@id=\"sgnBt\"]")).click();
        Thread.sleep(1000);
        //a user should be able to successfully log in the user-homepage and user should see his/her name in the top left of the ebay homepage
        String expectedText = "tahmina";
        Thread.sleep(1000);
        String actualText = driver.findElement(By.xpath("//*[@id=\"gh-ug\"]/b[1]")).getText();
        Thread.sleep(2000);
        //when the user see his/her name in the ebay homepage then user is successfully logged in
        if (actualText.equals(expectedText)) {

            System.out.println("Test case pass");
        } else {
            System.out.println("Test case fail");
        }
        driver.close();
    }

    /**
     * user story: eBay help and contact button should work properly
     * This test method verify successfully click in the help and contact button and landed on the "customer service" page
     */
    //8
    public static void checkCustomerServiceLinkFunctionality() throws InterruptedException {
        //user should be able to successfully landed in the Ebay homepage
        Thread.sleep(2000);
        //user should be able to click on Help & Contact link
        driver.findElement(By.xpath("//a[@href='https://ocsnext.ebay.com/ocs/home']")).click();
        Thread.sleep(2000);
        actualText = driver.findElement(By.xpath("//td[@id='gh-title']")).getText();
        //user should be able to see Customer Service page display
        Thread.sleep(2000);
        String expectedText = "Customer Service";
        if (actualText.equals(expectedText)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
        }
        Thread.sleep(1000);
        driver.close();
    }

    /**
     * user should be able to get product from Advanced Search link
     */
    //9
    public static void eBayHomePageAdvancedSearchFunctionality() throws InterruptedException {
        //Scenario: eBay's Home page "Advance" link Functionality Checking
        //Given user on amazon Home page
        //user should be able to click on Advanced Search link on top of the ebay's home page right corner
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='gh-as-a']")).click();
        Thread.sleep(3000);
        //user should be able to enter/type in edit box (Wedding dress)
        driver.findElement(By.xpath("//*[@id=\"_nkw\"]")).sendKeys("Wedding dress");
        Thread.sleep(1000);
        //user should be able to enter/type in edit box (Red)
        driver.findElement(By.xpath("//input[@id='_ex_kw']")).sendKeys("Red");
        Thread.sleep(1000);
        //user should be able to click on search button
        driver.findElement(By.cssSelector("#adv_search_from > fieldset:nth-child(2) > div.adv-s.mb.space-top > button")).click();
        Thread.sleep(1000);
        //user should be able to select checkBox size (As L)
        driver.findElement(By.id("e1-29")).click();
        Thread.sleep(2000);
        //user should be able to select Sleeve Length checkBox(As Long Sleeve)
        driver.findElement(By.id("e1-41")).click();
        Thread.sleep(2000);
        //user should be able to click on the selected link
        driver.findElement(By.cssSelector("#item44aa224953 > h3 > a")).click();
        Thread.sleep(2000);
        //user should be able to click on "Add to Cart"
        driver.findElement(By.xpath("//*[@id=\"atcRedesignId_btn\"]")).click();
        // Verification
        //user should not be able to see pop up window display (Continue without personalizing)
        String expectedText = "Continue without personalizing?";
        // user should be able to see error message display
        Thread.sleep(2000);
        String actualText = driver.findElement(By.cssSelector("#CUSTOMIZATION0-0-12-0-dialog-title > span")).getText();

        Assert.assertEquals(actualText, expectedText, "popup window not displayed");

        Thread.sleep(1000);
        driver.close();
    }


    /**
     * @throws InterruptedException
     */
    //10
    public static void eBayHomePageCartIconFunctionality() throws InterruptedException {
        //Scenario: eBay's Home page "shopping Cart Icon" link Functionality Checking
        //Given user on amazon Home page
        //user should be able to click on shopping Cart Icon
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@aria-label='Your shopping cart']//*[name()='svg']")).click();
        Thread.sleep(2000);
        //user should be able to click on shopping Cart Icon
        String expectedText = "You don't have any items in your cart.";
        // user should be able to see error message display
        Thread.sleep(1000);
        String actualText = driver.findElement(By.xpath("//div[@class='font-title-3']//span//span//span")).getText();

        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        driver.close();

    }

    /**
     * should navigate and display a massage when search with invalid product item
     */


   //11
    public static void checkSearchBoxFunctionalityWithInvalidProduct() throws InterruptedException {
        //Scenario: eBay's Home page "shopping Cart Icon" link Functionality Checking
        //Given user on amazon Home page
        // user is able to successfully landed in ebay's home page
        Thread.sleep(2000);
        // user should be able to enter valid product in searchBox field
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("kdfgjdkfhgksdjgh");
        // user should be able to click on search button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        Thread.sleep(2000);
        //user should be able to click on shopping Cart Icon
        String expectedText = "No exact matches found";
        // user should be able to see error message display
        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath("//h3[@class='srp-save-null-search__heading']")).getText();

        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        driver.close();

    }

    /**
     * should display valid product
     */
   //12
    public static void checkSearchBoxFunctionalityWithValidProductOnEbay() throws InterruptedException {

        // user is able to successfully landed in ebay's home page
        Thread.sleep(2000);
        // user should be able to enter valid product in searchBox field
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("home decoration");
        // user should be able to click on search button
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        Thread.sleep(2000);
        // user should be able to click on Home Décor link
        driver.findElement(By.className("a-icon a-icon-checkbox")).click();
        Thread.sleep(2000);
        // user should be able to click on "Floral & Garden" checkBox
        driver.findElement(By.xpath("//input[@aria-label='Floral & Garden']")).click();
        Thread.sleep(2000);
        // user should be able to click on "Office" checkBox
        driver.findElement(By.xpath("//input[@aria-label='Office']")).click();
        // Verification
        //user should be able to see the page display with results for home decoration
        String expectedText = "results for home decoration";
        String actualText = driver.findElement(By.id("//*[@id=\"mainContent\"]/div[1]/div/div[2]/div[1]/div[1]/h1")).getText();
        //successfully navigate to result page
        System.out.println("Actual Text : " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found ");
        Thread.sleep(1000);
        driver.close();
    }


    /**
     * This Method will verify Toy link in EBay's Home page Header section
     * Custom Xpath
     * Author:Tahmina
     */

    //13
    public static void checkToyLinkFunctionality() throws InterruptedException {
        Thread.sleep(2000);
        //user should be able to click on Toy in eBay's header section
        driver.findElement(By.xpath("//*[@class='hl-cat-nav__js-tab' and @data-currenttabindex='5']")).click();
        //click on Toy in eBay's Baby toy From shop by category
        driver.findElement(By.xpath("//*[@id='s0-17-12-0-1[0]-0-0-27[1]-0-toggle-button']")).click();
        //user should be able to click on Crib Toys from drop down list
        driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Crib-Toys/100226/bn_2310055']")).click();
        Thread.sleep(2000);
        //user should be able to click on Developmental Baby Toys
        driver.findElement(By.xpath("//a[@_sp='p2489527.m4337.l9750.c6']")).click();
        Thread.sleep(2000);
        // Verification
        //user should be able to see the page display with Developmental Toys for Babies
        String expectedText = "Developmental Toys for Babies";
        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath("//*[@class='b-pageheader']")).getText();
        //successfully navigate to result page
        System.out.println("Actual Text :" + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found");

    }

    /**
     * This Method will verify Security center functionality in Footer Section
     * Custom Xpath
     * Author: Tahmina
     */
    //14
    public static void checkSecurityCenter() throws InterruptedException {
        Thread.sleep(3000);
        //user should be able to click on Security center functionality in Footer Section
        driver.findElement(By.xpath("//a[@href='https://pages.ebay.com/securitycenter/index.html'and@class='thrd']")).click();
        //user should be able to click on Protect Your Account Information button
        Thread.sleep(4000);
        driver.findElement(By.xpath("//a[@href='https://pages.ebay.com/securitycenter/protect_your_information.html#protect_account_info']")).click();
        Thread.sleep(4000);
        //user should be able to click on Read more
        driver.findElement(By.xpath("//div[@id='protect_account_info']//div[@class='wrapper']")).click();
        Thread.sleep(1000);
        //user should be able to click on Collapse
        driver.findElement(By.xpath("//div[@id='protect_account_info']//div[@class='wrapper']")).click();
        // Verification
        //user should be able to see the page display with Security Center
        String expectedText = "Security Center";
        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath("//*[@id='security_nav_title']")).getText();
        //successfully navigate to result page
        System.out.println("Actual Text :" + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found");
    }

    /**
     * This method will verify user should be able to select checkBox Functionality
     * Custom Xpath
     * Author:Tahmina
     */
    //15
    public static void checkBoxFunctionality() throws InterruptedException {
        //Scenario: eBay's Home page search box Functionality Checking
        //user should be able to successfully landed in the Ebay homepage
        //user is able to enter valid product name in the search box
        driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("airpods pro");
        Thread.sleep(2000);
        //user is able to click non the search button
        driver.findElement(By.xpath("//input[@id='gh-btn']")).click();
        Thread.sleep(1000);
        // user should be able to select checkBox Brand name as Apple
        driver.findElement(By.xpath("//input[@aria-label='Apple']")).click();
        Thread.sleep(2000);
        // user should be able to select checkBox Connectivity as BlueTooth
        driver.findElement(By.xpath("(//input[@aria-label='Bluetooth'])[1]")).click();
        Thread.sleep(4000);
        // user should be able to select checkBox Country/Region of Manufacture
        driver.findElement(By.xpath("//input[@aria-label='Japan'][1]")).click();
        Thread.sleep(4000);
        // user should be able to input Minimum value in Price Section
        driver.findElement(By.xpath("//input[@aria-label='Minimum Value in $']")).sendKeys("200");
        Thread.sleep(4000);
        // user should be able to input Maximum value in Price Section
        driver.findElement(By.xpath("//input[@aria-label='Maximum Value in $']")).sendKeys("407.03");
        Thread.sleep(2000);
        //user should be able to select Item Location from drop down list
        driver.findElement(By.xpath(" //*[@id='s0-50-12-0-1-2-6-0-17[1[5]]-1-0-_select']/option[6]")).click();
        Thread.sleep(1000);
        // Verification
        //user should be able to see the page display with search result for airPods
        String expectedText = "1 result for airpods pro";
        Thread.sleep(2000);
        String actualText = driver.findElement(By.xpath("//h1[@class='srp-controls__count-heading']")).getText();
        //successfully navigate to result page
        System.out.println("Actual Text: " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found");

    }

    /**
     * this method will use for Mouse Hover
     * Custom Xpath
     * Author:Tahmina
     */
    //16
    public void collectiblesAndArtElement() throws InterruptedException {
        //Given user on amazon Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Collectibles & Art link on eBay's Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Collectibles & Art')]"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        //actions.click().build().perform();  //if the same link need to be clicked after mouse hover than use this method.
        // user should be able to click on Art Paintings link (Inside Collectibles & Art link)
        driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Art-Paintings/551/bn_2310891']")).click();
        //user should be able to click on arrow icon to navigate to next page (bottom of the home page)
        driver.findElement(By.xpath("//a[@class='pagination__next icon-link']")).click();
        Thread.sleep(3000);
        // Verification
        //user should be able to see the page display Paintings
        String expectedText = "Paintings";
        Thread.sleep(3000);
        String actualText = driver.findElement(By.xpath("//h1[text()='Paintings']")).getText();
        //successfully navigate to result page
        System.out.println("Actual Text: " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found");
        driver.close();
    }

    /**
     * This Method will navigate from Chrome browser Yahoo browser
     * Custom Xpath
     * Author:Tahmina
     */
    //17
    public static void navigateToYahoo() throws InterruptedException {
        //Given user on Chrome browser amazon Home page
        Thread.sleep(4000);
        //navigate To successfully landed Yahoo home page
        driver.navigate().to("https://www.yahoo.com/");
        //user is able to input data in the search box
        driver.findElement(By.xpath("//input[@id='ybar-sbq']")).sendKeys("Bangladesh");
        //user is able to click on search button
        driver.findElement(By.xpath("//input[@id='ybar-search']")).click();
        Thread.sleep(3000);
        //user is able to navigate backward
        driver.navigate().back();
        Thread.sleep(5000);
        //user is able to navigate forward
        driver.navigate().forward();
        Thread.sleep(5000);
        //user is able to refresh the page
        driver.navigate().refresh();
        //user is able to clear search bar data
        driver.findElement(By.xpath("//input[@id='yschsp']")).clear();
        //user is able to input new data in the search box
        driver.findElement(By.xpath("//input[@id='yschsp']")).sendKeys("Bangladesh Wikipedia");
        //user is able to click on the search button
        driver.findElement(By.xpath("//input[@value='Search']")).click();
        driver.findElement(By.xpath("(//a[@class=' d-ib ls-05 fz-20 lh-26 td-hu tc va-bot mxw-100p'and@data-matarget='algo'])[1]")).click();
        Thread.sleep(5000);
        //user should be able to see Bangladesh Wikipedia page displayed
        String expectedText = "Bangladesh";
        Thread.sleep(5000);
        //String actualText = driver.findElement(By.xpath("//h1[@id='firstHeading'and @class='firstHeading mw-first-heading']")).getText();
        String actualText = driver.findElement(By.xpath("(//*[text()='Bangladesh'])[1]")).getText();
        //successfully navigate to result page
        System.out.println("Actual Text: " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found");
        Thread.sleep(1000);
        driver.close();
    }

    /**
     * Clothing & Accessories link on eBay's Home page
     * Custom Xpath
     * Author:Tahmina
     */
    //18
    public void clothingAndAccessoriesElement() throws InterruptedException {
        //Given user on amazon Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Clothing & Accessories link on eBay's Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//li[@data-currenttabindex='4']//a[contains(text(),'Clothing & Accessories')]"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Women’s Accessories link (Inside Clothing & Accessories link)
        driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Womens-Accessories/4251/bn_1519247'and@class='hl-cat-nav__js-link']")).click();
        Thread.sleep(3000);
         //user should be able to click on Sunglasses & Sunglasses Accessories link
        driver.findElement(By.xpath("//p[contains(text(),'Sunglasses & Sunglasses Accessories')]")).click();
        Thread.sleep(5000);
        // user should be able to click on Gucci from Shop by Brand section
        driver.findElement(By.xpath("//p[contains(text(),'Gucci')]")).click();
        Thread.sleep(4000);
        //Verification
        //user should be able to see Gucci Sunglasses & Sunglasses Accessories for Women page displayed
        String expectedText = "Gucci Sunglasses & Sunglasses Accessories for Women";
        Thread.sleep(4000);
       // String actualText = driver.findElement(By.xpath("//span[contains(text(),'Gucci Sunglasses & Sunglasses Accessories for Women')]")).getText();
        String actualText = driver.findElement(By.xpath("(//h1[@class='b-pageheader'])[1]")).getText();
        Thread.sleep(5000);
        //successfully navigate to result page
        System.out.println("Actual Text: " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found");

    }

    /**
     * ssories link on eBay's Home page
     * Custom Xpath
     * Author:Tahmina
     */
   //19
    public void bestMatchDropDownFunctionality() throws InterruptedException {
        //Given user on amazon Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Clothing & Accessories link on eBay's Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//li[@data-currenttabindex='4']//a[contains(text(),'Clothing & Accessories')]"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Women’s Accessories link (Inside Clothing & Accessories link)
        driver.findElement(By.xpath("//a[@href='https://www.ebay.com/b/Womens-Accessories/4251/bn_1519247'and@class='hl-cat-nav__js-link']")).click();
        Thread.sleep(4000);
        // user should be able to click on Handbag Accessories link
        driver.findElement(By.xpath("//a[contains(text(),'Handbag Accessories')]")).click();
        Thread.sleep(4000);
        // user should be able to click on Best Match dropdown list
        driver.findElement(By.xpath("//button[@aria-label='Sort: Best Match']")).click();
        Thread.sleep(4000);
        // user should be able to select newly listed item from drop down list
        driver.findElement(By.xpath("//*[text()='Time: newly listed']")).click();
        Thread.sleep(6000);
        //Verification
        //user should be able to see Women's Handbag Accessories page displayed
        String expectedText = "Women's Handbag Accessories";
        Thread.sleep(4000);
        String actualText = driver.findElement(By.xpath("//span[@class='b-pageheader__text']")).getText();
        Thread.sleep(5000);
        //successfully navigate to Women's Handbag Accessories page
        System.out.println("Actual Text: " + actualText);
        Assert.assertEquals(actualText, expectedText, "text not found");
    }


    @Test
    public void jewelryWatchesFunctionality() throws InterruptedException {
        //Given user on amazon Home page
        Thread.sleep(2000);
        // user can hover the mouse of top of the Jewelry & Watches link top of the eBay's Home page
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Jewelry & Watches')]"));
        Thread.sleep(3000);
        //for mouse Hover method
        actions.moveToElement(element).perform();
        // user should be able to click on Rolex from the Top Brands section
        driver.findElement(By.xpath("//a[contains(text(),'Rolex')and@href='https://www.ebay.com/b/Rolex-Watches/31387/bn_2989578']")).click();
        Thread.sleep(3000);
        // user should be able to click on Price Dropdown arrow middle of the Rolex Watches page
        driver.findElement(By.xpath("//span[contains(text(),'Price')]")).click();
        Thread.sleep(6000);
        // user should be able to select Price ranges from price list in Dropdown arrow (under $7,500.00)
        driver.findElement(By.xpath("//span[@xpath='1']")).click();
        Thread.sleep(4000);
////Verification
//        //user should be able to see Rolex Watches under $7,500.00 displayed
//        String expectedText = "Rolex Watches under $7,500.00";
//        Thread.sleep(4000);
//        String actualText = driver.findElement(By.xpath("")).getText();
//        Thread.sleep(5000);
//        //successfully navigate to Rolex Watches under $7,500.00 page
//        System.out.println("Actual Text: " + actualText);
//        Assert.assertEquals(actualText, expectedText, "text not found");


    }


}


