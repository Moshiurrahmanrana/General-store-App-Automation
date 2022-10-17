package testRunner;

import base.Setup;
import org.testng.annotations.Test;
import screens.CreateAccount;

import java.io.IOException;

public class CreateAccountTest extends Setup {
    @Test
    public void runTest() throws IOException, InterruptedException {
        CreateAccount testCase = new CreateAccount(driver);
        testCase.selectIdentity();
    }
}
