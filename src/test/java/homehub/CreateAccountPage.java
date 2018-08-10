package homehub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {

    private final WebDriver driver;

    private By goToAccountPage = By.xpath("//div/a[2]");
    private By fillInFirstName = By.id("FirstName");
    private By fillInInsertion = By.id("Insertion");
    private By fillInLastName = By.id("LastName");
    private By fillInDateOfBirth = By.id("BirthDate");
    private By fillInPhoneNumber = By.id("PhoneNumberMobile");
    private By fillInEmail = By.id("EmailAddressUserName");
    private By fillInPassword = By.id("Password");
    private By confirmPassword = By.id("ConfirmPassword");
    private By noContactFromLloyds = By.cssSelector("[value='false']");
    private By submitPage = By.cssSelector("[type='submit']");

    public CreateAccountPage (WebDriver driver){
        this.driver = driver;
    }

    public void createAccountTest(String voornaam, String tussenvoegsel, String achternaam, String geboortedatum, String mobielnummer, String email, String wachtwoord, String bevestigwachtwoord){
        driver.findElement(goToAccountPage).click();
        driver.findElement(fillInFirstName).sendKeys(voornaam);
        driver.findElement(fillInInsertion).sendKeys(tussenvoegsel);
        driver.findElement(fillInLastName).sendKeys(achternaam);
        driver.findElement(fillInDateOfBirth).sendKeys(geboortedatum);
        driver.findElement(fillInPhoneNumber).sendKeys(mobielnummer);
        driver.findElement(fillInEmail).sendKeys(email);
        driver.findElement(fillInPassword).sendKeys(wachtwoord);
        driver.findElement(confirmPassword).sendKeys(bevestigwachtwoord);
        driver.findElement(noContactFromLloyds).click();
        driver.findElement(submitPage).click();


    }


}
