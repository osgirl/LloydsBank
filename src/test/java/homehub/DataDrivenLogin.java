package homehub;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;

public class DataDrivenLogin extends BeforeAndAfterMethods {

    @Parameters({"gebruikersnaam", "wachtwoord"})
    @Test
    public void loginTest (String gebruikersnaam, String wachtwoord){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginTest(gebruikersnaam, wachtwoord);
    }
}
