package screens;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Root {
    @FindBy(id = "com.androidsample.generalstore:id/nameField")
    AndroidElement nameBox;
    @FindBy(id = "com.androidsample.generalstore:id/radioMale")
    AndroidElement selectGender;
    @FindBy(id = "com.androidsample.generalstore:id/btnLetsShop")
    AndroidElement letsShop;


    public Root(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void selectIdentity() throws InterruptedException {
        nameBox.sendKeys("moshiur");
        selectGender.click();
        letsShop.click();
    }
}
