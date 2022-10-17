package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart extends Root {
    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")
    AndroidElement selectProduct;

    public ShoppingCart(AndroidDriver driver) {
        super(driver);
    }


    public void addToCart() throws InterruptedException {
        selectIdentity();
        selectProduct.click();
    }
}
