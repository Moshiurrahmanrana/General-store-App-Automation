package testRunner;

import base.Setup;
import org.testng.annotations.Test;
import screens.CreateAccount;

public class CreateAccountTest extends Setup {
    @Test
    public void runTest() throws InterruptedException {
        CreateAccount testCase = new CreateAccount(driver);
        testCase.selectIdentity();
    }
}
