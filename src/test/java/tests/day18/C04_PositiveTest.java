package tests.day18;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Hotelmycamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_PositiveTest {

    //com.techproed altinda bir package olustur : smoketest
    //2) Bir Class olustur : PositiveTest
    //3) Bir test method olustur positiveLoginTest()
    //https://www.hotelmycamp.com adresine git
    //login butonuna bas
    //test data username: manager ,
    //test data password : Manager1!
    //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et


    @Test (groups = "gp2")
    public void test01() {

        //https://www.hotelmycamp.com adresine git
       String url= ConfigReader.getProperty("hotelmycamp");
       Driver.getDriver().get(url);

        //login butonuna bas
        Hotelmycamp hotelmycamp=new Hotelmycamp();
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
        String actualUsername= hotelmycamp.manager.getText();
        String expectedUsername=ConfigReader.getProperty("manager");
        SoftAssert softAssert=new SoftAssert();
        softAssert.assertEquals(actualUsername,expectedUsername,"icermiyor");

        Driver.closeDriver();

    }
}
