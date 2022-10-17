package testRunner;

import base.Setup;
import org.testng.annotations.Test;
import screens.ShoppingCart;

public class AddToCartTest extends Setup {
    @Test
    public void runTest() {
        ShoppingCart testCase = new ShoppingCart(driver);
        testCase.addToCart();
    }
}
