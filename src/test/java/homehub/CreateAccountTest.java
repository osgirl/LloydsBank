package homehub;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CreateAccountPage;

public class CreateAccountTest extends BeforeAndAfterMethods{

    //this only works with a new account that is never used before
    @Test
    public void createAccountTest(){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.createAccountTest("Tinus", "de", "Tester", "01-01-1980", "0612345678", "dennisvanrossum+95@gmail.com", "Weetniemand1!", "Weetniemand1!");

        String assertString = driver.findElement(By.className("page-title")).getText();
        Assert.assertEquals("LOG IN", assertString);
        System.out.println("The signIn page appears, so the account has been successfully created");

    }

}
