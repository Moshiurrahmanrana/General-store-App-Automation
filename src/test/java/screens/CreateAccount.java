package screens;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class CreateAccount {
    @FindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    AndroidElement selectCountry;
    @FindBy(id = "com.androidsample.generalstore:id/nameField")
    AndroidElement nameBox;
    @FindBy(id = "com.androidsample.generalstore:id/radioMale")
    AndroidElement selectGender;
    @FindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    AndroidElement letsShop;

//    AndroidDriver driver;

    public CreateAccount(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectIdentity() throws InterruptedException, IOException {
//        selectCountry.click();
//        Thread.sleep(2000);
//        nameBox.sendKeys("moshiur");
        selectGender.click();
        letsShop.click();
    }
}
