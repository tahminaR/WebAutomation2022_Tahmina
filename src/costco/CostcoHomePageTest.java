package costco;


import org.testng.annotations.Test;


public class CostcoHomePageTest extends CostcoHomePage {
    //Test Class: where we will call all the action Method
    @Test //1
    public void testCreateAccount() throws InterruptedException {
        createAccount();
    }

    @Test //2
    public void testSignInFunctionalityWithValidCredentials() throws InterruptedException {
        signInFunctionalityWithValidCredentials();
    }

    @Test //3
    public void testSignInFunctionalityWithInValidCredentials() throws InterruptedException {
        signInFunctionalityWithInValidCredentials();
    }

    @Test //4
    public void testSignOutFunctionality() throws InterruptedException {
        signOutFunctionality();
    }

    @Test //5
    public void testGroceryWebElement() throws InterruptedException {
        groceryWebElement();

    }


}
