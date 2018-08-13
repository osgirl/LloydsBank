package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private By goToLoginPage = By.xpath("//div/a[3]");
    private By fillInUserName = By.id("UserName");


}
