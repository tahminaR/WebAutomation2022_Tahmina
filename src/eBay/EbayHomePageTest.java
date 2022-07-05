package eBay;


import org.testng.annotations.Test;


public class EbayHomePageTest extends EbayHomePage {
    //Test Class: where we will call all the action Method


    @Test(enabled = false) //1
    public void testCheckShopByCategoryLinkFunctionality() throws InterruptedException {
        checkShopByCategoryLinkFunctionality();
        System.out.println("Shop By Category Link Functionality successfully done");
    }

    @Test(enabled = false) //2
    public void testCheckEbaySearchBoxFunctionality() throws InterruptedException {
        checkEbaySearchBoxFunctionality();
    }

    @Test(enabled = false) //3
    public void testCheckEbayRemovedButtonFunctionality() throws InterruptedException {
        checkEbayRemovedButtonFunctionality();
    }


    @Test(enabled = false) //4
    public void testItemPageMissing() throws InterruptedException {
        itemPageMissing();
    }

    @Test(enabled = false) //5
    public void testShoppingCartFunctionality() throws InterruptedException {
        shoppingCartFunctionality();
    }

    @Test(enabled = false) //6
    public void testCheckEbaySignInFunctionalityWithInvalidCredential() throws InterruptedException {
        checkEbaySignInFunctionalityWithInvalidCredential();

    }

    @Test(enabled = false) //7
    public void testCheckEbaySignInFunctionalityWithValidCredential() throws InterruptedException {
        checkEbaySignInFunctionalityWithValidCredential();
    }

    @Test(enabled = false) //8
    public void testCheckCustomerServiceLinkFunctionality() throws InterruptedException {
        checkCustomerServiceLinkFunctionality();
    }

    @Test(enabled = false) //9
    public void testEbayHomePageAdvancedSearchFunctionality() throws InterruptedException {
        eBayHomePageAdvancedSearchFunctionality();
    }

    @Test(enabled = false) //10
    public void testEbayHomePageCartIconFunctionality() throws InterruptedException {
        eBayHomePageCartIconFunctionality();
    }

    @Test(enabled = false)//11
    public void testCheckSearchBoxFunctionalityWithInvalidProduct() throws InterruptedException {
        checkSearchBoxFunctionalityWithInvalidProduct();
    }

    @Test(enabled = false) //12
    public void testCheckSearchBoxFunctionalityWithValidProductOnEbay() throws InterruptedException {
        checkSearchBoxFunctionalityWithValidProductOnEbay();
    }

    @Test //Custom Xpath 13
    public void testCheckToyLinkInTheHeaderSection() throws InterruptedException {
        checkToyLinkFunctionality();
    }

    @Test //Custom Xpath 14
    public void testCheckSecurityCenter() throws InterruptedException {
        checkSecurityCenter();
    }

    @Test //Custom Xpath 15
    public void testCheckBoxFunctionality() throws InterruptedException {
        checkBoxFunctionality();
    }

    @Test //Custom Xpath 16
    public void testCollectiblesAndArtElement() throws InterruptedException {
        collectiblesAndArtElement();
    }

    @Test //Custom Xpath 17
    public void testNavigateToYahoo() throws InterruptedException {
        navigateToYahoo();
        System.out.println("Yahoo navigation successfully done");
    }

    @Test //Custom Xpath 18
    public void testClothingAndAccessoriesElement() throws InterruptedException {
        clothingAndAccessoriesElement();
    }

    @Test //Custom Xpath 19
    public void testBestMatchDropDownFunctionality() throws InterruptedException {
        bestMatchDropDownFunctionality();
    }

    @Test // Xpath 20
    public void textJewelryWatchesFunctionality() throws InterruptedException {
        jewelryWatchesFunctionality();
    }

    @Test //Xpath  21
    public void testVerifyAllCategoriesFunctionality() throws InterruptedException {
        VerifyAllCategoriesFunctionality();
    }


}
