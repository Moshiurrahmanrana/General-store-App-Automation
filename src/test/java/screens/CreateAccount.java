package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount extends Root {
    @FindBy(id = "com.androidsample.generalstore:id/spinnerCountry")
    AndroidElement box;
    @FindBy(xpath = "//android.widget.TextView[@text='Albania']")
    public AndroidElement selectCountry;
    @FindBy(id = "com.androidsample.generalstore:id/nameField")
    AndroidElement nameBox;
    @FindBy(id = "com.androidsample.generalstore:id/radioMale")
    AndroidElement selectGender;
    @FindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    AndroidElement letsShop;

    public CreateAccount(AndroidDriver driver) {
        super(driver);
    }

    public void selectIdentity() throws InterruptedException {
        box.click();
        Thread.sleep(2000);
        selectCountry.click();
        Thread.sleep(1000);
        nameBox.sendKeys("moshiur");
        selectGender.click();
        letsShop.click();
    }
}
