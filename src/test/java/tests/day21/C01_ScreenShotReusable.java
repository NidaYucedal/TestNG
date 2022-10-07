package tests.day21;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C01_ScreenShotReusable {

    @Test
    public void test01() throws IOException {
        // hepsiburada sayfasina gidip fotografini cekelim
        Driver.getDriver().get(ConfigReader.getProperty("hepsi"));
        ReusableMethods.getScreenshot("hepsiburada");
        Driver.closeDriver();
    }

    @Test
    public void test02() throws IOException {

        //amazona gidin
        Driver.getDriver().get(ConfigReader.getProperty("amznUrl"));
        AmazonPage amazonPage=new AmazonPage();
        //nutella aratın
        amazonPage.aramaKutusu.sendKeys("Nutella", Keys.ENTER);
        //arama sonus yazısı webelementin resmini alınız
        ReusableMethods.getScreenshotWebElement("aramaSonucElementi",amazonPage.aramaSonucWE);


    }
}



