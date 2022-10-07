package tests.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;
import utilities.TestBaseCross;

public class C02_HardAssert extends TestBaseCross {

    @Test
    public void test01(){

        //1-amazon anasayfaya gidin
        //2-title in Amazon içerdigini test edin
        //3-arama kutusnun erişilebilir oldugunu tets edin
        //4-arama kutusuna Nuella yazıp aratın
        //5-arama yapıldıgını test edin
        //6-arama sonucunun Nutella içerdigini test edin

        driver.get("https://amazon.com");
        Assert.assertTrue(driver.getTitle().contains("Amazon"));
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(aramaKutusu.isEnabled());
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        WebElement sonuc = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(sonuc.isDisplayed());
        Assert.assertTrue(sonuc.getText().contains("Nutella"));

    }


}
