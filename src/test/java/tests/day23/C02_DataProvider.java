package tests.day23;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BrcPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_DataProvider {

    BrcPage brcPage;

    @DataProvider
    public static Object[][] kullanicilar() {
        return new Object[][]{{"nida@gmail.com","12345"},{"nid@gmail.com","123456"},{"yuce@gmail.com","132454"}};
    }

    @Test (dataProvider = "kullanicilar")
    public void test01(String userEmail,String password) {

        brcPage=new BrcPage();

        //https://www.bluerentalcars.com/ adresine git
        //login butonuna bas
        //Data provider ile 3 farklı userEmail ve 3 farklı password girelim
        //login butonuna tiklayin
        //Degerleri girildiginde sayfaya basarili sekilde girilemedigini test e


        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        brcPage.ilkLogin.click();
        brcPage.email.sendKeys(userEmail);
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.TAB).sendKeys(password).sendKeys(Keys.ENTER).perform();
        brcPage.ikinciLogin.click();

        Assert.assertTrue(brcPage.ikinciLogin.isDisplayed());


    }
}
