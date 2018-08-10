package homehub;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DataDrivenCreateAccount extends BeforeAndAfterMethods {

    @Parameters({"Voornamen", "Tussenvoegsel", "Achternaam", "Geboortedatum", "Mobiel nummer", "email", "Wachtwoord", "Bevestig wachtwoord"})
    @Test
    public void createAccountTest(String voornaam, String tussenvoegsel, String achternaam, String geboortedatum, String mobielnummer, String email, String wachtwoord, String bevestigwachtwoord){
        CreateAccountPage createAccountPage = new CreateAccountPage(driver);
        createAccountPage.createAccountTest(voornaam, tussenvoegsel, achternaam, geboortedatum, mobielnummer, email, wachtwoord, bevestigwachtwoord);
    }

}
