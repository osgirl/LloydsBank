package homehub;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CompleteApplicationOptionTwoTest extends BeforeAndAfterMethods {

    @Test
    public void completeApplicationOptionTwoTest(){

        driver.findElement(By.linkText("/aanvraag/account/loginstep1")).click();



    }
}
