package tests.day22;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class C01_RaporluTest extends TestBaseRapor {

    /*
    -https://www.bluerentalcars.com/ adresine git
    -login butonuna bas
    -test data user email: customer@bluerentalcars.com ,
    -test data password : 12345 dataları girip login e basın
    -login butonuna tiklayin
    -Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */

    @Test
    public void test01() {

        BrcPage brcPage=new BrcPage();

        //-https://www.bluerentalcars.com/ adresine git
        //-login butonuna bas
        extentTest=extentReports.createTest("Pozitif Login","Gecerli username ve sifre ile giris yapabilmeli");
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc anasayfaya gidildi");
        ReusableMethods.waitFor(2);
        brcPage.ilkLogin.click();
        extentTest.info("login butonuna tiklandi");

        brcPage.email.sendKeys(ConfigReader.getProperty("userEmail"));
        extentTest.info("Valid email girildi");
        ReusableMethods.waitFor(2);
        brcPage.password.sendKeys(ConfigReader.getProperty("pass"));
        extentTest.info("Valid password girildi");

        brcPage.ikinciLogin.click();
        extentTest.info("Login butonuna basıldı");

        String actualUsername= brcPage.kullaniciProfil.getText();
        String expectedUsername=ConfigReader.getProperty("name");
        Assert.assertEquals(actualUsername,expectedUsername);
        extentTest.pass("Sayfaya başarılı bir şekilde giris yapıldı");

    }
}
