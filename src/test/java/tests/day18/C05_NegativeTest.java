package tests.day18;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.Hotelmycamp;
import utilities.ConfigReader;
import utilities.Driver;

public class C05_NegativeTest {

    //NegativeTest 3 Farkli test Methodunda 3 senaryoyu test et
    //- yanlisSifre
    //- yanlisKulllanici
    //- yanlisSifreKullanici
    //test data yanlis username: manager1 , yanlis password : manager1
    //2) https://www.hotelmycamp.com adresine git
    //3) Login butonuna bas
    //4) Verilen senaryolar ile giris yapilamadigini test et

    //test data username: manager ,
    //test data password : Manager1!

    SoftAssert softAssert=new SoftAssert();

    @Test
    public void yanlisKulllanici() {

        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        Hotelmycamp hotelmycamp=new Hotelmycamp();
        hotelmycamp.login.click();
        hotelmycamp.userName.sendKeys("manager1");
        hotelmycamp.password.sendKeys("Manager1!");

        hotelmycamp.log.click();
        softAssert.assertTrue(hotelmycamp.tryAgain.isDisplayed());

    }

    @Test
    public void yanlisSifre() {

        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        Hotelmycamp hotelmycamp=new Hotelmycamp();
        hotelmycamp.login.click();
        hotelmycamp.userName.sendKeys("manager");
        hotelmycamp.password.sendKeys("manager1");

        hotelmycamp.log.click();

        softAssert.assertTrue(hotelmycamp.tryAgain.isDisplayed());

    }

    @Test
    public void yanlisSifreKullanici() {

        Driver.getDriver().get(ConfigReader.getProperty("hotelmycamp"));
        Hotelmycamp hotelmycamp=new Hotelmycamp();
        hotelmycamp.login.click();
        hotelmycamp.userName.sendKeys("manager1");
        hotelmycamp.password.sendKeys("manager1");
        hotelmycamp.log.click();

        softAssert.assertTrue(hotelmycamp.tryAgain.isDisplayed());

    }
}
