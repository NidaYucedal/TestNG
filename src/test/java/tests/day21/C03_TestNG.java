package tests.day21;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HepsiPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.IOException;

public class C03_TestNG {

    HepsiPage hepsiPage;

    JavascriptExecutor js=(JavascriptExecutor) Driver.getDriver();
    @Test
    public void hepsiBurada() throws IOException {

        // hepsiburada sayfasina gidip fotografini cekelim
        Driver.getDriver().get(ConfigReader.getProperty("hepsi"));

        hepsiPage=new HepsiPage();

        //cookie kabul et
        js.executeScript("arguments[0].click();", hepsiPage.cookie);


        // Elektronik altında bilgisayar/tablet altındaki tüm linkleri tıklayalım
        ReusableMethods.getActions().moveToElement(hepsiPage.electronics).perform();
        ReusableMethods.waitFor(1);
        ReusableMethods.getActions().moveToElement(hepsiPage.BilgiTab).perform();
        ReusableMethods.waitFor(1);


        // Her linkten sonra o sayfaya gittimizi test edelim ve o sayfanız resmini alalım
        int count = 1;
        for (int i = 0; i < hepsiPage.titles.size(); i++) {

            hepsiPage.titles.get(i).click();

            ReusableMethods.getActions().sendKeys(Keys.PAGE_DOWN).perform();
            ReusableMethods.waitFor(1);

            ReusableMethods.getScreenshot("ScreenShot" + count);
            count++;

            ReusableMethods.getActions().moveToElement(hepsiPage.electronics).perform();
            ReusableMethods.getActions().moveToElement(hepsiPage.BilgiTab).perform();
            ReusableMethods.waitFor(1);

        }

        // Sayfayı kapatalım
        Driver.closeDriver();
    }


}


