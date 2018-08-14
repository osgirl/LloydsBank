package homehub;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BeforeAndAfterMethods {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginTest("dennisvanrossum+21@gmail.com", "Weetniemand1!");

        String assertString = driver.findElement(By.id("logoutForm")).getText();
        Assert.assertEquals("UITLOGGEN", assertString);
        System.out.println("The SMS page appears, so the user has logged in and need to give his SMS code");
    }
}
