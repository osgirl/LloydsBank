package homehub;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//this class opens and closes the mijnhypotheek page
public class BeforeAndAfterMethods {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp(){
        //currently only with just a ChromeDriver
        ChromeDriverManager.getInstance().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        //driver.get("https://www.lloydsbank.nl/");
        //driver.findElement(By.xpath("//div/div[3]/a[@role='button']")).click();
        //driver.findElement(By.xpath("//div/div[1]/a[@role='button']")).click();

        //this will switch the driver to the newly opened tab
        //for(String winHandle : driver.getWindowHandles()){
          //  driver.switchTo().window(winHandle);

        //or go directly to the test environment
        driver.get("https://mijnaanvraag-lloydsbank-te27.stater.com/");
        //driver.get("https://www.google.nl");


    }

    @AfterMethod
    public void tearDown(){
        //driver.quit();

    }
}
