package tests.Calisma;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseBeforeClassAfterClass;
import utilities.TestBaseBeforeMethodAfterMethod;

public class C02_DependsOnTest extends TestBaseBeforeClassAfterClass {

    //● Bir class oluşturun: DependsOnTest
    //● https://www.amazon.com/ adresine gidin.
    //1. Test : Amazon ana sayfaya gittiginizi test edin
    //2. Test : 1.Test basarili ise search Box’i kullanarak “Nutella” icin
    //arama yapin ve aramanizin gerceklestigini Test edin
    //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
    //$16.83 oldugunu test edin

    /*
      DependsOnMethods test method'larinin calisma siralamasina karismaz
      Sadece bagli olan test, baglandigi testin sonucuna bakar
      baglandigi test PASSED olmazsa, baglanan test hic calismaz(ignore)
     */

    SoftAssert softAssert = new SoftAssert();

    @Test(priority = -1)
    public void test01() {
        //1. Test : Amazon ana sayfaya gittiginizi test edin
        driver.get("https://www.amazon.com");
        Assert.assertTrue(driver.getCurrentUrl().contains("amazon"));
    }

    @Test(dependsOnMethods = "test01")
    public void test02() {


        //search Box’i kullanarak “Nutella” icin
        //arama yapin ve aramanizin gerceklestigini Test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        WebElement result = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(result.isDisplayed(), "Sonuc görüntülenemedi");

        //6-arama sonucunun Nutella içerdigini test edin
        softAssert.assertTrue(result.getText().contains("Nutella"), "Nutella içermiyor");
        softAssert.assertAll();

    }

    @Test(dependsOnMethods = "test02")
    public void test03() {

        //3.Test : “Nutella” icin arama yapildiysa ilk urunu tiklayin ve fiyatinin
        //$16.83 oldugunu test edin
        driver.findElement(By.xpath("//*[@data-image-index='14']")).click();
        WebElement price = driver.findElement(By.xpath("//td[@class='a-color-secondary a-size-base a-text-right a-nowrap']"));
        String expectedPrice = "$16.83";
        softAssert.assertTrue(price.getText().equals(expectedPrice), "Fiyat farklidir");


    }
}