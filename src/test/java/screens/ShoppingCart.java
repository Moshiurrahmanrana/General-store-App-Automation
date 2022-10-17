package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class ShoppingCart extends Root {
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")
    AndroidElement selectProduct;
    @FindBy(id = "com.androidsample.generalstore:id/appbar_btn_cart")
    AndroidElement cart;
    @FindBy(id = "com.androidsample.generalstore:id/productName")
    AndroidElement productName;

    public ShoppingCart(AndroidDriver driver) {
        super(driver);
    }


    public void addToCart() throws InterruptedException {
        selectIdentity();
        selectProduct.click();
        cart.click();
    }
}
