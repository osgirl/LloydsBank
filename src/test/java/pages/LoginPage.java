package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private final WebDriver driver;

    private By goToLoginPage = By.xpath("//div/a[3]");
    private By fillInUserName = By.id("UserName");
    private By fillInPassword = By.id("Password");
    private By submitPage = By.cssSelector("[type='submit']");

    public LoginPage (WebDriver driver) {this.driver = driver;}

    public void loginTest(String gebruikersnaam, String wachtwoord){
        driver.findElement(goToLoginPage).click();
        driver.findElement(fillInUserName).sendKeys(gebruikersnaam);
        driver.findElement(fillInPassword).sendKeys(wachtwoord);
        driver.findElement(submitPage).click();
    }


}
