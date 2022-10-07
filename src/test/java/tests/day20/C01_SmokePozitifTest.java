package tests.day20;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Hotelmycamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_SmokePozitifTest {


    @Test
    public void PozitifTest() {
        //https://www.hotelmycamp.com adresine git
        String url = ConfigReader.getProperty("hotelmycamp");
        Driver.getDriver().get(url);

        //login butonuna bas
        Hotelmycamp hotelmycamp = new Hotelmycamp();
        hotelmycamp.login.click();


        //test data username: manager ,
        //test data password : Manager1!
        hotelmycamp.userName.sendKeys(ConfigReader.getProperty("username"));
        hotelmycamp.password.sendKeys(ConfigReader.getProperty("password"));
        hotelmycamp.log.click();


        // Actions actions = new Actions(Driver.getDriver());
        //        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("password"))
        //                .sendKeys(Keys.ENTER).perform();

        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        String actualUsername = hotelmycamp.manager.getText();
        String expectedUsername = ConfigReader.getProperty("manager");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualUsername, expectedUsername, "icermiyor");

        Driver.closeDriver();

    }
}