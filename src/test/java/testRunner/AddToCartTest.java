package testRunner;

import base.Setup;
import org.testng.annotations.Test;
import screens.ShoppingCart;

public class AddToCartTest extends Setup {
    @Test
    public void runTest() throws InterruptedException {
        ShoppingCart testCase = new ShoppingCart(driver);
        testCase.addToCart();
    }
}
